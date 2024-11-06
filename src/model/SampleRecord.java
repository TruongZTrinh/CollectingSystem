package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SampleRecord {

    private int sampleRecordId;
    private String sampleRecordName;
    private int userId; // Foreign key to User

    // Constructors
    public SampleRecord() {
    }

    public SampleRecord(int sampleRecordId, String sampleRecordName, int userId) {
        this.sampleRecordId = sampleRecordId;
        this.sampleRecordName = sampleRecordName;
        this.userId = userId;
    }

    // Getters and Setters
    public int getSampleRecordId() {
        return sampleRecordId;
    }

    public void setSampleRecordId(int sampleRecordId) {
        this.sampleRecordId = sampleRecordId;
    }

    public String getSampleRecordName() {
        return sampleRecordName;
    }

    public void setSampleRecordName(String sampleRecordName) {
        this.sampleRecordName = sampleRecordName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Create a new SampleRecord in the database
    public void createSampleRecord(Connection conn) throws SQLException {
        String insertRecordSQL = "INSERT INTO SampleRecord (sampleRecord_id, sampleRecord_name, user_id) VALUES (?, ?, ?)";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = conn.prepareStatement(insertRecordSQL, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, sampleRecordId);
            pstmt.setString(2, sampleRecordName);
            pstmt.setInt(3, userId);
            pstmt.executeUpdate();

            rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                sampleRecordId = rs.getInt(1);
                System.out.println("New SampleRecord ID: " + sampleRecordId);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
        }
    }

    // Delete the SampleRecord from the database
    public void deleteSampleRecord(Connection conn) throws SQLException {
        String deleteSQL = "DELETE FROM SampleRecord WHERE sampleRecord_id = ?";
        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setInt(1, sampleRecordId);
            pstmt.executeUpdate();
            System.out.println("SampleRecord deleted with ID: " + sampleRecordId);
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
        }
    }

    // Update the SampleRecord in the database
    public void updateSampleRecord(Connection conn, String newName) throws SQLException {
        String updateSQL = "UPDATE SampleRecord SET sampleRecord_name = ? WHERE sampleRecord_id = ?";
        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, newName);
            pstmt.setInt(2, sampleRecordId);
            pstmt.executeUpdate();
            System.out.println("SampleRecord updated with new name: " + newName);
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
        }
    }

    // Get SampleRecord details
    public String getSampleRecordDetails() {
        return "ID: " + sampleRecordId + ", Name: " + sampleRecordName + ", User ID: " + userId;
    }

    // Get a list of all SampleRecords from the database
    public List<SampleRecord> getSampleRecords(Connection conn) throws SQLException {
        String selectSQL = "SELECT sampleRecord_id, sampleRecord_name, user_id FROM SampleRecord";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<SampleRecord> sampleRecords = new ArrayList<>();

        try {
            pstmt = conn.prepareStatement(selectSQL);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("sampleRecord_id");
                String name = rs.getString("sampleRecord_name");
                int userId = rs.getInt("user_id");
                SampleRecord sampleRecord = new SampleRecord(id, name, userId);
                sampleRecords.add(sampleRecord);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
        }

        return sampleRecords;
    }

    
    // Get a SampleRecord by its ID
public SampleRecord getSampleRecordById(Connection conn, int id) throws SQLException {
    String selectSQL = "SELECT sampleRecord_id, sampleRecord_name, user_id FROM SampleRecord WHERE sampleRecord_id = ?";
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    SampleRecord sampleRecord = null;

    try {
        pstmt = conn.prepareStatement(selectSQL);
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();

        if (rs.next()) {
            sampleRecordId = rs.getInt("sampleRecord_id");
            sampleRecordName = rs.getString("sampleRecord_name");
            userId = rs.getInt("user_id");
            sampleRecord = new SampleRecord(sampleRecordId, sampleRecordName, userId);
        }
    } finally {
        if (rs != null) {
            rs.close();
        }
        if (pstmt != null) {
            pstmt.close();
        }
    }

    return sampleRecord; // Trả về SampleRecord nếu tìm thấy, ngược lại là null
}

    // toString method
    @Override
    public String toString() {
        return "SampleRecord{"
                + "sampleRecordId=" + sampleRecordId
                + ", sampleRecordName='" + sampleRecordName + '\''
                + ", userId=" + userId
                + '}';
    }
}
