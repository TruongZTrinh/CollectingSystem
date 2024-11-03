/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_style;



import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JTextField;

public class GradientTextField_Truong extends JTextField {

    public GradientTextField_Truong() {
        // Đặt độ trong suốt cho JTextField
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        // Tạo gradient từ màu #0097b2 đến màu #7ed957
        Color startColor = Color.decode("#0097b2");
        Color endColor = Color.decode("#7ed957");
        GradientPaint gradient = new GradientPaint(0, 0, startColor, getWidth(), getHeight(), endColor);
        g2d.setPaint(gradient);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        
        // Vẽ văn bản
        super.paintComponent(g);
        
        // Giải phóng đối tượng đồ họa
        g2d.dispose();
    }

    @Override
    public void setBackground(Color color) {
        // Ngăn chặn thay đổi màu nền từ ngoài
    }

    @Override
    public Color getBackground() {
        return new Color(0, 0, 0, 0); // Đặt nền về trong suốt
    }
}