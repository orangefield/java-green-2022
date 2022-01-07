package ex05;

public class VarEx01 {

    public static void main(String[] args) {
        byte num; // 변수의 선언 (메모리에 공간_1바이트 확보)
        num = 1; // 확보하고나서 대입
        byte num2 = 100; // 변수의 초기화 (확보 + 대입) 확보해서 넣는거X 값을 확보하면서 넣기
        System.out.println(num);
    }
}
