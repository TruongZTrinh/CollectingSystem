package view;

import java.awt.*;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class WrapLayout extends FlowLayout{
    public WrapLayout(int align, int hgap, int vgap) {
        super(align, hgap, vgap);
    }

    @Override
    public Dimension preferredLayoutSize(Container target) {
        return layoutSize(target, true);
    }

    @Override
    public Dimension minimumLayoutSize(Container target) {
        return layoutSize(target, false);
    }

    private Dimension layoutSize(Container target, boolean preferred) {
        synchronized (target.getTreeLock()) {
            int targetWidth = target.getSize().width;
            if (targetWidth == 0) targetWidth = Integer.MAX_VALUE;

            int hgap = getHgap();
            int vgap = getVgap();
            int width = 0, height = vgap;
            int rowWidth = 0, rowHeight = 0;

            for (Component comp : target.getComponents()) {
                Dimension compSize = preferred ? comp.getPreferredSize() : comp.getMinimumSize();
                if (rowWidth + compSize.width > targetWidth) {
                    width = Math.max(width, rowWidth);
                    height += rowHeight + vgap;
                    rowWidth = 0;
                    rowHeight = 0;
                }
                rowWidth += compSize.width + hgap;
                rowHeight = Math.max(rowHeight, compSize.height);
            }
            width = Math.max(width, rowWidth);
            height += rowHeight;
            return new Dimension(width, height);
        }
    }
}
