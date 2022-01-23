package ex11;

class 가구 {
    String name = "가구";

    가구(int num) {
        System.out.println("나 실행돼?");
    }
}

// 디폴트 생성자도 만들어보면서 연습해보기
// 1. super는 부모의 heap 공간, this는 자신의 heap 공간
// 자식을 new 하면 자식의 생성자에 super() 문장이 생략되어 있음.
class 침대 extends 가구 {
    String name = "침대";

    침대() {
        super(1); // 이 문장이 항상 생략되어 있음. 내가 적으면 사라짐.
        System.out.println(super.name);
    }
}

// super 부모, this 자기자신 (가구의heap-super, 침대의heap-this)
public class SuperEx01 {
    public static void main(String[] args) {
        침대 s = new 침대();
    }
}
