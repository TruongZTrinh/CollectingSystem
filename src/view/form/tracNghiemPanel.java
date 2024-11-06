package view.form;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class tracNghiemPanel extends javax.swing.JPanel {

    public tracNghiemPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tuyChonPanel = new javax.swing.JPanel();
        tuyChonRadioButton = new javax.swing.JRadioButton();
        tuyChonTextField = new javax.swing.JTextField();
        deleteTuyChonButton = new javax.swing.JButton();
        addTuyChonButton = new javax.swing.JButton();

        tuyChonRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuyChonRadioButtonActionPerformed(evt);
            }
        });

        tuyChonTextField.setFont(new java.awt.Font("Mulish SemiBold", 0, 14)); // NOI18N
        tuyChonTextField.setText("Tùy chọn");
        tuyChonTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        deleteTuyChonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-trash-24.png"))); // NOI18N
        deleteTuyChonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTuyChonButtonActionPerformed(evt);
            }
        });

        addTuyChonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_icon.png"))); // NOI18N
        addTuyChonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTuyChonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tuyChonPanelLayout = new javax.swing.GroupLayout(tuyChonPanel);
        tuyChonPanel.setLayout(tuyChonPanelLayout);
        tuyChonPanelLayout.setHorizontalGroup(
            tuyChonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tuyChonPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tuyChonRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tuyChonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteTuyChonButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addTuyChonButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        tuyChonPanelLayout.setVerticalGroup(
            tuyChonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tuyChonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tuyChonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addTuyChonButton)
                    .addComponent(tuyChonRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tuyChonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTuyChonButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tuyChonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tuyChonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tuyChonRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuyChonRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuyChonRadioButtonActionPerformed

    private void deleteTuyChonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTuyChonButtonActionPerformed
        // Xóa `tracNghiemPanel` hiện tại khỏi cha của nó (có thể là một JPanel chứa các tùy chọn)
        Container parent = this.getParent();
        if (parent != null) {
            parent.remove(this); // Xóa chính panel hiện tại khỏi cha của nó
            parent.revalidate();  // Cập nhật lại bố cục sau khi xóa
            parent.repaint();     // Vẽ lại giao diện
        }
    }//GEN-LAST:event_deleteTuyChonButtonActionPerformed

    private void addTuyChonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTuyChonButtonActionPerformed
        Container parent = this.getParent();
        if (parent != null && parent instanceof JPanel) {
            JPanel optionsPanel = (JPanel) parent;

            // Tạo một `tracNghiemPanel` mới và thêm vào `optionsPanel`
            tracNghiemPanel newOptionPanel = new tracNghiemPanel();
            optionsPanel.add(newOptionPanel); // Thêm panel mới vào

            // Đặt layout cho optionsPanel là BoxLayout
            optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));

            // Cập nhật lại bố cục và vẽ lại giao diện
            optionsPanel.revalidate();
            optionsPanel.repaint();
        }
    }//GEN-LAST:event_addTuyChonButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTuyChonButton;
    private javax.swing.JButton deleteTuyChonButton;
    private javax.swing.JPanel tuyChonPanel;
    private javax.swing.JRadioButton tuyChonRadioButton;
    private javax.swing.JTextField tuyChonTextField;
    // End of variables declaration//GEN-END:variables
}
