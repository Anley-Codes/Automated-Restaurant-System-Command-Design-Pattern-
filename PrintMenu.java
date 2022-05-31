package implementation;


import model.Command;


public class PrintMenu implements Command {

    private Aggregator agg;

    PrintMenu(Aggregator agg) {
        this.agg = agg;
    }

    @Override
    public String[] execute() {
        int count = agg.getMenuObject().getMenuItems().size();
        
        
        String items[] = new String[count];
        for (int i = 0; i < count; i++) {
            int mcount = agg.getMenuObject().getMenuItems().get(i).getItemNo();
            String mdesc = agg.getMenuObject().getMenuItems().get(i).getDescription();
            double mprice = agg.getMenuObject().getMenuItems().get(i).getCost();
            items[i] = String.format("%5d\t\t%-18s $%-5.3f", mcount, mdesc, mprice);
        }
        return items;
    }

    public Aggregator getAgg() {
        return agg;
    }

    public void setAgg(Aggregator agg) {
        this.agg = agg;
    }
    
    
    
}
