package daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Price;
import models.Supplier;
import models.User;

public class DAO extends DBContext {
    
    public boolean checkLogin(String username, String password) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM [User] WHERE username = ? AND password = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean checkUsername(String username) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM [User] WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public User getUserByUsername(String username) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM [User] WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getFloat(6), rs.getFloat(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getString(11));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void insertUser(String username, String password, String email, float remainingMoney, float totalMoneyLoaded, float discount, String avatar, int role, int status, String timeCreated) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("INSERT INTO [User] VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setFloat(4, remainingMoney);
            ps.setFloat(5, totalMoneyLoaded);
            ps.setFloat(6, discount);
            ps.setString(7, avatar);
            ps.setInt(8, role);
            ps.setInt(9, status);
            ps.setString(10, timeCreated);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void updatePassword(String username, String password) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE dbo.[User] SET passWord = ? WHERE userName = ?");
            ps.setString(1, password);
            ps.setString(2, username);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<Supplier> getSupplierByCardTypeID(int CardTypeID) {
        List<Supplier> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM Supplier WHERE CardTypeID = ?");
            ps.setInt(1, CardTypeID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Supplier(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
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
                list.add(new Price(rs.getInt(1), rs.getFloat(2), rs.getInt(3), rs.getFloat(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public static void main(String[] args) {
        DAO dao = new DAO();
        System.out.println(dao.getPriceBySupplierID(1));
    }
}
