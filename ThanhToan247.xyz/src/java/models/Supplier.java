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
    private int cardTypeID;
    private String image;

    public Supplier() {
    }

    public Supplier(int supplierID, String supplierName, int cardTypeID, String image) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.cardTypeID = cardTypeID;
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

    public int getCardTypeID() {
        return cardTypeID;
    }

    public void setCardTypeID(int cardTypeID) {
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
        return "Supplier{" + "supplierID=" + supplierID + ", supplierName=" + supplierName + ", cardTypeID=" + cardTypeID + ", image=" + image + '}';
    }

   
    
    
}
