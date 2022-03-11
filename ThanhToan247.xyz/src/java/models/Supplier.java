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
    private String supplierName;
    private CardType cardType;
    private String image;

    public Supplier() {
    }

    public Supplier(int supplierID) {
        this.supplierID = supplierID;
    }

    public Supplier(String supplierName, String image) {
        this.supplierName = supplierName;
        this.image = image;
    }

    public Supplier(int supplierID, String supplierName, CardType cardType, String image) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.cardType = cardType;
        this.image = image;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Supplier{" + "supplierID=" + supplierID + ", supplierName=" + supplierName + ", cardType=" + cardType + ", image=" + image + '}';
    }

    
    
}
