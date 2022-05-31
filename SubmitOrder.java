package implementation;


/** SubmitOrder.java* */
public class SubmitOrder {

    private Aggregator ag;
    private int num ;

    SubmitOrder(Aggregator ag, int num) {
        this.ag = ag;
        this.num = num;
    }


    public String execute() {
        ag.getOrdersObject().orderItem(num);
        return ag.getMenuObject().getDescription(num);
    }
    
}
