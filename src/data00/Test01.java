package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import data00.ResponseDto.Response.Body.Items.Item;

public class Test01 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKPK&arrAirportId=NAARKPC&depPlandTime=20220125&airlineId=ABL&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // conn이 바이트스트림, (Http~) 신창원:레퍼런스 자료형의
            // 신창원은 화살표 방향을 바꾸는 것, 니가 http를 쓸지 https를
            // 쓸지 모르겠어서 직접 신창원 하도록 부모를 return 타입으로 뒀다
            // utf-8 : 한글을 3Byte로 끊어 읽겠다.
            // default : 1Byte씩 끊어 읽었기 때문에 한글이 깨졌다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);// json으로부터! = from
            // System.out.println(dto);
            //
            System.out.println(dto.getResponse().getBody().getItems().getItem().get(0));
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("주소 입력이 잘못 되었습니다.");
        }
    }
}
