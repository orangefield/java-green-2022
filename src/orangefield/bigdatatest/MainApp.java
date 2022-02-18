package orangefield.bigdatatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.google.gson.Gson;

public class MainApp {

    public static void main(String[] args) {
        String addr = "http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=5190&_type=json";

        try {
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();
            // System.out.println(responseJson);
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            // System.out.println(dto);

            // System.out.println(dto.getResponse().getBody().getItems().getItem().size());
            List<Hospital> result = dto.getResponse().getBody().getItems().getItem();
            // System.out.println(result.get(1).getAddr());

            // 1. DB 연결 - 세션생성
            Connection conndb = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT", "TIGER");
            // System.out.println("DB연결완료");

            // 2. 버퍼 달아서 통신
            String sql = "INSERT INTO hospitalTbl(주소, 운영시작일자, 구분코드, RAT가능여부, 요양종별코드, 호흡기전담클리닉여부, 시군구명, 시도명, 전화번호, X좌표, 세계지구X좌표, Y좌표, 세계지구Y좌표, 요양기관명, 암호화된요양기호) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conndb.prepareStatement(sql);

            // 딱 한줄만 넣어보자 -> 넣었어ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ

            for (int i = result.size() - 1; i >= 0; i--) {
                pstmt.setString(1, result.get(i).getAddr());
                pstmt.setString(2, result.get(i).getMgtStaDd());
                pstmt.setString(3, result.get(i).getPcrPsblYn());
                pstmt.setString(4, result.get(i).getRatPsblYn());
                pstmt.setString(5, result.get(i).getRecuClCd());
                pstmt.setString(6, result.get(i).getRprtWorpClicFndtTgtYn());
                pstmt.setString(7, result.get(i).getSgguCdNm());
                pstmt.setString(8, result.get(i).getSidoCdNm());
                pstmt.setString(9, result.get(i).getTelno());
                pstmt.setInt(10, result.get(i).getXPos());
                pstmt.setString(11, result.get(i).getXPosWgs84());
                pstmt.setInt(12, result.get(i).getYPos());
                pstmt.setString(13, result.get(i).getYPosWgs84());
                pstmt.setString(14, result.get(i).getYadmNm());
                pstmt.setString(15, result.get(i).getYkihoEnc());

                int isSuccess = pstmt.executeUpdate();

                if (isSuccess > 0) {
                    System.out.println("성공");
                } else {
                    System.out.println("실패");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
