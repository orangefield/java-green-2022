package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)와 자바(목적지)에 Stream이 연결된다.
        InputStream s = System.in; // 읽을건데 = 키보드로부터 읽겠다. 결국 s : 바이트 스트림
        try {
            int n = s.read(); // 까지 쓰고 read에서 알트엔터
            System.out.println((char) n); // char 한거는 신창원
        } catch (IOException e) {
            System.out.println("에러");
        }
    }
}
