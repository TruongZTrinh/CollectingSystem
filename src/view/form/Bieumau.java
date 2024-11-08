/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.form;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Asus
 */
public class Bieumau extends javax.swing.JPanel {

    private JPopupMenu popupMenu;

    /**
     * Creates new form Bieumau
     */
    public Bieumau() {
        initComponents();
        // Khởi tạo JPopupMenu
        popupMenu = new JPopupMenu();
        popupMenu.setPreferredSize(new java.awt.Dimension(110, 60));

        JMenuItem renameItem = new JMenuItem("Đổi tên");
        renameItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDoitenPanel();
            }
        });

        JMenuItem deleteItem = new JMenuItem("Xóa");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showXoaPanel();
            }
        });

        popupMenu.add(renameItem);
        popupMenu.add(deleteItem);
       
    }

    private void showDoitenPanel() {
        JFrame frame = new JFrame("Đổi tên");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new Doiten());
        frame.pack();
        frame.setLocationRelativeTo(null); // Căn giữa màn hình
        frame.setVisible(true);
    }

    private void showXoaPanel() {
        JFrame frame = new JFrame("Xóa");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new Xoa(this));
        frame.pack();
        frame.setLocationRelativeTo(null); // Căn giữa màn hình
        frame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        myButton1 = new main_style.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(170, 170));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Biểu mẫu A");

        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3844442_dot_menu_more_vertical_icon.png"))); // NOI18N
        myButton1.setMargin(new java.awt.Insets(26, 26, 26, 26));
        myButton1.setMaximumSize(new java.awt.Dimension(26, 26));
        myButton1.setMinimumSize(new java.awt.Dimension(26, 26));
        myButton1.setPreferredSize(new java.awt.Dimension(26, 26));
        myButton1.setRadius(100);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
        popupMenu.show(myButton1, 0, myButton1.getHeight());
    }//GEN-LAST:event_myButton1ActionPerformed
    public void removeForm() {
        // Xóa biểu mẫu này khỏi giao diện
        this.setVisible(false); // Ẩn biểu mẫu
        this.getParent().remove(this); // Xóa biểu mẫu khỏi panel cha
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private main_style.MyButton myButton1;
    // End of variables declaration//GEN-END:variables
}
