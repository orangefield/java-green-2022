package ex07;

// 설계도
class 마법사 {
    int hp = 30;
    int mp = 100;

    // 행위 = 메서드
    // 1. 행위는 행위 안에 추가할 수 없다.
    // 2. 행위는 메서드 이름(){}로 만들어진다.
    void drink() {
        System.out.println("포션 마시기");
        hp = 100;
    }
}

public class OOPEx03 {
    public static void main(String[] args) {
        마법사 s1 = new 마법사();
        System.out.println("첫번째 마법사가 생성되었습니다");
        System.out.println("체력:" + s1.hp);
        System.out.println("마나:" + s1.mp);

        s1.drink(); // 메서드 호출(call)
        System.out.println("체력 변경:" + s1.hp);

        // 이 따위로 상태 변경하지 말고 행위를 통해 변경하라
        // s1.hp = 50;
        // System.out.println("체력 변경:" + s1.hp);

        마법사 s2 = new 마법사();
        System.out.println("두번째 마법사가 생성되었습니다");
        System.out.println("체력:" + s2.hp);
        System.out.println("마나:" + s2.mp);
    } // main 끝
}
