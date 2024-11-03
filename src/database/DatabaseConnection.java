/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chuna
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/nameSQL";
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
