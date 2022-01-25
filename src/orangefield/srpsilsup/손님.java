package orangefield.srpsilsup;

public class 손님 {
    public void 주문하기(종업원 manager, 요리사 chef) {
        음식 c = manager.주문받기(chef);

        System.out.println(c.getName() + "을 먹습니다.");
    }
}
