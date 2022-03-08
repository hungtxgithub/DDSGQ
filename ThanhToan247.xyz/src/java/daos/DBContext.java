package daos;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
     protected Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://DESKTOP-9C5LSTM\\SQLSV:1433; databaseName=ThanhToan247";
        return DriverManager.getConnection(url, "sa", "hung12345");
    }
     
     
     public static void main(String[] args) throws Exception {
         System.out.println(new DBContext().getConnection());
    }
}
