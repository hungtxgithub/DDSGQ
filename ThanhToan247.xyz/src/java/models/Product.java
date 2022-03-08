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
public class Product {
    private int productID;
    private String seriCode;
    private String pinCode;
    private Price price;

    public Product() {
    }

    public Product(int productID, Price price) {
        this.productID = productID;
        this.price = price;
    }

    public Product(Price price) {
        this.price = price;
    }

    public Product(int productID, String seriCode, String pinCode, Price price) {
        this.productID = productID;
        this.seriCode = seriCode;
        this.pinCode = pinCode;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getSeriCode() {
        return seriCode;
    }

    public void setSeriCode(String seriCode) {
        this.seriCode = seriCode;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", seriCode=" + seriCode + ", pinCode=" + pinCode + ", price=" + price + '}';
    }

    
    
    
}
