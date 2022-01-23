package orangefield;

import java.util.Arrays;
import java.util.Scanner;

class 회원정보 {

    private String name;
    private String tel;
    private String gender;
    private int age;

    public 회원정보(String name, String tel, String gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class strEx02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String members = sc.nextLine();
        String[] tokens = members.split("-");

        if (tokens[0].equals("A01")) {

            int[] pointer = new int[5]; // ":"의 위치 반환
            String[] data = new String[5]; // ":" 다음 데이터 반환

            // 필요한 데이터만 배열에 정리
            for (int i = 0; i < tokens.length; i++) {
                pointer[i] = tokens[i].indexOf(":") + 1;
                data[i] = tokens[i].substring(pointer[i]);
            }

            // Parsing
            String name = data[1];
            String tel = data[2];
            String gender = data[3];
            String age = data[4].trim();
            int noBlockAge = Integer.parseInt(age);

            회원정보 doc = new 회원정보(name, tel, gender, noBlockAge);

            System.out.println("회원 " + doc.getName() + "님의 전화번호는 " + doc.getTel() + "입니다.");

        } else {
            System.out.println("프로그램 종료");
        }

    }
}