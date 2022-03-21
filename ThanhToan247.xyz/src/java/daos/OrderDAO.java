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
import models.Order;
import models.OrderDetails;
import models.Price;
import models.Product;
import models.Supplier;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author HungNT
 */
public class OrderDAO extends DBContext {

    public void insertOrderByCart(List<Cart> cart, float discountByUser) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("INSERT INTO [dbo].[Order]\n"
                    + "           ([OrderCode]\n"
                    + "           ,[PriceID]\n"
                    + "           ,[Quantity]\n"
                    + "           ,[PriceOrder]\n"
                    + "           ,[UserID])\n"
                    + "     VALUES (?,?,?,?,?)");
            for (Cart c : cart) {
                ps.setString(1, RandomStringUtils.randomAlphabetic(9));
                ps.setInt(2, c.getPrice().getPriceID());
                ps.setInt(3, c.getQuantity());
                float price = c.getPrice().getPrice() - c.getPrice().getPrice() * c.getPrice().getDiscount() / 100;
                ps.setFloat(4, (price - price * discountByUser / 100) * c.getQuantity());
                ps.setInt(5, c.getUserID());
                ps.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    public void insertOrderDetailsByOrderID(List<Integer> orderID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("INSERT INTO [dbo].[OrderDetails]\n"
                    + "                                             ([OrderID])\n"
                    + "                                             VALUES (?)");
            for (Integer i : orderID) {
                ps.setInt(1, i);
                ps.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    public void deleteOrderByCart() {
        try {
            PreparedStatement ps = getConnection().prepareStatement("DELETE FROM [Order]");
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Integer> getOrderIDByUserID(int userID) {
        List<Integer> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("select orderID from [order] where userID = ?");
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> displayOrderByUserID(int userID) {
        List<Order> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("select OrderID, OrderCode, supplierName, Price, Quantity, PriceOrder, Time from [Order] inner join Price on [Order].PriceID = price.PriceID inner join Supplier on Price.SupplierID = Supplier.SupplierID where UserID = ? order by time desc");
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt("orderID"), rs.getString("orderCode"), new Price(rs.getInt("price"), new Supplier(rs.getString("supplierName"))), rs.getInt("Quantity"), rs.getFloat("PriceOrder"), rs.getString("Time")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getSeriPinCodeByOrderID(int orderID) {
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("select top (select Quantity from [Order] where OrderID = ?)\n"
                    + "SeriCode, PinCode from [Order] join Price on [Order].PriceID = Price.PriceID join \n"
                    + "Product on Product.PriceID = Price.PriceID where OrderID = ? and status = 0");
            ps.setInt(1, orderID);
            ps.setInt(2, orderID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public OrderDetails getOrderdetailsByOrderID(int id) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("select orderCode,supplierName,Price, Quantity, time "
                    + "from [Order] join Price on [Order].PriceID = Price.PriceID "
                    + "join Supplier on Price.SupplierID = Supplier.SupplierID where orderID = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new OrderDetails(new Order(rs.getString("orderCode"),
                        new Price(rs.getFloat("price"), new Supplier(rs.getString("supplierName"))),
                        rs.getInt("quantity"), rs.getString("time")), getSeriPinCodeByOrderID(id));
            }
        } catch (Exception e) {
        }
        return null;
    }



    public int getTotalOrderByUserID(int userID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("SELECT count(*) FROM dbo.[Order] where userID = ?");
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

//         List<Order> list = new ArrayList<>();
//        try {
//            PreparedStatement ps = getConnection().prepareStatement("select * from [Order] where userID = ? order by OrderID offset ? rows fetch next ? rows only");
//            ps.setInt(1, userID);
//            ps.setInt(2, (page - 1) * entries);
//            ps.setInt(3, entries);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                list.add(new Order(rs.getInt(1), rs.getString(2), new Price, rs.getInt(4), rs.getFloat(5), rs.getString(6), rs.getInt(7)));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
    public List<Order> paggingOrderByUserID(int page, int entries, int userID) {
        List<Order> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("select OrderID, OrderCode, supplierName, Price, Quantity, PriceOrder, Time from [Order] inner join Price on [Order].PriceID = price.PriceID inner join Supplier on Price.SupplierID = Supplier.SupplierID where UserID = ? order by OrderID desc offset ? rows fetch next ? rows only");
            ps.setInt(1, userID);
            ps.setInt(2, (page - 1) * entries);
            ps.setInt(3, entries);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt("orderID"), rs.getString("orderCode"), new Price(rs.getInt("price"), new Supplier(rs.getString("supplierName"))), rs.getInt("Quantity"), rs.getFloat("PriceOrder"), rs.getString("Time")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println(new OrderDAO().getTotalOrderByUserID(37));
    }
}
