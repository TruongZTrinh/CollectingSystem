/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.project;

import java.awt.Point;

/**
 *
 * @author Admin
 */
public class ProjectIcon extends javax.swing.JPanel {

    /**
     * Creates new form ProjectIcon
     */
    public ProjectIcon(String project_name) {
        initComponents();
        jLabel3.setText(project_name);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jPopupMenu1.setMaximumSize(new java.awt.Dimension(100, 50));
        jPopupMenu1.setMinimumSize(new java.awt.Dimension(100, 50));
        jPopupMenu1.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem1.setText("Xóa");

        jMenuItem2.setText("Đổi tên");

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(103, 141));
        setMinimumSize(new java.awt.Dimension(103, 141));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(214, 210, 210));
        jPanel1.setMaximumSize(new java.awt.Dimension(69, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(69, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(69, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_file.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(85, 110));
        jLabel4.setMinimumSize(new java.awt.Dimension(85, 110));
        jLabel4.setPreferredSize(new java.awt.Dimension(85, 110));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(214, 210, 210));
        jPanel5.setMaximumSize(new java.awt.Dimension(16, 80));
        jPanel5.setMinimumSize(new java.awt.Dimension(16, 80));
        jPanel5.setPreferredSize(new java.awt.Dimension(16, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3844442_dot_menu_more_vertical_icon.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(jPanel5, java.awt.BorderLayout.EAST);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(85, 31));
        jPanel6.setMinimumSize(new java.awt.Dimension(85, 31));
        jPanel6.setPreferredSize(new java.awt.Dimension(85, 31));

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        add(jPanel6, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jMenuItem2);
    
         // Lấy vị trí của jLabel1 trên màn hình
        Point labelLocation = jLabel1.getLocationOnScreen();
    
        // Hiển thị JPopupMenu ngay bên cạnh jLabel1 (ví dụ, bên phải jLabel1)
         jPopupMenu1.show(jLabel1, jLabel1.getWidth() + 2, evt.getY());
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}