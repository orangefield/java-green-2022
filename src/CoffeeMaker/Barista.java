package CoffeeMaker;

public class Barista {
	public Coffee makeCoffee(MenuItem menuItem) {
		//4. 커피를 생성하라!!
		Coffee coffee = new Coffee(menuItem);
		return coffee;
	}
}
