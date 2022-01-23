package ex12;

// 3번 인터페이스 만들기
interface Keymap {
    public abstract void q();

    public abstract void w();

    public abstract void e();

    public abstract void r();
}

// 4번
class 알리스타 implements Keymap {

    @Override
    public void q() {
        System.out.println("스매시");
    }

    @Override
    public void w() {
        System.out.println("카운터 어택");
    }

    @Override
    public void e() {
        System.out.println("윈드밀");
    }

    @Override
    public void r() {
        System.out.println("다운 어택");
    }

}

// 5번
class 티모 implements Keymap {
    @Override
    public void q() {
        System.out.println("파이어볼");
    }

    @Override
    public void w() {
        System.out.println("아이스 스피어");
    }

    @Override
    public void e() {
        System.out.println("썬더");
    }

    @Override
    public void r() {
        System.out.println("라이트닝 로드");
    }

}

// 1번 클래스 생성
public class TestEx01 {

    // 2번 메인 메서드 만들기
    public static void main(String[] args) {
        // 6번
        Keymap u1 = new 알리스타();
        Keymap u2 = new 티모();

        u1.q();
        u2.e();
    }
}