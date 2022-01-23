package jsonex01;

import com.google.gson.Gson;

//Dto => Data Transfer Object. 얘를 JSON 표기법으로 바꿔서 보낼거야
class UserDto {
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

// 위에 클래스들 다 만들어놔야되는건 잘 알겠G?
public class GsonEx01 {
    public static void main(String[] args) {
        // JavaObject -> JSON으로 변경(데이터 전송 목적)
        UserDto userDto = new UserDto("ssar", "1234");
        Gson gson = new Gson(); // toJson, fromJson
        String jsonUserDto = gson.toJson(userDto);
        System.out.println(jsonUserDto);

        // Json -> JavaObject 로 변경(데이터 다운로드 받아서 내 맘대로 다루려고)
        UserDto javaUserDto = gson.fromJson(jsonUserDto, UserDto.class); // UserDto 타입으로 바꿀건데 .class 붙여야 함
        System.out.println(javaUserDto);
        System.out.println(javaUserDto.getUsername());
        System.out.println(javaUserDto.getPassword());
    }
}
