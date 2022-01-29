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
public class Price {
    private int priceID;
    private float price;
    private int supplierID;
    private float discount;

    public Price() {
    }

    public Price(int priceID, float price, int supplierID, float discount) {
        this.priceID = priceID;
        this.price = price;
        this.supplierID = supplierID;
        this.discount = discount;
    }

    public int getPriceID() {
        return priceID;
    }

    public void setPriceID(int priceID) {
        this.priceID = priceID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Price{" + "priceID=" + priceID + ", price=" + price + ", supplierID=" + supplierID + ", discount=" + discount + '}';
    }

    
    
    
}
