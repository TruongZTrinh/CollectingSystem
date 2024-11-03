/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_style;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.*;
import java.awt.*;

public class RoundedButton_Dinh extends JButton implements java.io.Serializable {

    // Constructor không tham số
    public RoundedButton_Dinh() {
        this("Button"); // Đặt giá trị mặc định
    }

    // Constructor có tham số
    public RoundedButton_Dinh(String text) {
        super(text);
        setContentAreaFilled(false); // Vô hiệu hóa nền mặc định
        setFocusPainted(false);      // Loại bỏ đường viền khi được focus
    }

    // Phương thức vẽ nút với gradient
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Bật khử răng cưa để render đẹp hơn
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gradient từ màu xanh ngọc sang xanh nhạt
        GradientPaint gradientPaint = new GradientPaint(
                0, 0, new Color(0, 204, 153),  // Màu bắt đầu
                getWidth(), getHeight(), new Color(102, 255, 153)  // Màu kết thúc
        );

        g2d.setPaint(gradientPaint);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // Bo tròn góc 20px

        // Gọi lại paintComponent để vẽ text
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
}