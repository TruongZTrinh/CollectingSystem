package model;

import database.DatabaseConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null; // Kết nối của bạn
        conn = DatabaseConnection.getConnection();
        try {
            if (conn == null) {
                throw new SQLException("Không thể kết nối đến cơ sở dữ liệu.");
            }
            
            // Tạo một SampleRecordValue mới
            String location = "Hà Nội";
            String reason = "Mẫu kiểm tra định kỳ";
            String author = "Nguyễn Văn A";
            int sampleRecordId = 123;  // Giả sử đây là ID hợp lệ của một SampleRecord

            // Đọc ảnh từ tệp
            File file = new File("D:\\CHUNA\\Downloads\\left.png");  // Đường dẫn tới tệp ảnh
            if (!file.exists()) {
                throw new IOException("Tệp hình ảnh không tồn tại: " + file.getAbsolutePath());
            }
            
            byte[] imageBytes = new byte[(int) file.length()];  // Mảng byte để lưu ảnh

            try (FileInputStream fis = new FileInputStream(file)) {
                fis.read(imageBytes);  // Đọc toàn bộ nội dung tệp ảnh vào mảng byte
            }

            // Thêm SampleRecordValue vào CSDL
            SampleRecordValue sampleRecordValue = new SampleRecordValue(location, reason, author, sampleRecordId, imageBytes);
            sampleRecordValue.insertSampleRecordValue(conn, location, reason, imageBytes);
            System.out.println("Dữ liệu đã được chèn thành công vào cơ sở dữ liệu.");

        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Lỗi khi tương tác với cơ sở dữ liệu: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Đóng kết nối nếu cần
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.err.println("Lỗi khi đóng kết nối: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}
