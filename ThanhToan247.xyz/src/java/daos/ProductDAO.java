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
import models.Price;
import models.Supplier;

/**
 *
 * @author hungt
 */
public class ProductDAO extends DBContext {

    public List<Supplier> getSupplierByCardTypeID(int CardTypeID) {
        List<Supplier> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM Supplier WHERE CardTypeID = ?");
            ps.setInt(1, CardTypeID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Supplier(rs.getInt(1), rs.getString(2), new CardType(rs.getString(3)), rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Price> getPriceBySupplierID(int supplierID) {
        List<Price> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM dbo.Price WHERE SupplierID = ?");
            ps.setInt(1, supplierID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Price(rs.getInt(1), rs.getFloat(2), new Supplier(rs.getInt(3)), rs.getFloat(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int getToalProductAvailable(int supplierID, float price) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("select count(*) from product inner join Price on product. PriceID = price.PriceID inner join supplier on Supplier.SupplierID = price.SupplierID where Supplier.SupplierID = ? and Price.Price = ? ");
            ps.setInt(1, supplierID);
            ps.setFloat(2, price);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getPriceIDBySupplierIDAndPrice(int supplierID, float price) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("select priceid from price where price.SupplierID = ? and price.Price = ?");
            ps.setInt(1, supplierID);
            ps.setFloat(2, price);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Integer> getProductIDByPriceID(int priceID) {
        List<Integer> listProductID = new ArrayList<Integer>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("select productid from product where PriceID = ? and status = 1");
            ps.setInt(1, priceID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listProductID.add(rs.getInt(1));
            }
        } catch (Exception e) {
        }
        return listProductID;
    }

    public void updateStatusByProductID(int status, List<Integer> orderID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE [dbo].[Product]\n"
                    + "   SET [Status] = ?\n"
                    + " WHERE productID = ?");
            for (Integer i : orderID) {
                ps.setInt(1, status);
                ps.setInt(2, i);
                ps.executeUpdate();
            }

        } catch (Exception e) {
        }
    }

    public List<Integer> getProductIDByOrderID(List<Integer> orderID) {
        List<Integer> list = new ArrayList<Integer>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("select productID from [order] join Price on [Order].PriceID = Price.PriceID "
                    + "join Product on Price.PriceID = Product.PriceID where orderID = ?");
            for (Integer integer : orderID) {
                ps.setInt(1, integer);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(rs.getInt(1));
                }
            }

        } catch (Exception e) {
        }
        return list;
    }
    
    

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1061);
        list.add(1062);
        System.out.println(dao.getProductIDByOrderID(list));
    }

    
}
