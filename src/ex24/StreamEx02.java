package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 { // 얘도 아예 안쓰는 방법
    public static void main(String[] args) {
        // 한 자리의 숫자를 받을 수 있다.
        InputStream in = System.in;
        // 고정된 길이의 문자를 받을 수 있다.
        InputStreamReader ir = new InputStreamReader(in); // 캐스팅 안해도 되게 문자로 바꿔준다.

        char[] data = new char[3]; // 읽기 위해서는 먼저 배열을 만들고
        try {
            ir.read(data); // ABCD 넣으면 D 유실
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
