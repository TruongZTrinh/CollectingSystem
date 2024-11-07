/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.project;

import database.DatabaseConnection;
import java.awt.Point;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import view.form.Doiten;

/**
 *
 * @author Admin
 */
public class ProjectIcon extends javax.swing.JPanel {

    private int project_id;

    public ProjectIcon() {
    }

    /**
     * Creates new form ProjectIcon
     */
    public ProjectIcon(int project_id, String project_name) {
        initComponents();
        this.project_id = project_id; // Lưu project_id
        jLabel3.setText(project_name);

        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDoitenPanel();
            }
        });
    }

    public int getId() {
        return project_id;
    }
    private Project parentProject;

    public ProjectIcon(int project_id, String project_name, Project parentProject) {
        initComponents();
        this.project_id = project_id; // Lưu tham chiếu đến Project cha
        this.parentProject = parentProject; // Lưu tham chiếu đến Project cha
        jLabel3.setText(project_name);
    }

    public void setProjectName(String newName) {
        jLabel3.setText(newName); // Cập nhật tên hiển thị
    }

//    private void showDoitenPanel() {
//        JFrame frame = new JFrame("Đổi tên");
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.getContentPane().add(new Doiten_project(project_id, this));
//        frame.pack();
//        frame.setLocationRelativeTo(null); // Căn giữa màn hình
//        frame.setVisible(true);
//    }
    private void showDoitenPanel() {
        String newName = JOptionPane.showInputDialog(this, "Nhập tên mới cho dự án:", "Đổi tên", JOptionPane.PLAIN_MESSAGE);
        if (newName != null && !newName.trim().isEmpty()) {
            setProjectName(newName);

            // Cập nhật tên dự án trong cơ sở dữ liệu
            try (Connection connection = DatabaseConnection.getConnection()) {
                String sql = "UPDATE Project SET project_name = ? WHERE project_id = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1, newName);
                pstmt.setInt(2, project_id);
                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Tên dự án đã được đổi thành công.");
                    if (parentProject != null) {
                        parentProject.reloadProjects(); // Làm mới danh sách dự án nếu cần
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy dự án để đổi tên.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi đổi tên dự án: " + e.getMessage());
            }
        }
    }

    private void deleteProject() {
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa dự án này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.getParent().remove(this);

            // Thực hiện thao tác xóa trong cơ sở dữ liệu
            try (Connection connection = DatabaseConnection.getConnection()) {
                String sql = "DELETE FROM Project WHERE project_id = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1, project_id);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Dự án đã được xóa thành công.");
                    parentProject.reloadProjects(); // Làm mới danh sách dự án
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy dự án để xóa.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi xóa dự án: " + e.getMessage());
            }
        }
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
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(103, 141));
        setMinimumSize(new java.awt.Dimension(103, 141));

        jPanel1.setBackground(new java.awt.Color(214, 210, 210));
        jPanel1.setMaximumSize(new java.awt.Dimension(69, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(69, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(69, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_file.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(85, 110));
        jLabel4.setMinimumSize(new java.awt.Dimension(85, 110));
        jLabel4.setPreferredSize(new java.awt.Dimension(85, 110));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
        );

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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(85, 31));
        jPanel6.setMinimumSize(new java.awt.Dimension(85, 31));
        jPanel6.setPreferredSize(new java.awt.Dimension(85, 31));

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jMenuItem2);

        // Lấy vị trí của jLabel1 trên màn hình
        Point labelLocation = jLabel1.getLocationOnScreen();

        // Hiển thị JPopupMenu ngay bên cạnh jLabel1 (ví dụ, bên phải jLabel1)
        jPopupMenu1.show(jLabel1, jLabel1.getWidth() + 2, evt.getY());

        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProject(); // Gọi phương thức deleteProject khi nhấn vào menu item "Xóa"
            }
        });
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        showDoitenPanel();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
    }//GEN-LAST:event_jLabel4MouseClicked


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
