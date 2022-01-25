// package orangefield.coffee;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.jar.Attributes.Name;

// import javax.sql.rowset.BaseRowSet;

// abstract class Customer {
// String menuName;
// Menu menu;
// Barista barista;

// public void order(String menuName, Menu menu, Barista barista) {

// MenuItem menuItem = menu.choose(menuName);
// Coffee coffee = barista.makeCoffee(menuItem);

// }

// public Barista getBarista() {
// return barista;
// }

// }

// class 홍길동 extends Customer {

// public Barista getBarista() {
// return barista;
// }

// // Customer의 barista를 어떻게 가져올 수 있을까?

// public 홍길동() {

// public void order(String menuName, Menu menu, Barista barsita) {
// MenuItem menuItem = menu.choose(menuName);
// Coffee coffee = barista.makeCoffee(menuItem);

// System.out.println("홍길동이 " + menuName + "을 주문하셨습니다.");
// System.out.println("커피 가격 : " + coffee.getPrice());
// System.out.println("커피 이름 : " + coffee.getName());
// }
// }
// }

// class MenuItem {

// String name;
// int price;

// public MenuItem(String name, int price) {
// this.name = name;
// this.price = price;
// }

// public int getPrice() {
// return price;
// }

// public String getName() {
// return name;
// }

// }

// class Menu {
// private List<MenuItem> items;

// public Menu(List<MenuItem> items) {
// this.items = items;
// }

// public MenuItem choose(String menuName) {
// for (MenuItem each : items) {
// if (each.getName().equals(menuName)) {
// return each;
// }
// }
// return null; // 난 이 부분 틀렸음 왜????????????????????
// }
// }

// class Barista {
// public Coffee makeCoffee(MenuItem menuItem) {
// Coffee coffee = new Coffee(menuItem);
// return coffee;
// }
// }

// class Coffee {
// private String name;
// private int price;

// public String getName() {
// return name;
// }

// public int getPrice() {
// return price;
// }

// public Coffee(MenuItem menuItem) { // 이것도 틀렸음 생성자!!!!!!!!!!!!!!
// this.name = menuItem.getName();
// this.price = menuItem.getPrice();

// }

// }

// public class CoffeeEx {
// public static void main(String[] args) {
// Customer customer = new 홍길동();
// Barista barista = new Barista();

// MenuItem m1 = new MenuItem("아메리카노", 1500);
// MenuItem m2 = new MenuItem("카푸치노", 2000);
// MenuItem m3 = new MenuItem("초코라떼", 2500);
// MenuItem m4 = new MenuItem("카라멜 마끼아또", 3500);
// List<MenuItem> list = new ArrayList<>();
// list.add(m1);
// list.add(m2);
// list.add(m3);
// list.add(m4);

// Menu menu = new Menu(list);

// customer.order("아메리카노", menu, barista);

// }
// }
