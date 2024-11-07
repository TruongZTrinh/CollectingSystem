/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SampleRecordValue {

    private int sampleRecordValueId;
    private Timestamp sampleRecordValueTime;
    private String sampleRecordValueLocation;
    private String sampleRecordValueReason;
    private String sampleRecordValueAuthor;
    private int sampleRecordId;
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
//    public void addSampleRecordValue(Connection conn) throws SQLException {
//        String insertSampleValueSQL = "INSERT INTO SampleRecordValue (sampleRecordValue_time, sampleRecordValue_location, sampleRecordValue_reason, sampleRecordValue_author, sampleRecord_id) VALUES (NOW(), ?, ?, ?, ?)";
//        PreparedStatement pstmt = null;
//
//        try {
//            pstmt = conn.prepareStatement(insertSampleValueSQL);
//            pstmt.setString(1, sampleRecordValueLocation);
//            pstmt.setString(2, sampleRecordValueReason);
//            pstmt.setString(3, sampleRecordValueAuthor);
//            pstmt.setInt(4, sampleRecordId);
//            pstmt.executeUpdate();
//            System.out.println("SampleRecordValue added for SampleRecord ID: " + sampleRecordId);
//        } finally {
//            if (pstmt != null) {
//                pstmt.close();
//            }
//        }
//    }
    public void addSampleRecordValue(Connection conn, File imageFile) throws SQLException, FileNotFoundException, IOException {
        // Thêm image vào câu lệnh INSERT
        String insertSampleValueSQL = "INSERT INTO SampleRecordValue (sampleRecordValue_time, sampleRecordValue_location, sampleRecordValue_reason, sampleRecordValue_author, sampleRecord_id, sampleRecordValue_image) VALUES (NOW(), ?, ?, ?, ?, ?)";

        PreparedStatement pstmt = null;

        try {
            // Chuẩn bị câu lệnh SQL
            pstmt = conn.prepareStatement(insertSampleValueSQL);
            pstmt.setString(1, sampleRecordValueLocation);
            pstmt.setString(2, sampleRecordValueReason);
            pstmt.setString(3, sampleRecordValueAuthor);
            pstmt.setInt(4, sampleRecordId);
            FileInputStream fis = new FileInputStream(imageFile);
            byte[] imageBytes = new byte[(int) imageFile.length()];
            fis.read(imageBytes);
            fis.close();
            // Đặt dữ liệu ảnh (imageBytes)
            if (imageBytes != null) {
                pstmt.setBytes(5, imageBytes);  // Thêm dữ liệu ảnh vào cột BLOB
            } else {
                pstmt.setNull(5, java.sql.Types.BLOB);  // Nếu không có ảnh, đặt giá trị NULL
            }

            // Thực hiện truy vấn
            pstmt.executeUpdate();
            System.out.println("SampleRecordValue added for SampleRecord ID: " + sampleRecordId);

        } finally {
            // Đóng PreparedStatement sau khi hoàn thành
            if (pstmt != null) {
                pstmt.close();
            }
        }
    }

    public void updateSampleRecordValue(Connection conn, String newLocation, String newReason, byte[] imageBytes) throws SQLException {
        String updateSQL = "UPDATE SampleRecordValue SET sampleRecordValue_location = ?, sampleRecordValue_reason = ?, sampleRecordValue_image = ? WHERE sampleRecord_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            pstmt.setString(1, newLocation);
            pstmt.setString(2, newReason);
            pstmt.setBytes(3, imageBytes);
            pstmt.setInt(4, sampleRecordId);
            pstmt.executeUpdate();
            System.out.println("SampleRecordValue updated with new location: " + newLocation + ", reason: " + newReason + ", and image.");
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

    public void insertSampleRecordValueWithImage(Connection conn, String location, String reason, String author, File imageFile) throws FileNotFoundException, IOException {
        String insertSQL = "INSERT INTO SampleRecordValue (sampleRecordValue_time, sampleRecordValue_location, sampleRecordValue_reason, sampleRecordValue_author, sampleRecordValue_image) "
                + "VALUES (CURRENT_TIMESTAMP, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            // Đọc tệp ảnh vào mảng byte
            FileInputStream fis = new FileInputStream(imageFile);
            byte[] imageBytes = new byte[(int) imageFile.length()];
            fis.read(imageBytes);
            fis.close();

            // Thiết lập các giá trị cho câu lệnh SQL
            pstmt.setString(1, location);
            pstmt.setString(2, reason);
            pstmt.setString(3, author);
            pstmt.setBytes(4, imageBytes);  // Thêm hình ảnh vào dưới dạng BLOB
            // pstmt.setInt(5, sampleRecordId); // Liên kết với ID trong bảng SampleRecord

            // Thực thi câu lệnh
            pstmt.executeUpdate();
            System.out.println("Dữ liệu đã được chèn thành công.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }

    public void displayImageFromDatabase(Connection conn, int sampleRecordValueId, JLabel label) {
        String selectSQL = "SELECT sampleRecordValue_image FROM SampleRecordValue WHERE sampleRecordValue_id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(selectSQL)) {
            pstmt.setInt(1, sampleRecordValueId);

            // Thực thi truy vấn
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                // Lấy dữ liệu ảnh dưới dạng mảng byte
                byte[] imageBytes = rs.getBytes("sampleRecordValue_image");
                if (imageBytes != null) {
                    // Hiển thị ảnh trên JLabel
                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    label.setIcon(imageIcon);
                    System.out.println("Hình ảnh đã được tải và hiển thị.");
                } else {
                    System.out.println("Không có hình ảnh nào trong cơ sở dữ liệu.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public byte[] getImageBytesFromDatabase(Connection conn, int sampleRecordValueId) {
        byte[] imageBytes = null;
        String sql = "SELECT sampleRecordValue_image FROM SampleRecordValue WHERE sampleRecordValue_id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, sampleRecordValueId);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    imageBytes = rs.getBytes("sampleRecordValue_image");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Lỗi khi lấy hình ảnh từ cơ sở dữ liệu: " + e.getMessage());
        }

        return imageBytes;
    }

    public ImageIcon resizeImage(byte[] imageBytes, int width, int height) {
        if (imageBytes != null && imageBytes.length > 0) {
            // Tạo ImageIcon từ mảng byte
            ImageIcon originalIcon = new ImageIcon(imageBytes);

            // Lấy đối tượng Image từ ImageIcon
            Image originalImage = originalIcon.getImage();

            // Thay đổi kích thước hình ảnh
            Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            // Trả về ImageIcon với kích thước mới
            return new ImageIcon(resizedImage);
        }
        return null;
    }

}
