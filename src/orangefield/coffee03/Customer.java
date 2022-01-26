package orangefield.coffee03;

abstract public class Customer {
    // "홍길동"이 찍히나 확인 -> 확인 완료!
    // String name = "손님쨩";
    String name;

    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
        System.out.println(getName() + "이 " + coffee.getPrice() + "원 " + coffee.getName() + "를 받았습니다.");
    }

    public String getName() {
        return name;
    }

}

class 홍길동 extends Customer {
    String name = "홍길동";

    public String getName() {
        return name;
    }

    @Override
    public void order(String menuName, Menu menu, Barista barista) {

        super.order(menuName, menu, barista);
    }

}
