package ex22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        // HashSet 생성
        Set<Integer> lottoNumber = new HashSet<>();

        while (true) {
            int n = r.nextInt(45) + 1; // 2=0~1까지 랜덤(r)으로 뱉어내
            // System.out.println(n);
            // HashSet에 n값을 add해서 저장
            lottoNumber.add(n);
            // HashSet 데이터 크기가 6이되면 break
            if (lottoNumber.size() == 6) {
                break;
            }
        }
        // HashSet 데이터 출력!!
        System.out.println(lottoNumber);
    }
}
