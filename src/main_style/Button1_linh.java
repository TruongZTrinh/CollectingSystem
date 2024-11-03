package main_style;

import javax.swing.*;
import java.awt.*;

public class Button1_linh extends JButton implements java.io.Serializable {

    // Constructor không tham số
    public Button1_linh() {
        this("Button"); // Đặt giá trị mặc định
    }

    // Constructor có tham số
    public Button1_linh(String text) {
        super(text);
        setContentAreaFilled(false); // Vô hiệu hóa nền mặc định
        setFocusPainted(false);      // Loại bỏ đường viền khi được focus
    }

    // Phương thức vẽ nút với nền trắng và góc bo tròn
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Bật khử răng cưa để render đẹp hơn
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Màu trắng cho nền nút
        g2d.setColor(Color.WHITE);

        // Vẽ hình vuông bo góc với đường viền 15px để tạo góc bo tròn
        int arcSize = 15;
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), arcSize, arcSize);

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

    @Override
    public Dimension getPreferredSize() {
        return super.getPreferredSize();
    }
}
