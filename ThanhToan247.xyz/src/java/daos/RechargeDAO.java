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
import models.HistoryRecharge;

/**
 *
 * @author hungt
 */
public class RechargeDAO extends DBContext{
     public List<HistoryRecharge> getHistoryRecharges(int userID) {
        List<HistoryRecharge> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM HistoryRecharge WHERE userID = ?");
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HistoryRecharge(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
     
      public void insertHistoryRecharge(String transactionID, float money, String time, int userID) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("INSERT INTO HistoryRecharge VALUES(?,?,?,?)");
            ps.setString(1, transactionID);
            ps.setFloat(2, money);
            ps.setString(3, time);
            ps.setInt(4, userID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        RechargeDAO dao = new RechargeDAO();
        System.out.println(dao.getHistoryRecharges(37).size());
    }
}
