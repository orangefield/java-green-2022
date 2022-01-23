package ex22;

class 사과 {
    String name = "사과";
}

class 딸기 {
    String name = "딸기";

}

class 오렌지 {
    String name = "오렌지";
}

class ResponseBox<T> {
    T data; // 사과 대신 T

    public ResponseBox(T data) {
        this.data = data;
    }
}

// 제네릭을 사용하면 메서드의 리턴 타입을 고정시키면서 다양하게 리턴할 수 있다.
public class GenericEx01 {

    // 제네릭 사용 없이 하나의 메서드로 다양한 타입을 어떻게 리턴할 수 있을까? = 불가능ㅋㅋ

    // ResponseBox hello() { // void 대신에
    // return new ResponseBox<사과>(new 사과());
    // }

    public static void main(String[] args) {
        ResponseBox<사과> rb1 = new ResponseBox<사과>(new 사과());
        System.out.println(rb1.data.name);
        // rb1 응답!!
        ResponseBox<딸기> rb2 = new ResponseBox<딸기>(new 딸기());
        // rb2 응답!! 통신 코드는 우린 아직 모른다
        ResponseBox<오렌지> rb3 = new ResponseBox<오렌지>(new 오렌지());
        System.out.println(rb3.data.name);

    }
}
