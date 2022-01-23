package ex11;

class 엔진 {
    int power = 5000;
}

// has 관계를 만드는 법 = 콤포지션
// 생성자로 주입 받기
class 소나타 {

    // has 관계 (침대-가구 extends는 is 관계 = 다형성이잖아!) => 소나타는 엔진에 의존적이다.
    // 구체적인 것에 의존하고 있는 강한 결합
    // 추상적인 것에 의존하고 있는 느슨한 결합(코드 수정이 필요없다.)
    엔진 engine;// null , 여기 초기화하면 개판난다. 다른거 받아 쓰려면 코드 수정 싹 해야하니까. 이것도 연습해보자
    // 바퀴 r;

    소나타(엔진 engine) { // 엔진 engine이라는 생성자를 만들어야 주입받을 수 있지
        this.engine = engine;
    }

}

public class CompositeEx01 {
    public static void main(String[] args) {
        엔진 e = new 엔진();
        소나타 s = new 소나타(e);
        System.out.println(s.engine.power);
    }
}
