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
public class Cart {
    private int cartID;
    private int productID;
    private int quantity;
    private int userID;

    public Cart() {
    }

    public Cart(int cartID, int productID, int quantity, int userID) {
        this.cartID = cartID;
        this.productID = productID;
        this.quantity = quantity;
        this.userID = userID;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Cart{" + "cartID=" + cartID + ", productID=" + productID + ", quantity=" + quantity + ", userID=" + userID + '}';
    }
    
    
}
