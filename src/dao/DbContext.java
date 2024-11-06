package dao;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbContext {
    private static final String URL_DB = "jdbc:mysql://localhost:3306/project";
    private static final String USER = "root";
    private static final String PASS = "123456";

    public Connection getConnection() {
        Connection cnt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnt = DriverManager.getConnection(URL_DB, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cnt;
    }
}
