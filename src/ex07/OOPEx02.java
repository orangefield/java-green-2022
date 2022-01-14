package ex07;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor dc = new Doctor(); // 우선 dc라는 주소로 연결해서 메모리에 띄우자(static 말고 heap)
        System.out.println(dc.name); // dc의 크기는 4바이트라는건 잘 알겠G? dc는 main stack에 있을 것
        System.out.println(dc.sal);
    }
}
