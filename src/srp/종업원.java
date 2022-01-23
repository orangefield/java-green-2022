package srp;

//종업원-요리사(종업원이 요리사를 호출, 요리사의 레퍼런스 주소를 알아야)
public class 종업원 {
    public 음식 주문받기(요리사 chef) { // 매개변수를 왜 받나? 종업원은 요리사에 의존적이니까
        음식 jjajang = chef.음식생성(); // 메시지 전달
        return jjajang; // null : 아무것도 없음. 뭔가 리턴하고 싶은데 지금은 모르겠다. 빈 객체. 빈 상자
    } //
}
