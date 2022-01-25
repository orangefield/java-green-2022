package orangefield.coffee;

class 곤충 {
    String name = "곤충이";
    int height;
    int weight;

}

class 메뚜기 extends 곤충 {
    String name;
    int height;
    int weight;

    public 메뚜기(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;

        System.out.println(name + "의 키와 몸무게는 " + height + "와 " + weight);
    }

}

public class ConductorEx {
    public static void main(String[] args) {
        메뚜기 m1 = new 메뚜기("뚜기", 10, 30);
    }
}
