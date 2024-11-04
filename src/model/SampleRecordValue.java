/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.ResultSet;

public class SampleRecordValue {

    private int sampleRecordValueId;
    private Timestamp sampleRecordValueTime;
    private String sampleRecordValueLocation;
    private String sampleRecordValueReason;
    private String sampleRecordValueAuthor;
    private int sampleRecordId; // Foreign key to SampleRecord
    private byte[] sampleRecordValueImage;

    // Constructors
    public SampleRecordValue() {
    }

    public SampleRecordValue(String sampleRecordValueLocation, String sampleRecordValueReason,
            String sampleRecordValueAuthor, int sampleRecordId) {
        this.sampleRecordValueLocation = sampleRecordValueLocation;
        this.sampleRecordValueReason = sampleRecordValueReason;
        this.sampleRecordValueAuthor = sampleRecordValueAuthor;
        this.sampleRecordId = sampleRecordId;
    }

    // Constructor mới có thêm tham số ảnh
    public SampleRecordValue(String sampleRecordValueLocation, String sampleRecordValueReason,
            String sampleRecordValueAuthor, int sampleRecordId, byte[] sampleRecordValueImage) {
        this.sampleRecordValueLocation = sampleRecordValueLocation;
        this.sampleRecordValueReason = sampleRecordValueReason;
        this.sampleRecordValueAuthor = sampleRecordValueAuthor;
        this.sampleRecordId = sampleRecordId;
        this.sampleRecordValueImage = sampleRecordValueImage;
    }

// Getter và Setter cho ảnh
    public byte[] getSampleRecordValueImage() {
        return sampleRecordValueImage;
    }

    public void setSampleRecordValueImage(byte[] sampleRecordValueImage) {
        this.sampleRecordValueImage = sampleRecordValueImage;
    }

    // Getters and Setters
    public int getSampleRecordValueId() {
        return sampleRecordValueId;
    }

    public void setSampleRecordValueId(int sampleRecordValueId) {
        this.sampleRecordValueId = sampleRecordValueId;
    }

    public Timestamp getSampleRecordValueTime() {
        return sampleRecordValueTime;
    }

    public void setSampleRecordValueTime(Timestamp sampleRecordValueTime) {
        this.sampleRecordValueTime = sampleRecordValueTime;
    }

    public String getSampleRecordValueLocation() {
        return sampleRecordValueLocation;
    }

    public void setSampleRecordValueLocation(String sampleRecordValueLocation) {
        this.sampleRecordValueLocation = sampleRecordValueLocation;
    }

    public String getSampleRecordValueReason() {
        return sampleRecordValueReason;
    }

    public void setSampleRecordValueReason(String sampleRecordValueReason) {
        this.sampleRecordValueReason = sampleRecordValueReason;
    }

    public String getSampleRecordValueAuthor() {
        return sampleRecordValueAuthor;
    }

    public void setSampleRecordValueAuthor(String sampleRecordValueAuthor) {
        this.sampleRecordValueAuthor = sampleRecordValueAuthor;
    }

    public int getSampleRecordId() {
        return sampleRecordId;
    }

    public void setSampleRecordId(int sampleRecordId) {
        this.sampleRecordId = sampleRecordId;
    }

