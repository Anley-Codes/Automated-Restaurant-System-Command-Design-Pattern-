package implementation;

import java.util.ArrayList;

/*
 A tab will be constructed from the Tab class containing all of the ordered items, returned as an array of
strings for the user interface to display. Note that a tab needs information from both the Menu and the
Orders objects. (The Orders object indicates what menu items were ordered, and the Menu class has the
description of each item to include in the Tab.)
 */
public class Tab {

    private Aggregator ag;

    public Tab(Aggregator ag) {

        this.ag = ag;
    }

    public Aggregator getAg() {
        return ag;
    }

    public void setAg(Aggregator ag) {
        this.ag = ag;
    }

    public String[] getTab() {

        ArrayList<OrderItem> item = this.ag.getOrdersObject().orderItems;
        String[] items = new String[item.size()];

        for (int x = 0; x < item.size(); x++) {

            items[x] = item.get(x).toString();
        }
        return items;

    }

}
