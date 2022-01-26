package orangefield.weather01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import orangefield.weather01.WeatherDto.Response.Body.Items.Item;

public class DownloadWeather {
    // 현재 날짜, 현재 시각의 날씨 가져오는 메서드
    // DownloadWeather.getWeatherList("20220126", "1500");
    public static List<Item> getWeatherList(String baseDate, String baseTime) {

        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=BXb2vXKpIghQcjKLcpcSdLYZ5BRJoGWdmI3j7SumCqLcWAAFG2c5cJiROSElRYOiJyAI41utgKgsAKg%2FLbfmRg%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date="
                            + baseDate + "&base_time=" + baseTime + "&nx=98&ny=76");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            return result;

        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
        }
        return null;
    }
}