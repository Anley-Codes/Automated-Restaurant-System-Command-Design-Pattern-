package implementation;


/**
The SystemInterface can be a class of 
* all static methods – one for each of 
* the three commands of the user
interface, if it does not have any state in 
* your extension of the program.
* * **/
public class SystemInterface{

    static Invoker In;

    public SystemInterface() {
        In = new Invoker();
    }

    public static void setInvoker(Invoker in) {
        In = in;
    }

    public static String[] displayMenu() {
        return In.displayMenu();
    }

    public static String submitOrder(int itemNo) {
        return In.submitOrder(itemNo);
    }

    public static String[] displayTab() {
        return In.displayTab();
    }
}
