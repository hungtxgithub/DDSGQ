package daos;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
     protected Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://DESKTOP-TFOMFBK\\SQLEXPRESS:1433; databaseName=ThanhToan247";
        return DriverManager.getConnection(url, "sa", "sa");
    }
}
