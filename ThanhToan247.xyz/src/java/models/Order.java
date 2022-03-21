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
    private Price price;
    private int quantity;
    private float priceOrder;
    private String time;
    private int userID;

    public Order() {
    }

    public Order(String orderCode, Price price, int quantity, String time) {
        this.orderCode = orderCode;
        this.price = price;
        this.quantity = quantity;
        this.time = time;
    }

    public Order(int orderID, String orderCode, Price price, int quantity, float priceOrder, String time, int userID) {
        this.orderID = orderID;
        this.orderCode = orderCode;
        this.price = price;
        this.quantity = quantity;
        this.priceOrder = priceOrder;
        this.time = time;
        this.userID = userID;
    }

    public Order(int orderID, String orderCode, Price price, int quantity, float priceOrder, String time) {
        this.orderID = orderID;
        this.orderCode = orderCode;
        this.price = price;
        this.quantity = quantity;
        this.priceOrder = priceOrder;
        this.time = time;
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

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(float priceOrder) {
        this.priceOrder = priceOrder;
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
        return "Order{" + "orderID=" + orderID + ", orderCode=" + orderCode + ", price=" + price + ", quantity=" + quantity + ", priceOrder=" + priceOrder + ", time=" + time + ", userID=" + userID + '}';
    }

    
    
}
