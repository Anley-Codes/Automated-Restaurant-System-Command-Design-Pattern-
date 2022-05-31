
package model;


import implementation.MenuItem;
import java.util.ArrayList;

public interface MenuInteface {
    
    String getDescription(int itemNo);
    ArrayList<MenuItem> getMenuItems();
    
}
