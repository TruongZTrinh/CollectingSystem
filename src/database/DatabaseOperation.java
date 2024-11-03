/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author chuna
 */
public class DatabaseOperation {
    
    public static int getRowCount(Connection conn){
        int rowCount = 0;
        String query = "Select count(*) from SampleRecordValue";
        
        try (PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery()){
            
            if(rs.next()){
                rowCount = rs.getInt(1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowCount;
    }
    
   
    
}
