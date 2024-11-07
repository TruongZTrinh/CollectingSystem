package view.form;

import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class newQuestionPanel extends javax.swing.JPanel {

   private String panelName; // Thuộc tính để lưu tên panel
   private tuLuanPanel newTuluan;
    public newQuestionPanel() {
        initComponents();
        this.panelName = "Question Panel " + (new Random().nextInt(1000)); // Hoặc bạn có thể dùng ID/Tham số khác để đặt tên
    }
    
    
public newQuestionPanel(tuLuanPanel newTuluan){
    this.newTuluan = newTuluan;
    initComponents();
        this.panelName = "Question Panel " + (new Random().nextInt(1000)); // Hoặc bạn có thể dùng ID/Tham số khác để đặt tên
}
    public String getName() {
        return this.panelName;
        
    }
    
    public void setQuestionType(String type) {
    questionComboBox.setSelectedItem(type);  // Đặt lại loại câu hỏi trong ComboBox
}

    public tuLuanPanel getNewTuluan() {
        return newTuluan;
    }

    public void setQuestionText(String questionText) {
        questionTextField.setText(questionText);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionTextField = new javax.swing.JTextField();
        questionComboBox = new javax.swing.JComboBox<>();
        aditionalLabel = new javax.swing.JPanel();
        deleteQuestionButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        questionTextField.setBackground(new java.awt.Color(204, 204, 204));
        questionTextField.setFont(new java.awt.Font("Mulish SemiBold", 0, 14)); // NOI18N
        questionTextField.setText("Nhập câu hỏi");
        questionTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        questionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextFieldActionPerformed(evt);
            }
        });

        questionComboBox.setBackground(new java.awt.Color(204, 204, 204));
        questionComboBox.setFont(new java.awt.Font("Mulish SemiBold", 0, 14)); // NOI18N
        questionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại câu hỏi", "Trắc nghiệm", "Câu hỏi ngắn" }));
        questionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionComboBoxActionPerformed(evt);
            }
        });

        aditionalLabel.setAutoscrolls(true);
        aditionalLabel.setMaximumSize(new java.awt.Dimension(100, 100));
        aditionalLabel.setLayout(new javax.swing.BoxLayout(aditionalLabel, javax.swing.BoxLayout.LINE_AXIS));

        deleteQuestionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-trash-24.png"))); // NOI18N
        deleteQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteQuestionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aditionalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(questionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(deleteQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionComboBox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionTextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aditionalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void questionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionTextFieldActionPerformed

    private void questionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionComboBoxActionPerformed
        String selectedOption = (String) questionComboBox.getSelectedItem();
        aditionalLabel.removeAll(); // Clear previous components in aditionalLabel

        if ("Trắc nghiệm".equals(selectedOption)) {
            tracNghiemPanel newTracNghiem = new tracNghiemPanel();
            aditionalLabel.setLayout(new BoxLayout(aditionalLabel, BoxLayout.Y_AXIS));
            aditionalLabel.add(newTracNghiem, java.awt.BorderLayout.CENTER);
        } else if ("Câu hỏi ngắn".equals(selectedOption)) {
            newTuluan = new tuLuanPanel();
            aditionalLabel.setLayout(new java.awt.BorderLayout());
            aditionalLabel.add(newTuluan, java.awt.BorderLayout.CENTER);
        }
        aditionalLabel.revalidate(); // Update layout
        aditionalLabel.repaint(); // Repaint
    }//GEN-LAST:event_questionComboBoxActionPerformed

    
//     public String getQuestionText() {
//       
//            return newTuluan.getQuestionContent(); // Lấy nội dung câu hỏi từ tuLuanPanel
//         // Nếu không phải câu hỏi ngắn, lấy từ questionTextField
//    }
     
     public String getTuLuanText() {
    return newTuluan.getQuestionContent();
}
    private void deleteQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteQuestionButtonActionPerformed
        // Remove this question panel from its parent
        JPanel parent = (JPanel) this.getParent();
        parent.remove(this);
        parent.revalidate();
        parent.repaint();
    }//GEN-LAST:event_deleteQuestionButtonActionPerformed

    // Getter for question text
    public String getQuestionText() {
        return questionTextField.getText();
    }

    // Getter for selected question type
    public String getQuestionType() {
        return (String) questionComboBox.getSelectedItem();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aditionalLabel;
    private javax.swing.JButton deleteQuestionButton;
    private javax.swing.JComboBox<String> questionComboBox;
    private javax.swing.JTextField questionTextField;
    // End of variables declaration//GEN-END:variables
}
