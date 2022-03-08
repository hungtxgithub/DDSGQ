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
import models.CardType;
import models.Cart;
import models.Price;
import models.Product;
import models.Supplier;

/**
 *
 * @author hungt
 */
public class CartDAO extends DBContext {

//    public List<Cart> insertCart(){
//        return null;
//    }
    public void insertCart(int productID, int quantity, int userID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("INSERT INTO Cart VALUES(?,?,?)");
            ps.setInt(1, productID);
            ps.setInt(2, quantity);
            ps.setInt(3, userID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }


    public List<Cart> getCartByUserID(int userID) {
        List<Cart> list = new ArrayList<>();
         try {
            PreparedStatement ps = getConnection().prepareStatement("select cart.CartID, cardTypeName,supplierName, Image, price, discount, Quantity from CardType inner join Supplier on CardType.CardTypeID = Supplier.CardTypeID inner join Price on Supplier.SupplierID = price.SupplierID inner join Product on Price.PriceID = Product.PriceID inner join Cart on Product.ProductID = Cart.ProductID where UserID = ?");
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Cart(rs.getInt("cartID"), new Product(new Price(rs.getFloat("price"), new Supplier(rs.getString("supplierName"), new CardType(rs.getString("cardTypeName")), rs.getString("image")), rs.getFloat("discount"))), rs.getInt("quantity")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(1);
        CartDAO dao = new CartDAO();
        List<Cart> list = dao.getCartByUserID(37);
        for (Cart cart : list) {
            System.out.println(cart);
        }
    }

}
