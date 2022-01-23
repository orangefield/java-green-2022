package stringex.practice;

public class formatTest {
    public static void main(String[] args) {
        int i = 123456789;
        String str = String.format("%,d", i);
        System.out.println("format: " + str);
    }
}
