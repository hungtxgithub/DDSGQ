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
import models.User;

/**
 *
 * @author HungNT
 */
public class ManageDAO extends DBContext{
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        try {
            PreparedStatement ps = getConnection().prepareStatement("select * from [user]");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getFloat(6), rs.getFloat(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getString(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public static void main(String[] args) {
        ManageDAO dao = new ManageDAO();
        System.out.println(dao.getAllUser());
    }

}
