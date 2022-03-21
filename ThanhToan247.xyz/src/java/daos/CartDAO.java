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

    public void deleteCart() {
        try {
            PreparedStatement ps = getConnection().prepareStatement("DELETE FROM [Cart]");
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Cart> displayCartByUserID(int userID) {
        List<Cart> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("select cart.CartID ,supplierName, Image, price.PriceID, price, discount, Quantity, userID from Supplier inner join Price on Supplier.SupplierID = price.SupplierID inner join Cart on Price.PriceID = Cart.PriceID where UserID = ?");
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Cart(rs.getInt("CartID"), new Price(rs.getInt("priceID"), rs.getFloat("price"), new Supplier(rs.getString("supplierName"), rs.getString("image")), rs.getFloat("discount")), rs.getInt("quantity"), rs.getInt("userID")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Cart> getCartsByUserID(int userID) {
        List<Cart> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("select * from cart where UserID = ?");
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Cart(rs.getInt(1), new Price(rs.getInt(2)), rs.getInt(3), rs.getInt(4)));
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

    public void updateQuantityByPriceID(int quantity, int cartID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE Cart SET Quantity = ? where PriceID = ?");
            ps.setInt(1, quantity);
            ps.setInt(2, cartID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getQuantityByPriceID(int priceID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("select quantity from cart where priceID = ?");
            ps.setInt(1, priceID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
public void updateQuantityByCartID(int quantity, int cartID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE Cart SET Quantity = ? where CartID = ?");
            ps.setInt(1, quantity);
            ps.setInt(2, cartID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {

        CartDAO dao = new CartDAO();

        dao.updateQuantityByCartID(5, 2168);

    }

}
