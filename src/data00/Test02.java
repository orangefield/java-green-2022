package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class Test02 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");
            // 선을 만들고
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 버퍼를 달아서 읽고
            // InputStream : 정수로 한 자 -> InputStreamReader로 감싸서 고정된 길이만
            // -> BufferedReader로 감싸서 가변적인 길이를
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            // 읽어들이자(다 안받아지면 while로 돌려서 다 읽어야 된다는거 기억하라)
            String airportJson = br.readLine();
            // JSON 잘 받았나 확인
            // System.out.println(airportJson);
            // GSON을 이용해 JSON을 자바오브젝트로
            Gson gson = new Gson();
            AirportDto dto = gson.fromJson(airportJson, AirportDto.class);
            // 자바 오브젝트로 잘 변환되었다
            System.out.println(dto);
            System.out.println("====================================================");
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            System.out.println(result);

            // 최종적으로 할 것 -공항의 ID를 찾아내기-
            System.out.println("====================================================");
            Map<String, String> airportMap = new HashMap<>();
            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }
            System.out.println(airportMap.get("제주"));

        } catch (Exception e) {
            System.out.println("주소 입력이 잘못 되었습니다.");
        }

    }
}
