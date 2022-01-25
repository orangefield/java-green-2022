package ex24;

import java.io.IOException;
import java.io.OutputStream;

public class StreamEx11 {
    public static void main(String[] args) {
        // 자바(소스)와 모니터(목적지)의 Stream이 연결된다.
        OutputStream os = System.out;
        try {
            os.write(65);
            os.flush(); // 그냥 이 과정 전체를 syso로 하는게 좋지요. 이건 쓸 일 없어요. 그냥 써본거임. 다른 컴퓨터에 연결할 때 쓸거임. 파일 삭제도 ok
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
