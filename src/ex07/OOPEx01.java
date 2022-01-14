package ex07;

class Car {
    int speed = 90;
}

public class OOPEx01 {

    public static void main(String[] args) {
        // new는 heap에 할당하라는 키워드 : new 클래스명();
        // Car 클래스가 가지고 있는 static이 아닌 모든 것들이 heap에 뜬다.
        Car s1 = new Car(); // Car sss는 new Car()를 가리키는 주소를 만들어준 것이다.
        System.out.println(s1.speed);

        Car s2 = new Car();
        System.out.println(s2.speed);

        new Car(); // heap에 뜨긴 뜨는데 어딨는지 모르겠다=쓰레기 취급한다 garbage collection
    }
}
