/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Custom;

/**
 *
 * @author Asus
 */



import java.awt.*;
import java.io.Serializable;
import javax.swing.*;

public class RoundTextField extends JTextField implements Serializable {
    private int cornerRadius;
    private int padding;
    private Color borderColor;

    public RoundTextField() {
        this(15, 10, Color.GRAY); // Default values
    }

    public RoundTextField(int cornerRadius, int padding, Color borderColor) {
        super();
        this.cornerRadius = cornerRadius;
        this.padding = padding;
        this.borderColor = borderColor;
        setOpaque(false); // Ensure the background is transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set background color from the component itself (allowing for custom backgrounds)
        g2.setColor(getBackground()); // Allow setting a custom background color
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        // Clip the region inside the rounded rectangle so the text doesn't paint outside
        g2.setClip(new java.awt.geom.RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));

        super.paintComponent(g2); // Paint text on top of custom background
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the custom border color
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);
        g2.dispose();
    }

    @Override
    public Insets getInsets() {
        return new Insets(padding, padding, padding, padding);
    }

    // Getter and Setter methods for JavaBean properties
    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint();
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
        revalidate();
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint();
    }
}