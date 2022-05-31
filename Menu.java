package implementation;

import java.util.ArrayList;
import model.MenuInteface;

public class Menu implements MenuInteface{

    private ArrayList<MenuItem> menuitems = new ArrayList<>();

    public Menu() {
        String desc[] = {"Kale ", "Chicken ", "Jiaozi","Bugger"};
        double costs[] = {100, 200, 150, 50};
        for (int i = 0; i < desc.length; i++) {
            menuitems.add(new MenuItem(i + 1, desc[i], costs[i]));
        }
    }

    @Override
    public String getDescription(int itemNo) {
        for (int i = 0; i < menuitems.size(); i++) {
            if (itemNo == menuitems.get(i).getItemNo()) {
                return menuitems.get(i).getDescription();
            }
        }
        return "";
    }

    @Override
    public ArrayList<MenuItem> getMenuItems() {
        return menuitems;
    }

}
