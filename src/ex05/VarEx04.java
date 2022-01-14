package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 1. 4가지 자료형 int, double, long, boolean(문자열의 사이즈를 미리 확보할 수 있다. 세팅용도임)
        // 2. 문자열 : 사이즈를 알 수 없다. 자료형이 아님!!
        int n1 = 10;
        String s1 = "안녕하세요"; // 컴파일 시점에 s1의 용량=4Byte
        String s2 = s1; // s2에 s1에 있던 주소가 들어갈 것
        s2 = "바보";
    }
}
