package implementation;

import model.AggregatorInterface;

public class Aggregator implements AggregatorInterface {

    private Menu menu;
    private Orders order;

    Aggregator() {
        menu = new Menu();
        order = new Orders();
    }

    @Override
    public Menu getMenuObject() {
        return menu;
    }

    @Override
    public Orders getOrdersObject() {
        return order;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

}
