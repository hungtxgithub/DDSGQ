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
    private Product product;
    private int quantity;
    private int userID;

    public Cart() {
    }

    public Cart(int cartID, Product product, int quantity, int userID) {
        this.cartID = cartID;
        this.product = product;
        this.quantity = quantity;
        this.userID = userID;
    }

    public Cart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Cart(int cartID, Product product, int quantity) {
        this.cartID = cartID;
        this.product = product;
        this.quantity = quantity;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        return "Cart{" + "cartID=" + cartID + ", product=" + product + ", quantity=" + quantity + ", userID=" + userID + '}';
    }

}
