package implementation;

public class OrderItem {

    private int num ;

    OrderItem(int it) {
        num = it;
    }

    int getOrderItemNO() {
        return num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}
