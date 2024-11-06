package view.sample;

import database.DatabaseConnection;
import java.io.File;
import java.sql.Connection;
import javax.swing.JFileChooser;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.SampleRecord;
import model.SampleRecordValue;

public class NewSample extends javax.swing.JFrame {

    public NewSample() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundTextField4 = new main_style.RoundTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        myButton1 = new main_style.MyButton();
        nameSampleTextField = new main_style.RoundTextField();
        locateSampleTextField = new main_style.RoundTextField();
        authorSampleTextField = new main_style.RoundTextField();
        reasonSampleTextField = new main_style.RoundTextField();
        idSampleTextField = new main_style.RoundTextField();
        jLabel7 = new javax.swing.JLabel();
        cancelAddNewSample = new main_style.GradientButton();
        addNewSample = new main_style.GradientButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        roundTextField4.setText("roundTextField1");
        roundTextField4.setBorderColor(new java.awt.Color(153, 255, 153));
        roundTextField4.setCornerRadius(30);
        roundTextField4.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        roundTextField4.setMinimumSize(new java.awt.Dimension(64, 34));
        roundTextField4.setPreferredSize(new java.awt.Dimension(64, 34));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        jLabel2.setText("Tên mẫu");

        jLabel3.setText("Vị trí");

        jLabel4.setText("Người thu mẫu");

        jLabel5.setText("Lý do thu mẫu");

        jLabel6.setText("Thêm mẫu");

        myButton1.setBorder(null);
        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/upload_icon.png"))); // NOI18N
        myButton1.setText("Tải lên từ máy");
        myButton1.setBorderColor(new java.awt.Color(204, 255, 204));
        myButton1.setColorOver(new java.awt.Color(152, 184, 144));
        myButton1.setMaximumSize(new java.awt.Dimension(124, 34));
        myButton1.setMinimumSize(new java.awt.Dimension(124, 34));
        myButton1.setPreferredSize(new java.awt.Dimension(124, 34));
        myButton1.setRadius(30);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        nameSampleTextField.setBorderColor(new java.awt.Color(153, 255, 153));
        nameSampleTextField.setCornerRadius(30);
        nameSampleTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        nameSampleTextField.setMinimumSize(new java.awt.Dimension(64, 34));
        nameSampleTextField.setPreferredSize(new java.awt.Dimension(64, 34));

        locateSampleTextField.setBorderColor(new java.awt.Color(153, 255, 153));
        locateSampleTextField.setCornerRadius(30);
        locateSampleTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        locateSampleTextField.setMinimumSize(new java.awt.Dimension(64, 34));
        locateSampleTextField.setPreferredSize(new java.awt.Dimension(64, 34));

        authorSampleTextField.setBorderColor(new java.awt.Color(153, 255, 153));
        authorSampleTextField.setCornerRadius(30);
        authorSampleTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        authorSampleTextField.setMinimumSize(new java.awt.Dimension(64, 34));
        authorSampleTextField.setPreferredSize(new java.awt.Dimension(64, 34));

        reasonSampleTextField.setBorderColor(new java.awt.Color(153, 255, 153));
        reasonSampleTextField.setCornerRadius(30);
        reasonSampleTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        reasonSampleTextField.setMinimumSize(new java.awt.Dimension(64, 34));
        reasonSampleTextField.setPreferredSize(new java.awt.Dimension(64, 34));

        idSampleTextField.setBorderColor(new java.awt.Color(153, 255, 153));
        idSampleTextField.setCornerRadius(30);
        idSampleTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        idSampleTextField.setMinimumSize(new java.awt.Dimension(64, 34));
        idSampleTextField.setPreferredSize(new java.awt.Dimension(64, 34));

        jLabel7.setText("ID mẫu");

