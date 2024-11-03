package Custom;

import javax.swing.*;
import java.awt.*;

public class GradientPanel extends JPanel {

    // Constructor không tham số
    public GradientPanel() {
        // Cài đặt các thuộc tính panel nếu cần thiết
    }

    // Phương thức vẽ panel với gradient
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        // Bật khử răng cưa để render đẹp hơn
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gradient từ màu xanh ngọc sang xanh nhạt
        GradientPaint gradientPaint = new GradientPaint(
                0, 0, new Color(0, 204, 153),      // Màu bắt đầu
                getWidth(), getHeight(), new Color(102, 255, 153)  // Màu kết thúc
        );

        g2d.setPaint(gradientPaint);
        g2d.fillRect(0, 0, getWidth(), getHeight()); // Vẽ nền gradient toàn bộ panel

        g2d.dispose();
    }
}
