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
    private int PriceID;
    private float Price;
    private Supplier supplierID;
    private float discount;

    public Price() {
    }

    public Price(int PriceID, float Price, Supplier supplierID, float discount) {
        this.PriceID = PriceID;
        this.Price = Price;
        this.supplierID = supplierID;
        this.discount = discount;
    }

    public int getPriceID() {
        return PriceID;
    }

    public void setPriceID(int PriceID) {
        this.PriceID = PriceID;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public Supplier getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Supplier supplierID) {
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
        return "Price{" + "PriceID=" + PriceID + ", Price=" + Price + ", supplierID=" + supplierID + ", discount=" + discount + '}';
    }
    
    
}
