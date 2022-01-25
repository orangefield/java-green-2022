package orangefield.coffeesilsup;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        items = new ArrayList<>();

        items.add(new MenuItem("아메리카노", 1500));
    }

    public MenuItem choose(String name) {
        for (MenuItem each : items)
            if (each.getName().equals(name)) {
                return each;
            }
        return null; // 왜 null일까

    }
}
