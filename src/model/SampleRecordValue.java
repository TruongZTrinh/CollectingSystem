/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SampleRecordValue {
    private String sampleRecordValue_time;
    private String sampleRecordValue_location;
    private String sampleRecordValue_reason;
    private String sampleRecordValue_author;

    // Constructor
    public SampleRecordValue(String location, String reason, String author) {
        this.sampleRecordValue_location = location;
        this.sampleRecordValue_reason = reason;
        this.sampleRecordValue_author = author;
    }

    // Getter và Setter
    public String getSampleRecordValueTime() {
        return sampleRecordValue_time;
    }

    public String getSampleRecordValueLocation() {
        return sampleRecordValue_location;
    }

    public String getSampleRecordValueReason() {
        return sampleRecordValue_reason;
    }

    public String getSampleRecordValueAuthor() {
        return sampleRecordValue_author;
    }

    // Phương thức với loại
    public void addSampleRecordValue(Connection conn, int sampleRecordId) throws SQLException {
       
        String insertSampleValueSQL = "INSERT INTO SampleRecordValue (sampleRecordValue_time, sampleRecordValue_location, sampleRecordValue_reason, sampleRecordValue_author, sampleRecord_id) VALUES (NOW(), ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertSampleValueSQL);

        pstmt.setString(1, sampleRecordValue_location);  // Chỉnh lại chỉ số tham số
        pstmt.setString(2, sampleRecordValue_reason);  // Chỉnh lại chỉ số tham số
        pstmt.setString(3, sampleRecordValue_author);  // Chỉnh lại chỉ số tham số
        pstmt.setInt(4, sampleRecordId);  // Chỉnh lại chỉ số tham số
        pstmt.executeUpdate();

        pstmt.close();
        conn.close();
}

}
