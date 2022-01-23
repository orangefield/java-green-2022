package lottoex01;

import java.util.HashSet;
import java.util.Random;

//ArrayList로 로또!! 한개!! 해보기
public class Test3 {
    public static void main(String[] args) {
        // 3. HashSet으로 랜덤한 로또 번호 6개 받기
        HashSet<Integer> lotto = new HashSet<>();

        Random r = new Random();

        // 반복해서 lotto에 담기(6개)
        // Set 자료구조는 중복되는 데이터가 들어가는 허용하지 않음.
        while (true) {
            int n = r.nextInt(45) + 1;
            lotto.add(n);

            if (lotto.size() == 6)
                break; // 한줄 코드는 중괄호 생략 가능 if 에서만!!
        }
        System.out.println(lotto); // for문으로 넣으면 중복값이 나올 수 있으니까

        if (lotto.size() == 6) {
            System.out.println("테스트 종료");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
