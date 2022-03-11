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
    private Price price;
    private int quantity;
    private int userID;

    public Cart() {
    }

    public Cart(int cartID, Price price, int quantity) {
        this.cartID = cartID;
        this.price = price;
        this.quantity = quantity;
    }

    public Cart(int cartID, Price price, int quantity, int userID) {
        this.cartID = cartID;
        this.price = price;
        this.quantity = quantity;
        this.userID = userID;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Cart{" + "cartID=" + cartID + ", price=" + price + ", quantity=" + quantity + ", userID=" + userID + '}';
    }

    

    
    
}
