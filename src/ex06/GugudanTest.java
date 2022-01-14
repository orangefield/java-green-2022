package ex06;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (int step = n1; step <= n2; step++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(step + "*" + i + "=" + (step * i));
            }
        }
    }
}
