package daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.User;

public class UserDAO extends DBContext {

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

    public void updateRemainingMoney(int userID, float money) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE dbo.[User] SET RemainingMoney = RemainingMoney+? WHERE userID = ?");
            ps.setFloat(1, money);
            ps.setInt(2, userID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
