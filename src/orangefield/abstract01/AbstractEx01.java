package orangefield.abstract01;

abstract class ProtossUnit {

    abstract String getName();

    abstract void setHp(int hp);

    abstract int getHp();

    abstract int getAttack();

}

class Zealot extends ProtossUnit {
    String name = "질럿";
    int hp = 100;
    int attack = 10;

    @Override
    int getAttack() {
        return attack;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    void setHp(int hp) {
        this.hp = hp;

    }

    @Override
    String getName() {
        return name;
    }

}

class DarkTempler extends ProtossUnit {

    String name = "다크템플러";
    int hp = 100;
    int attack = 50;

    @Override
    int getAttack() {
        return attack;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }
}

public class AbstractEx01 {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // u1이 u2를 공격
        System.out.println(u1.getName() + "가(이) " + u2.getName() + "을 공격합니다.");
        // u2의 hp 변경
        u2.setHp(u2.getHp() - u1.getAttack());
        // u2의 남은 hp 출력
        System.out.println(u2.getName() + "의 남은 체력 : " + u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit z2 = new Zealot();
        ProtossUnit dk1 = new DarkTempler();

        attack(z1, z2);
        attack(dk1, z1);
    }
}
