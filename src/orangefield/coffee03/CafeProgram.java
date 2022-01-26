package orangefield.coffee03;

import java.util.ArrayList;
import java.util.List;

public class CafeProgram {
    public static void main(String[] args) {
        Customer customer = new 홍길동();
        Barista barista = new 공유();

        MenuItem m1 = new MenuItem("아메리카노", 1500);
        MenuItem m2 = new MenuItem("카페라떼", 2000);
        MenuItem m3 = new MenuItem("콜드브루", 2500);
        MenuItem m4 = new MenuItem("카라멜 마끼아또", 3500);
        List<MenuItem> items = new ArrayList<MenuItem>();
        items.add(m1);
        items.add(m2);
        items.add(m3);
        items.add(m4);

        Menu menu = new Menu(items);
        customer.order("아메리카노", menu, barista);
        // System.out.println(barista.getName());
    }
}
