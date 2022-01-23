package orangefield;

public class strEx01 {
    public static void main(String[] args) {
        String scan = "A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20";
        String[] tokens = scan.split("-");

        if (tokens[0].equals("A01")) {

            for (int i = 0; i < tokens.length; i++) {

                System.out.println(tokens[i]);

            }

        } else {
            System.out.println("프로그램 종료");
        }

    }
}
