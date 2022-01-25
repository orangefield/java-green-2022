package CoffeeMaker;

public class Customer {
	public void order(String menuName, Menu menu, Barista barista) {
		
		//2. 메뉴항목을 찾아라!!
		MenuItem menuItem = menu.choose(menuName);
		if(menuItem == null) {
			System.out.println("찾은 메뉴가 없습니다.");
		}
		//3. 커피를 만들어라!!
		Coffee coffee = barista.makeCoffee(menuItem);
		
		System.out.println("커피를 받았습니다.");
		System.out.println("커피이름 : "+coffee.getName());
		System.out.println("커피가격 : "+coffee.getPrice());
	}
}
