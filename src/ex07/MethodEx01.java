package ex07;

public class MethodEx01 {

    // 메서드
    static void add(int n1) { // static이 없었다면 메모리에 띄울 수 있는 방법은 heap에 띄우는 것 뿐
        System.out.println("받은 숫자는 " + n1);
    }

    public static void main(String[] args) { // void : 순서대로 뱉기만 하고 끝낼게
        MethodEx01.add(5000); // 메서드 호출
    }
}
