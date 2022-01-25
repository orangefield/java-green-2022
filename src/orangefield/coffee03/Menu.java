package orangefield.coffee03;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem choose(String menuName) {
        for (MenuItem each : items) {
            if (each.getName().equals(menuName)) {
                return each;
            }
        }
        return null;
    }
}
