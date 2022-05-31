package implementation;

import model.InvokerInterface;

/**
The Aggregator class maintains references to the Menu object and the Orders object. It should provide a
getter method for retrieving the Menu and Orders objects (no setters are needed). The Menu and Orders
classes store a collection of MenuItem and OrderItem objects, respectively. A MenuItem object will store
the menu item #, the description, and its cost. An OrderItem object will store an order by its item number
only (not its description).
* 
* **/
public class Invoker implements InvokerInterface{

    private static Aggregator agg;

    Invoker() {
        agg = new Aggregator();
    }

    @Override
    public String[] displayMenu() {
        return new PrintMenu(agg).execute();
    }

    @Override
    public String submitOrder(int itemNo) {
        return new SubmitOrder(agg, itemNo).execute();
    }

    @Override
    public String[] displayTab() {
        return new PrintTab(agg).execute();
    }
}
