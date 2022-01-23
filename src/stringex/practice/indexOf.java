package stringex.practice;

public class indexOf {
    public static void main(String[] args) {
        String ind = "abcdefg";
        int result4 = ind.indexOf("f");

        System.out.println(result4);

        int result5 = ind.indexOf("ef");
        System.out.println(result5);

        int result6 = ind.indexOf("str");
        System.out.println(result6);
    }
}
