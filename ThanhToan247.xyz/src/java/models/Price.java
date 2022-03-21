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
    private Supplier supplier;
    private float discount;

    public Price() {
    }

    public Price(float price, Supplier supplier) {
        this.price = price;
        this.supplier = supplier;
    }

    public Price(Supplier supplier) {
        this.supplier = supplier;
    }

    public Price(int priceID) {
        this.priceID = priceID;
    }

    public Price(int priceID, float price, float discount) {
        this.priceID = priceID;
        this.price = price;
        this.discount = discount;
    }

    public Price(float price, float discount) {
        this.price = price;
        this.discount = discount;
    }

    public Price(float price, Supplier supplier, float discount) {
        this.price = price;
        this.supplier = supplier;
        this.discount = discount;
    }

    
    
    public Price(int priceID, float price, Supplier supplier, float discount) {
        this.priceID = priceID;
        this.price = price;
        this.supplier = supplier;
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Price{" + "priceID=" + priceID + ", price=" + price + ", supplier=" + supplier + ", discount=" + discount + '}';
    }
    
    
    
}
