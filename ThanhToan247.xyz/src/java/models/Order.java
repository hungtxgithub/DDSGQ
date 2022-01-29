/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hungt
 */
public class Order {
    private int orderID;
    private String orderCode;
    private int productID;
    private int quantity;
    private String time;
    private int userID;

    public Order() {
    }

    public Order(int orderID, String orderCode, int productID, int quantity, String time, int userID) {
        this.orderID = orderID;
        this.orderCode = orderCode;
        this.productID = productID;
        this.quantity = quantity;
        this.time = time;
        this.userID = userID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", orderCode=" + orderCode + ", productID=" + productID + ", quantity=" + quantity + ", time=" + time + ", userID=" + userID + '}';
    }

   
    
    
}
