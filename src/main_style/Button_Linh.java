package main_style;

import javax.swing.*;
import java.awt.*;

public class Button_Linh extends JButton implements java.io.Serializable {

    // Constructor không tham số
    public Button_Linh() {
        this("Button"); // Đặt giá trị mặc định
    }

    // Constructor có tham số
    public Button_Linh(String text) {
        super(text);
        setContentAreaFilled(false); // Vô hiệu hóa nền mặc định
        setFocusPainted(false);      // Loại bỏ đường viền khi được focus
    }

    // Phương thức vẽ nút với màu xám và hình tròn
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Bật khử răng cưa để render đẹp hơn
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Màu xám cho nền nút
        g2d.setColor(new Color(204, 204, 204));  // Màu xám

        // Tạo hình tròn bằng cách sử dụng fillOval
        int diameter = Math.min(getWidth(), getHeight());  // Đảm bảo nút là hình tròn
        g2d.fillOval(0, 0, diameter, diameter);

        // Vẽ text
        super.paintComponent(g2d);
        g2d.dispose();
    }

    // Getter và Setter cho text nếu cần
    public String getText() {
        return super.getText();
    }

    public void setText(String text) {
        super.setText(text);
    }

    // Override để đặt kích thước nút là hình tròn
    @Override
    public Dimension getPreferredSize() {
        int size = Math.min(super.getPreferredSize().width, super.getPreferredSize().height);
        return new Dimension(size, size);
    }
}