        cancelAddNewSample.setForeground(new java.awt.Color(255, 255, 255));
        cancelAddNewSample.setText("Hủy");
        cancelAddNewSample.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelAddNewSample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddNewSampleActionPerformed(evt);
            }
        });

        addNewSample.setForeground(new java.awt.Color(255, 255, 255));
        addNewSample.setText("Ok");
        addNewSample.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addNewSample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewSampleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idSampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(authorSampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(24, 24, 24))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reasonSampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameSampleTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(locateSampleTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cancelAddNewSample, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(addNewSample, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(idSampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameSampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locateSampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(authorSampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(reasonSampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelAddNewSample, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNewSample, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(0, 204, 102));
        jPanel6.setMaximumSize(new java.awt.Dimension(500, 80));
        jPanel6.setMinimumSize(new java.awt.Dimension(500, 80));
        jPanel6.setName(""); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(500, 80));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("THÊM MẪU MỚI");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, java.awt.BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Đã chọn tệp: " + selectedFile.getAbsolutePath());

            // Thực hiện hành động tiếp theo
        }
    }//GEN-LAST:event_myButton1ActionPerformed

    private void addNewSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewSampleActionPerformed

        Connection conn = null;
        try {
            // Lấy kết nối từ DatabaseConnection
            conn = DatabaseConnection.getConnection();

            // Lấy các giá trị từ giao diện người dùng (ví dụ: JTextField cho tên, lý do, địa điểm, và tác giả)
            int idSample = Integer.parseInt(idSampleTextField.getText());
            String nameSample = nameSampleTextField.getText();
            String location = locateSampleTextField.getText();  // Lấy giá trị từ trường nhập liệu "Địa điểm"
            String reason = reasonSampleTextField.getText();    // Lấy giá trị từ trường nhập liệu "Lý do"
            String author = authorSampleTextField.getText();    // Lấy giá trị từ trường nhập liệu "Tác giả"

            // Tạo đối tượng SampleRecord và lưu vào cơ sở dữ liệu
            SampleRecord sampleRecord = new SampleRecord();
            sampleRecord.setSampleRecordId(idSample);
            sampleRecord.setSampleRecordName(nameSample);
            sampleRecord.setUserId(1); // set foreign key if needed

            // Tạo bản ghi mẫu trong cơ sở dữ liệu và lấy ID mới
            sampleRecord.createSampleRecord(conn);

            // Tạo đối tượng SampleRecordValue với ID của SampleRecord vừa tạo và các thông tin khác
            SampleRecordValue sampleRecordValue = new SampleRecordValue();
            sampleRecordValue.setSampleRecordValueLocation(location);
            sampleRecordValue.setSampleRecordValueReason(reason);
            sampleRecordValue.setSampleRecordValueAuthor(author);
            sampleRecordValue.setSampleRecordId(sampleRecord.getSampleRecordId());

            // Thêm thông tin giá trị mẫu vào bảng SampleRecordValue
            sampleRecordValue.addSampleRecordValue(conn);

            // Thông báo cho người dùng rằng mẫu đã được tạo thành công
            JOptionPane.showMessageDialog(this, "Bản ghi mẫu và giá trị đã được thêm thành công!");

            // Xóa dữ liệu trên các JTextField
            idSampleTextField.setText("");
            nameSampleTextField.setText("");
            locateSampleTextField.setText("");
            reasonSampleTextField.setText("");
            authorSampleTextField.setText("");

        } catch (SQLException e) {
            // Xử lý ngoại lệ nếu có lỗi xảy ra khi thêm vào cơ sở dữ liệu
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm bản ghi mẫu: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();  // Đảm bảo đóng kết nối sau khi hoàn tất
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }//GEN-LAST:event_addNewSampleActionPerformed

    private void cancelAddNewSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddNewSampleActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelAddNewSampleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewSample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main_style.GradientButton addNewSample;
    private main_style.RoundTextField authorSampleTextField;
    private main_style.GradientButton cancelAddNewSample;
    private main_style.RoundTextField idSampleTextField;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private main_style.RoundTextField locateSampleTextField;
    private main_style.MyButton myButton1;
    private main_style.RoundTextField nameSampleTextField;
    private main_style.RoundTextField reasonSampleTextField;
    private main_style.RoundTextField roundTextField4;
    // End of variables declaration//GEN-END:variables
}
