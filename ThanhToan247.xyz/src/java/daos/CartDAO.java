/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.PreparedStatement;

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
     
     public static void main(String[] args) {
        CartDAO dao = new CartDAO();
        dao.insertCart(1, 1, 37);
    }

}
