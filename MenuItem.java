package implementation;


public class MenuItem {

    private int itemCount;
    private String desc;
    private double price;

    MenuItem(int itemNo, String desc, double p) {
        this.itemCount = itemNo;
        this.desc = desc;
        this.price = p;
    }

    int getItemNo() {
        return itemCount;
    }

    String getDescription() {
        return desc;
    }

    double getCost() {
        return price;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
