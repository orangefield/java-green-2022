package orangefield.coffee03;

abstract public class Barista {
    // 공유가 호출되나 확인 -> 확인 완료!
    // String name = "바리스타쨩";

    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

    // public String getName() {
    // return name;
    // }

}

class 공유 extends Barista {
    // String name = "커피프린스 공유";

    // public String getName() {
    // return name;
    // }

}