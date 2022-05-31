package implementation;


import model.Command;

public class PrintTab implements Command {

    private Aggregator agObj;

    PrintTab(Aggregator agObj) {
        this.agObj = agObj;
    }

    @Override
    public String[] execute() {
        Tab tab = new Tab(this.agObj);
        return tab.getTab();
    }
}
