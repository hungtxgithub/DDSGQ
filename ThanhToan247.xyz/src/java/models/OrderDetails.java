/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author HungNT
 */
public class OrderDetails {

    private int orderDetailsID;
    private Order order;
    private List<Product> products;

    public OrderDetails() {
    }

    public OrderDetails(int orderDetailsID, Order order) {
        this.orderDetailsID = orderDetailsID;
        this.order = order;
    }

    public OrderDetails(Order order) {
        this.order = order;
    }

    public OrderDetails(int orderDetailsID, Order order, List<Product> products) {
        this.orderDetailsID = orderDetailsID;
        this.order = order;
        this.products = products;
    }

    public OrderDetails(Order order, List<Product> products) {
        this.order = order;
        this.products = products;
    }


    public int getOrderDetailsID() {
        return orderDetailsID;
    }

    public void setOrderDetailsID(int orderDetailsID) {
        this.orderDetailsID = orderDetailsID;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "orderDetailsID=" + orderDetailsID + ", order=" + order + ", products=" + products + '}';
    }

    
}
