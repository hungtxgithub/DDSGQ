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
public class Supplier {
    private int supplierID;
    private String name;
    private CardType cardTypeID;
    private String image;

    public Supplier() {
    }

    public Supplier(int supplierID) {
        this.supplierID = supplierID;
    }

    public Supplier(int supplierID, String name, CardType cardTypeID, String image) {
        this.supplierID = supplierID;
        this.name = name;
        this.cardTypeID = cardTypeID;
        this.image = image;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardType getCardTypeID() {
        return cardTypeID;
    }

    public void setCardTypeID(CardType cardTypeID) {
        this.cardTypeID = cardTypeID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Supplier{" + "supplierID=" + supplierID + ", name=" + name + ", cardTypeID=" + cardTypeID + ", image=" + image + '}';
    }
 
    
    
}
