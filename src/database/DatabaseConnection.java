package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/collecting_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Kết nối thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Kết nối thất bại");
        }
        return connection;
    }
    
}
