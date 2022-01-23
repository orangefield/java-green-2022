package srp;

// 손님-종업원 (의존성을 가진다) : 손님이 종업원을 호출하는 형태니까 손님이 종업원의 레퍼런스 주소를 알아야 한다.
public class 손님 {

    public void 주문하기(종업원 manager, 요리사 chef) { // 주문하기가 먼저 메모리에 떴지만 주문받기가 종료되어야 주문하기가 사라짐(stack 구조)
        음식 jjajang = manager.주문받기(chef);
        // 주문받기(); 해야하는데 종업원의 주소를 모른다
        System.out.println(jjajang.getName() + "을 먹습니다.");
    }
}
