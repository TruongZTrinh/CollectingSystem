/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.form;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class Doiten extends javax.swing.JPanel {

    private Bieumau bieumau;

    /**
     * Creates new form Doiten
     */
    public Doiten(int id, Bieumau bieumau) {
        this.bieumau = bieumau;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel1 = new main_style.GradientPanel_Linh();
        jLabel2 = new javax.swing.JLabel();
        gradientButton1 = new main_style.GradientButton_Linh();
        gradientButton2 = new main_style.GradientButton_Linh();
        roundTextField1 = new main_style.RoundTextField_Linh();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(412, 188));

        jLabel2.setText("Đổi tên");

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        gradientButton1.setForeground(new java.awt.Color(255, 255, 255));
        gradientButton1.setText("Hủy");
        gradientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton1ActionPerformed(evt);
            }
        });

        gradientButton2.setForeground(new java.awt.Color(255, 255, 255));
        gradientButton2.setText("Ok");
        gradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton2ActionPerformed(evt);
            }
        });

        roundTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(roundTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton2ActionPerformed
        // TODO add your handling code here:
        // Lấy tên mới từ trường roundTextField1
        String newName = roundTextField1.getText();

        // Kiểm tra nếu tên không trống
        if (newName.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Tên không được để trống!", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            // Thực hiện cập nhật tên
            // Giả sử bạn có một phương thức cập nhật tên, ví dụ như updateName(newName)
            // updateName(newName); // Uncomment và thay thế bằng logic cập nhật thực tế của bạn

//            javax.swing.JOptionPane.showMessageDialog(this, "Đổi tên thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            bieumau.setName(newName);
            // Cập nhật tên trong cơ sở dữ liệu
            updateNameInDatabase(newName);
            // Đóng hộp thoại sau khi hoàn tất
            java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
            if (window != null) {
                window.dispose();
            }
        }
    }//GEN-LAST:event_gradientButton2ActionPerformed

    private void updateNameInDatabase(String newName) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Kết nối tới cơ sở dữ liệu
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/collecting_system", "root", "12345");

            // Thực hiện câu lệnh SQL để cập nhật tên biểu mẫu
            String sql = "UPDATE form SET form_name = ? WHERE form_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newName);
            pstmt.setInt(2, bieumau.getId()); // Giả sử bạn có phương thức getId() để lấy ID của biểu mẫu

            // Thực thi cập nhật
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Đổi tên thành công!");
            } else {
                // Thay đổi thông báo ở đây
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy biểu mẫu với ID: " + bieumau.getId() + " để cập nhật!", "Lỗi", javax.swing.JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi cập nhật tên! Chi tiết: " + e.getMessage(), "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
        } finally {
            // Đóng kết nối
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


    private void roundTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundTextField1ActionPerformed

    private void gradientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton1ActionPerformed
        // TODO add your handling code here:
        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (window != null) {
            window.dispose();
        }
    }//GEN-LAST:event_gradientButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main_style.GradientButton_Linh gradientButton1;
    private main_style.GradientButton_Linh gradientButton2;
    private main_style.GradientPanel_Linh gradientPanel1;
    private javax.swing.JLabel jLabel2;
    private main_style.RoundTextField_Linh roundTextField1;
    // End of variables declaration//GEN-END:variables
}
