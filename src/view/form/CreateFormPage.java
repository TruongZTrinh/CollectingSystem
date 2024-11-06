package view.form;

import database.DatabaseConnection;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.WrapLayout;

public class CreateFormPage extends javax.swing.JFrame {

    private final ArrayList<newQuestionPanel> questionList = new ArrayList<>();

    public CreateFormPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        all = new javax.swing.JPanel();
        createFormPanel = new javax.swing.JPanel();
        CreateFormLabel = new javax.swing.JLabel();
        formNamePanel = new javax.swing.JPanel();
        formNameTextField = new main_style.RoundTextField_Linh();
        addForm = new javax.swing.JPanel();
        questionScrollPanel = new javax.swing.JScrollPane();
        questionPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();
        cancelButton = new main_style.GradientButton_Linh();
        createButton = new main_style.GradientButton_Linh();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createFormPanel.setBackground(new java.awt.Color(0, 153, 51));

        CreateFormLabel.setFont(new java.awt.Font("Mulish ExtraBold", 0, 24)); // NOI18N
        CreateFormLabel.setForeground(new java.awt.Color(255, 255, 255));
        CreateFormLabel.setText("Tạo Biểu mẫu");

        javax.swing.GroupLayout createFormPanelLayout = new javax.swing.GroupLayout(createFormPanel);
        createFormPanel.setLayout(createFormPanelLayout);
        createFormPanelLayout.setHorizontalGroup(
            createFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreateFormLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createFormPanelLayout.setVerticalGroup(
            createFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createFormPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CreateFormLabel)
                .addGap(15, 15, 15))
        );

        formNameTextField.setText("Tên Biểu mẫu");
        formNameTextField.setFont(new java.awt.Font("Mulish Medium", 0, 14)); // NOI18N
        formNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNameTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formNamePanelLayout = new javax.swing.GroupLayout(formNamePanel);
        formNamePanel.setLayout(formNamePanelLayout);
        formNamePanelLayout.setHorizontalGroup(
            formNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formNamePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(formNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93))
        );
        formNamePanelLayout.setVerticalGroup(
            formNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formNamePanelLayout.createSequentialGroup()
                .addComponent(formNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        addForm.setBackground(new java.awt.Color(204, 204, 204));
        addForm.setLayout(new javax.swing.BoxLayout(addForm, javax.swing.BoxLayout.LINE_AXIS));

        questionScrollPanel.setAutoscrolls(true);

        questionPanel.setLayout(new javax.swing.BoxLayout(questionPanel, javax.swing.BoxLayout.LINE_AXIS));
        questionScrollPanel.setViewportView(questionPanel);
        questionPanel.setLayout(new WrapLayout(FlowLayout.LEFT, 10, 10));

        addForm.add(questionScrollPanel);

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_icon.png"))); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addForm.add(addButton);

        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Hủy");
        cancelButton.setFont(new java.awt.Font("Mulish SemiBold", 0, 14)); // NOI18N
        cancelButton.setPreferredSize(new java.awt.Dimension(80, 40));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setFont(new java.awt.Font("Mulish SemiBold", 0, 14)); // NOI18N
        createButton.setLabel("Tạo");
        createButton.setPreferredSize(new java.awt.Dimension(80, 40));
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout allLayout = new javax.swing.GroupLayout(all);
        all.setLayout(allLayout);
        allLayout.setHorizontalGroup(
            allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(allLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addComponent(formNamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(allLayout.createSequentialGroup()
                .addComponent(addForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        allLayout.setVerticalGroup(
            allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allLayout.createSequentialGroup()
                .addComponent(createFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addForm, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formNameTextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // Extract the form name
        String formName = formNameTextField.getText();

        if (formName.isEmpty() || questionList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên biểu mẫu hoặc câu hỏi không được để trống.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Save form and questions to the database
        try (Connection conn = DatabaseConnection.getConnection()) {
            conn.setAutoCommit(false);  // Start transaction

            // Insert the form
            String insertFormSQL = "INSERT INTO Form (form_name, form_des) VALUES (?, ?)";
            try (PreparedStatement formStmt = conn.prepareStatement(insertFormSQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                formStmt.setString(1, formName);
                formStmt.setString(2, "");  // Description can be empty or optional

                int affectedRows = formStmt.executeUpdate();
                if (affectedRows == 0) {
                    throw new SQLException("Creating form failed, no rows affected.");
                }

                // Retrieve the generated form ID
                int formId;
                try (ResultSet generatedKeys = formStmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        formId = generatedKeys.getInt(1);
                    } else {
                        throw new SQLException("Creating form failed, no ID obtained.");
                    }
                }

                // Insert each question linked to this form
                String insertQuestionSQL = "INSERT INTO Question (question_name, question_type, form_id) VALUES (?, ?, ?)";
                try (PreparedStatement questionStmt = conn.prepareStatement(insertQuestionSQL)) {
                    for (newQuestionPanel question : questionList) {
                        questionStmt.setString(1, question.getQuestionText());
                        questionStmt.setString(2, question.getQuestionType());
                        questionStmt.setInt(3, formId);
                        questionStmt.addBatch();
                    }
                    questionStmt.executeBatch();  // Execute all question inserts in one batch
                }

                conn.commit();  // Commit transaction if all statements succeed
                JOptionPane.showMessageDialog(this, "Biểu mẫu được tạo thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();  // Close form after successful creation
            } catch (SQLException ex) {
                conn.rollback();  // Roll back transaction if any statement fails
                JOptionPane.showMessageDialog(this, "Lỗi khi tạo biểu mẫu: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        newQuestionPanel newQuestion = new newQuestionPanel();
        questionPanel.add(newQuestion);
        questionPanel.revalidate();
        questionPanel.repaint();
//        questionPanel.setPreferredSize(new java.awt.Dimension(questionPanel.getWidth(), questionPanel.getHeight() + newQuestion.getHeight()));
//        questionScrollPanel.revalidate();
//        questionScrollPanel.repaint();
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateFormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateFormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateFormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateFormPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateFormPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreateFormLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addForm;
    private javax.swing.JPanel all;
    private javax.swing.JPanel buttonPanel;
    private main_style.GradientButton_Linh cancelButton;
    private main_style.GradientButton_Linh createButton;
    private javax.swing.JPanel createFormPanel;
    private javax.swing.JPanel formNamePanel;
    private main_style.RoundTextField_Linh formNameTextField;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JScrollPane questionScrollPanel;
    // End of variables declaration//GEN-END:variables
}
