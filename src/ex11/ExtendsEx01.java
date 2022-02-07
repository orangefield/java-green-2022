package ex11;

class 라면 {
    int kcal = 300;
    String color = "노란색";
    String type = "국물";
}

class 매운라면 extends 라면 {
    // int kcal = 300;
    String color = "빨간색";
    String type = "국물";
    int kcal = 200;
    String type2 = "고춧가루";
}

public class ExtendsEx01 {
    public static void main(String[] args) {
        라면 s1 = new 라면(); // heap에 kcal, color, type 뜬다

        매운라면 s2 = new 매운라면(); // heap에 kcal, color, type, type2 뜬다
        System.out.println(s2.type2);
        System.out.println(s2.kcal); // 물려받았지만 메모리 상으로는 (그림4)

        라면 s3 = new 매운라면();
        // System.out.println(s3.type2); 부모를 바라보면 부모만! 보인다
        System.out.println(s3.color);
    }
}
