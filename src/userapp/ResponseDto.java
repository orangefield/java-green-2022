package userapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

//요청할 때는 RequestDto 라고 짓자
@AllArgsConstructor
@Data
public class ResponseDto {
    private int code; // 1 성공, -1 실패, 0은 데이터 없음.
    private String msg; // 실패의 원인을 알려주겠다
    private List<User> data; // 왜 User를 import 하지 않아도 될까? 같은 패키지 안에 있으니까.
}
