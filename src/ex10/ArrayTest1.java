package ex10;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        final int students = 5;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[students];
        for (int i = 0; i < students; i++) {
            System.out.println("성적을 입력하시오: ");
            scores[i] = scan.nextInt();
        }
        for (int i = 0; i < students; i++) {
            total += scores[i];
        }
        System.out.println("평균 성적은 " + total / students + "입니다.");

    } // 메인 끝
}
