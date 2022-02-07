package orangefield.dtotest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

import orangefield.dtotest.ResponseDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("검색 시작일을 입력하세요");
        System.out.println("ex) 20210125");
        String startCreateDt = sc.nextLine();

        System.out.println("검색 종료일을 입력하세요");
        System.out.println("ex) 20210125");
        String endCreateDt = sc.nextLine();

        try {
            URL url = new URL(
                    "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&startCreateDt="
                            + startCreateDt + "&endCreateDt=" + endCreateDt + "&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String ResponseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(ResponseJson, ResponseDto.class);

            // System.out.println(dto);

            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            System.out.println(result);
            for (int i = 0; i < result.size(); i++) {
                System.out.println("==============================");
                System.out.println("누적 의심신고 검사자 : " + result.get(i).getAccExamCnt());
                System.out.println("등록일시분초 : " + result.get(i).getCreateDt());
                System.out.println("사망자 수 : " + result.get(i).getDeathCnt());
                System.out.println("게시글번호 : " + result.get(i).getSeq());
                System.out.println("기준일 : " + result.get(i).getStateDt());
                System.out.println("기준시간 : " + result.get(i).getStateTime());
                System.out.println("수정일시분초 : " + result.get(i).getUpdateDt());
                System.out.println("==============================");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