    // Add a new SampleRecordValue to the database
    public void addSampleRecordValue(Connection conn) throws SQLException {
        String insertSampleValueSQL = "INSERT INTO SampleRecordValue (sampleRecordValue_time, sampleRecordValue_location, sampleRecordValue_reason, sampleRecordValue_author, sampleRecord_id) VALUES (NOW(), ?, ?, ?, ?)";
        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement(insertSampleValueSQL);
            pstmt.setString(1, sampleRecordValueLocation);
            pstmt.setString(2, sampleRecordValueReason);
            pstmt.setString(3, sampleRecordValueAuthor);
            pstmt.setInt(4, sampleRecordId);
            pstmt.executeUpdate();
            System.out.println("SampleRecordValue added for SampleRecord ID: " + sampleRecordId);
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
        }
    }

    // Update SampleRecordValue in the database
    public void updateSampleRecordValue(Connection conn, String newLocation, String newReason) throws SQLException {
        String updateSQL = "UPDATE SampleRecordValue SET sampleRecordValue_location = ?, sampleRecordValue_reason = ? WHERE sampleRecord_id = ?";
        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, newLocation);
            pstmt.setString(2, newReason);
            pstmt.setInt(3, sampleRecordId);
            pstmt.executeUpdate();
            System.out.println("SampleRecordValue updated with new location: " + newLocation + " and reason: " + newReason);
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
        }
    }

    // Delete the SampleRecord from the database
    public void deleteSampleRecordValue(Connection conn) throws SQLException {
        String deleteSQL = "DELETE FROM SampleRecordValue WHERE sampleRecordValue_id = ?";
        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setInt(1, sampleRecordValueId);
            pstmt.executeUpdate();
            System.out.println("SampleRecord deleted with ID: " + sampleRecordValueId);
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
        }
    }

    public static void deleteAllBySampleRecordId(Connection conn, int sampleRecordId) throws SQLException {
        String deleteSQL = "DELETE FROM SampleRecordValue WHERE sampleRecord_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, sampleRecordId);
            pstmt.executeUpdate();
        }
    }

    // Lấy một SampleRecordValue dựa trên sampleRecordId
    public static SampleRecordValue getSampleRecordValueBySampleRecordId(Connection conn, int sampleRecordId) throws SQLException {
        String selectSQL = "SELECT * FROM SampleRecordValue WHERE sampleRecord_id = ?";
        SampleRecordValue sampleRecordValue = null;

        try (PreparedStatement pstmt = conn.prepareStatement(selectSQL)) {
            pstmt.setInt(1, sampleRecordId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                sampleRecordValue = new SampleRecordValue();
                sampleRecordValue.setSampleRecordValueId(rs.getInt("sampleRecordValue_id"));
                sampleRecordValue.setSampleRecordValueTime(rs.getTimestamp("sampleRecordValue_time"));
                sampleRecordValue.setSampleRecordValueLocation(rs.getString("sampleRecordValue_location"));
                sampleRecordValue.setSampleRecordValueReason(rs.getString("sampleRecordValue_reason"));
                sampleRecordValue.setSampleRecordValueAuthor(rs.getString("sampleRecordValue_author"));
                sampleRecordValue.setSampleRecordId(rs.getInt("sampleRecord_id"));
            }
        }
        return sampleRecordValue;
    }

    // toString method
    @Override
    public String toString() {
        return "SampleRecordValue{"
                + "sampleRecordValueId=" + sampleRecordValueId
                + ", sampleRecordValueTime=" + sampleRecordValueTime
                + ", sampleRecordValueLocation='" + sampleRecordValueLocation + '\''
                + ", sampleRecordValueReason='" + sampleRecordValueReason + '\''
                + ", sampleRecordValueAuthor='" + sampleRecordValueAuthor + '\''
                + ", sampleRecordId=" + sampleRecordId
                + '}';
    }

    public boolean insertSampleRecordValue(Connection conn, String location, String reason, byte[] imageBytes) {
    String sql = "INSERT INTO samplerecordvalue (sampleRecordValue_location, sampleRecordValue_reason, sampleRecordValue_image) VALUES (?, ?, ?)";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, location);
        pstmt.setString(2, reason);
        pstmt.setBytes(3, imageBytes);
        int affectedRows = pstmt.executeUpdate(); // Thực hiện câu lệnh chèn
        return affectedRows > 0; // Trả về true nếu ít nhất một dòng bị ảnh hưởng
    } catch (SQLException e) {
        e.printStackTrace();
        return false; // Trả về false nếu có lỗi xảy ra
    }
}


    public static SampleRecordValue getSampleRecordValueCoAnhBySampleRecordId(Connection conn, int sampleRecordId) throws SQLException {
        String selectSQL = "SELECT * FROM SampleRecordValue WHERE sampleRecord_id = ?";
        SampleRecordValue sampleRecordValue = null;

        try (PreparedStatement pstmt = conn.prepareStatement(selectSQL)) {
            pstmt.setInt(1, sampleRecordId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                sampleRecordValue = new SampleRecordValue();
                sampleRecordValue.setSampleRecordValueId(rs.getInt("sampleRecordValue_id"));
                sampleRecordValue.setSampleRecordValueTime(rs.getTimestamp("sampleRecordValue_time"));
                sampleRecordValue.setSampleRecordValueLocation(rs.getString("sampleRecordValue_location"));
                sampleRecordValue.setSampleRecordValueReason(rs.getString("sampleRecordValue_reason"));
                sampleRecordValue.setSampleRecordValueAuthor(rs.getString("sampleRecordValue_author"));
                sampleRecordValue.setSampleRecordId(rs.getInt("sampleRecord_id"));
                sampleRecordValue.setSampleRecordValueImage(rs.getBytes("sampleRecordValue_image"));  // Lấy ảnh từ BLOB
            }
        }
        return sampleRecordValue;
    }

}
