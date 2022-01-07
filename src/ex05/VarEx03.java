package ex05;

public class VarEx03 {
    public static void main(String[] args) {
        int n1 = 10; // 4Byte
        long n2 = 20; // 8Byte
        double n3 = 30.1; // 8Byte
        boolean n4 = true; // or false 1bit

        double t1 = n1; // 묵시적 형변환(내가 더 크니까 그냥 해줄게)
        int t2 = (int) n3; // 원래 안되는데 ()를 통해 명시적 형변환=자료의 유실이 생김
        System.out.println(t1);
        System.out.println(t2);

        long t3 = n1;
        int t4 = (int) n2;
    }
}
