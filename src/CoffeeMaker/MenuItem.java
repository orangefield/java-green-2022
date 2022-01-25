package CoffeeMaker;

//아메리카노, 까페라떼, 마끼야또, 카페모카
public class MenuItem {
	private String name; 
	private int price;
	
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
