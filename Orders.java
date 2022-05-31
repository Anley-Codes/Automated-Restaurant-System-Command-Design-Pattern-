package implementation;


import java.util.ArrayList;
import model.OrdersInterface;

public class Orders implements OrdersInterface{

    ArrayList<OrderItem> orderItems = new ArrayList<>(3);

    public Orders() {

    }

    @Override
    public int getNumberOfItems() {
        return orderItems.size();
    }

    @Override
    public void orderItem(int itemNo) {
        orderItems.add(new OrderItem(itemNo));
    }

    OrderItem getItem(int i) {
        return orderItems.get(i);
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    
}
