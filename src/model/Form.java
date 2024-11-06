package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Form {
    private int formId;
    private String formName;
    private String formDescription;
    private int userId;
    private int sampleRecordId;

    // Constructor
    public Form(int formId, String formName, String formDescription, int userId, int sampleRecordId) {
        this.formId = formId;
        this.formName = formName;
        this.formDescription = formDescription;
        this.userId = userId;
        this.sampleRecordId = sampleRecordId;
    }

    // Create
    public void createForm(Connection conn) throws SQLException {
        String sql = "INSERT INTO Form (form_name, form_des, user_id, samplerecord_id) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, formName);
        pstmt.setString(2, formDescription);
        pstmt.setInt(3, userId);
        pstmt.setInt(4, sampleRecordId);
        pstmt.executeUpdate();

        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            this.formId = rs.getInt(1);
        }
        rs.close();
        pstmt.close();
    }

    // Read
    public static Form getFormById(Connection conn, int id) throws SQLException {
        String sql = "SELECT * FROM Form WHERE form_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        Form form = null;
        if (rs.next()) {
            form = new Form(rs.getInt("form_id"), rs.getString("form_name"), rs.getString("form_des"), 
                            rs.getInt("user_id"), rs.getInt("samplerecord_id"));
        }
        rs.close();
        pstmt.close();
        return form;
    }

    // Update
    public void updateForm(Connection conn) throws SQLException {
        String sql = "UPDATE Form SET form_name = ?, form_des = ?, user_id = ?, samplerecord_id = ? WHERE form_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, formName);
        pstmt.setString(2, formDescription);
        pstmt.setInt(3, userId);
        pstmt.setInt(4, sampleRecordId);
        pstmt.setInt(5, formId);
        pstmt.executeUpdate();
        pstmt.close();
    }

    // Delete
    public void deleteForm(Connection conn) throws SQLException {
        String sql = "DELETE FROM Form WHERE form_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, formId);
        pstmt.executeUpdate();
        pstmt.close();
    }
}