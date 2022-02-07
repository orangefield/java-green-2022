package userapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/user";
            URL url = new URL(addr);
            // conn 은 ByteStream 아직 방향을 정하지 않음.
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 버퍼를 달아서 읽을지 보낼지, 가변적으로 할지 고정길이로 할지 등을 정한다
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            // 버퍼를 flush해서 읽으면서 제이슨으로 받자
            String responseJson = br.readLine();
            // System.out.println(responseJson);

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 1. 통신 검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMsg());
                return; // stack을 종료한다.
            }

            // 2. 프로그램 만들기
            // (1) 화면에 회원정보를 출력하겠다. for문 사용!!
            System.out.println(dto.getData().size());
            // 19바퀴 0~18
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호 : " + dto.getData().get(i).getId());
                System.out.println("회원유저네임 : " + dto.getData().get(i).getUsername());
                System.out.println("비밀번호 : " + dto.getData().get(i).getPassword());
                System.out.println("회원이메일 : " + dto.getData().get(i).getEmail());
                System.out.println("회원가입날짜 : " + dto.getData().get(i).getCreated());
                System.out.println("회원로그인날짜 : " + dto.getData().get(i).getUpdated());
                System.out.println("==================");
            }

        } catch (Exception e) {
            e.printStackTrace(); // 오류를 추적할 수 있는 로그를 콘솔에 보여줌.
        }
        try {
            String addr = "http://lalacoding.site/init/user";
            URL url = new URL(addr);
            // conn 은 ByteStream 아직 방향을 정하지 않음.
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 버퍼를 달아서 읽을지 보낼지, 가변적으로 할지 고정길이로 할지 등을 정한다
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            // 버퍼를 flush해서 읽으면서 제이슨으로 받자
            String responseJson = br.readLine();
            // System.out.println(responseJson);

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 1. 통신 검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패 : " + dto.getMsg());
                return; // stack을 종료한다.
            }

            // 2. 프로그램 만들기
            // (1) 화면에 회원정보를 출력하겠다. for문 사용!!
            System.out.println(dto.getData().size());
            // 19바퀴 0~18
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호 : " + dto.getData().get(i).getId());
                System.out.println("회원유저네임 : " + dto.getData().get(i).getUsername());
                System.out.println("비밀번호 : " + dto.getData().get(i).getPassword());
                System.out.println("회원이메일 : " + dto.getData().get(i).getEmail());
                System.out.println("회원가입날짜 : " + dto.getData().get(i).getCreated());
                System.out.println("회원로그인날짜 : " + dto.getData().get(i).getUpdated());
                System.out.println("==================");
            }

        } catch (Exception e) {
            e.printStackTrace(); // 오류를 추적할 수 있는 로그를 콘솔에 보여줌.
        }
    }
}
