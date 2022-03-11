/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Cart;
import models.Price;
import models.Supplier;

/**
 *
 * @author hungt
 */
public class CartDAO extends DBContext {


    public void insertCart(int priceID, int quantity, int userID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("INSERT INTO Cart VALUES(?,?,?)");
            ps.setInt(1, priceID);
            ps.setInt(2, quantity);
            ps.setInt(3, userID);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }


    public List<Cart> getCartByUserID(int userID) {
        List<Cart> list = new ArrayList<>();
         try {
            PreparedStatement ps = getConnection().prepareStatement("select cart.CartID ,supplierName, Image, price, discount, Quantity from Supplier inner join Price on Supplier.SupplierID = price.SupplierID inner join Cart on Price.PriceID = Cart.PriceID where UserID = ?");
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Cart(rs.getInt("CartID"), new Price(rs.getFloat("price"), new Supplier(rs.getString("supplierName"), rs.getString("image")), rs.getFloat("discount")), rs.getInt("quantity")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void deleteCart(int cartID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("DELETE FROM Cart WHERE cartID = ?");
            ps.setInt(1, cartID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        
        CartDAO dao = new CartDAO();
//        dao.insertCart(2, 5, 37);
//        dao.deleteCart(1007);
        System.out.println(dao.getCartByUserID(37));
    }

}
