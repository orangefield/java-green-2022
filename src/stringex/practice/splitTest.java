package stringex.practice;

public class splitTest {
    public static void main(String[] args) {
        String spl = "상처를.치료해줄.사람.어디.없나"; // 우와 split의 매개변수는 정규표현식이라 그냥 "." 으로는 못나누는구나 => \\.
        String[] split = spl.split("\\.");

        System.out.println("split : " + split[0]);

        // String str = "A:B:C:D:abcd";
        // String[] split = str.split(":");
        // System.out.println("split: " + split[1]);
    }
}
