package model;

import java.sql.Connection;
import database.DatabaseConnection;
import java.util.ArrayList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleRecord {
    private int sampleRecord_id;
    private String sampleRecord_name;
    private ArrayList<SampleRecordAttribute> attributes = new ArrayList<>();
    private ArrayList<SampleRecordValue> values = new ArrayList<>();

    // Phương thức thêm thuộc tính
    public void addAttribute(SampleRecordAttribute attribute) {
        attributes.add(attribute);
    }

    // Phương thức thêm giá trị
    public void addValue(SampleRecordValue value) {
        values.add(value);
    }
    // Constructor
    public SampleRecord(int id, String name) {
        this.sampleRecord_id = id;
        this.sampleRecord_name = name;
    }
    public SampleRecord(String name) {
        this.sampleRecord_name = name;
    }

    // Phương thức tạo bản ghi
    public void createSampleRecord(Connection conn) throws SQLException {
        
        String insertRecordSQL = "INSERT INTO SampleRecord (sampleRecord_id, sampleRecord_name) VALUES (?, ?)";  // Sửa câu lệnh SQL
        PreparedStatement pstmt = conn.prepareStatement(insertRecordSQL, PreparedStatement.RETURN_GENERATED_KEYS);  // Đảm bảo lấy khóa tự động sinh ra
        pstmt.setInt(1, sampleRecord_id);
        pstmt.setString(2, sampleRecord_name);
        pstmt.executeUpdate();

        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            sampleRecord_id = rs.getInt(1);  // Lấy sampleRecord_id mới tạo
            System.out.println("New SampleRecord ID: " + sampleRecord_id);
        }

        rs.close();
        pstmt.close();
}


    // Phương thức xóa bản ghi
    public void deleteSampleRecord(Connection conn) throws SQLException {
        // Logic để xóa SampleRecord
        String deleteSQL = "DELETE FROM SampleRecord WHERE sampleRecord_name = " + sampleRecord_name;
        PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
        pstmt.executeUpdate();
    }

    // Phương thức lấy thông tin chi tiết bản ghi
    public String getSampleRecordDetails() {
        return "ID: " + sampleRecord_id + ", Name: " + sampleRecord_name;
    }

    // Phương thức cập nhật bản ghi
    public void updateSampleRecord(String name) {
        this.sampleRecord_name = name;
    }

    // Getter và Setter
    public int getSampleRecordId() {
        return sampleRecord_id;
    }

    public String getSampleRecordName() {
        return sampleRecord_name;
    }

    public void setSampleRecordName(String name) {
        this.sampleRecord_name = name;
    }
}
