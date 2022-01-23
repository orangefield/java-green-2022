package srp;

public class 요리프로그램 {
    public static void main(String[] args) {
        손님 customer = new 손님();
        종업원 manager = new 종업원(); // 홍길동 manager = new 홍길동(); 하면 홍길동 퇴사하면 코드 전부 수정해야 함. 그러니까 추상화된 걸 바라봐라
        요리사 chef = new 요리사();

        customer.주문하기(manager, chef); // 프로그램은 누군가가 시작해야한다. 주문은 개발자가 시작
    }
}
