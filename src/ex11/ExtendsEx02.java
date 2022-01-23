package ex11;

class 동물 {
    String getName() {
        return ""; // 어차피 통로니까 ""
    }

    void setHp(int hp) {

    }// 변경만 하는거니까 void

    int getHp() {
        return 0; // 0 해도 되는구나
    }

    int getAttack() {
        return 0;
    }

}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    String getName() {
        return name;
    }

    void setHp(int hp) { // 매개변수로 갖고 있는 int hp 는 stack 변수, 얘는 상태 변경 코드
        this.hp = hp;
    }

    int getHp() { // 얘는 상태 확인 코드
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 늑대 extends 동물 {
    String name = "늑대";
    int hp = 80;
    int attack = 15;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

public class ExtendsEx02 {

    // 오버라이딩 = 무효화하다(아래로 타고 내려가는 기법)
    // 사자 -> 호랑이 공격
    static void attack(동물 unit1, 동물 unit2) {
        System.out.println(unit1.getName() + "가 " + unit2.getName() + "을(를) 공격하고 있습니다.");
        unit2.setHp(unit2.getHp() - unit1.getAttack());
        System.out.println(unit2.getName() + "의 남은 hp : " + unit2.getHp());
    }

    public static void main(String[] args) {
        동물 lion = new 사자(); // 사자 위에 동물영역
        동물 tiger = new 호랑이();
        동물 bear = new 곰();
        동물 wolf = new 늑대();

        attack(lion, tiger);
        attack(lion, bear);
        attack(tiger, bear);
        attack(wolf, lion);
    }
}
