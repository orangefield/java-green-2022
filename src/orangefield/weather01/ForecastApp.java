package orangefield.weather01;

import java.util.List;
import java.util.Scanner;

import orangefield.weather01.WeatherDto.Response.Body.Items.Item;

public class ForecastApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== 오늘 날짜를 입력하세요 ====");
        System.out.println("ex) 20220125");
        String baseDate = sc.nextLine();

        System.out.println("==== 현재 시각을 입력하세요 ====");
        System.out.println("ex) 3시 26분 = 1526");
        String baseTime = sc.nextLine();

        List<Item> weatherForecast = DownloadWeather.getWeatherList(baseDate, baseTime);

        System.out.println("동래구의 현재 기온은 " + weatherForecast.get(3).getObsrValue() + "℃ 입니다.");

    }
}
