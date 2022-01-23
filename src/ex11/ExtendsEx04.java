package ex11;

/**
 * 신입이 실수하지 않는 설계를 해보자!!
 * 신입이 실수하면 내 책임이니까
 */

// abstract class 추상클래스 =
// 1. new 할 수 없다
// 2. 추상 메서드를 만들 수 있다. (객체의 행위를 공통적으로 정의할 수 없을 때)
// 3. 일반 메서드도 만들 수 있다. (모든 구체적인 애들의 공통적인 것)
abstract class ProtossUnit { // 종족이름
    abstract void setHp(int hp);

    abstract int getHp();

    abstract int getAttack();
}

// 1. 일반 메서드는 추상 메서드를 가질 수 없다.(프로토스유닛까지 확장하기 위해서는 일반과 추상적인 걸 연결할 수 있는 관계성을 만들어야
// 한다.)
class Zealot extends ProtossUnit { // 근거리 공격, extends는 딱 하나만 추상화(부모가 둘이면 추상화가 안된다, 콤마 뭐시기 안됨)
    String name = "질럿";
    int hp = 100;
    int attack = 10;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }

}

class Dragoon extends ProtossUnit { // 원거리 공격
    String name = "드라군";
    int hp = 100;
    int attack = 20;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

class DarkTempler extends ProtossUnit {
    String name = "다크템플러";
    int hp = 100;
    int attack = 50;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }
}

// 신입아 DarkTempler 하나 만들어!!
// name = 다크템플러
// hp = 100
// attack = 50
// 꼭 ProtossUnit으로 추상화해야돼!!
// 테스트 => 다크템플러가 질럿을 공격하는!!
public class ExtendsEx04 {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // 1. u1이 u2를 공격 => u2.hp = u2.hp - u1.attack => 자식변수 접근 안되는군 => 오버라이드 하자
        u2.setHp(u2.getHp() - u1.getAttack());
        // 2. u2의 hp를 출력 => sysout(u2.hp)
        System.out.println(u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit d1 = new Dragoon();
        ProtossUnit k1 = new DarkTempler();
        attack(d1, z1);
        attack(z1, d1);
        attack(k1, z1);
    }
}
