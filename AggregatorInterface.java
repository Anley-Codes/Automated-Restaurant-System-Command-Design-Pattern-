/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import implementation.Menu;
import implementation.Orders;

/**
 *
 * @author Dr Issah
 */
public interface AggregatorInterface {

    public Menu getMenuObject();

    public Orders getOrdersObject();

}
