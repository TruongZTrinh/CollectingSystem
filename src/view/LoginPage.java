package view;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPagePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        emailField = new main_style.GradientTextField_Truong();
        passField = new main_style.GradientTextField_Truong();
        signInButton = new main_style.GradientButton_Truong();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signUpLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Mulish ExtraBold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HỆ THỐNG THU THẬP MẪU");
        loginPagePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/topImg.png"))); // NOI18N
        jLabel1.setText("HỆ THỐNG THU THẬP MẪU");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setDoubleBuffered(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 283));
        jLabel1.setRequestFocusEnabled(false);
        loginPagePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 800, 100));
        jLabel1.getAccessibleContext().setAccessibleName("");

        emailField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.setText("Nhập vào email");
        emailField.setToolTipText("");
        emailField.setFont(new java.awt.Font("Mulish", 0, 14)); // NOI18N
        emailField.setMargin(new java.awt.Insets(20, 60, 20, 60));
        emailField.setPreferredSize(new java.awt.Dimension(130, 20));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onEmailFieldAction(evt);
            }
        });
        loginPagePanel.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 210, 30));

        passField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.setText("Nhập vào mật khẩu");
        passField.setFont(new java.awt.Font("Mulish", 0, 14)); // NOI18N
        passField.setPreferredSize(new java.awt.Dimension(130, 20));
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onPassFieldAction(evt);
            }
        });
        loginPagePanel.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 210, 30));

        signInButton.setBorder(null);
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Đăng nhập");
        signInButton.setFont(new java.awt.Font("Mulish ExtraBold", 1, 14)); // NOI18N
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        loginPagePanel.add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 110, 40));

        jLabel4.setFont(new java.awt.Font("Mulish Medium", 0, 14)); // NOI18N
        jLabel4.setText("Quên mật khẩu?");
        loginPagePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Mulish Medium", 0, 14)); // NOI18N
        jLabel5.setText("Email");
        loginPagePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Mulish Medium", 0, 14)); // NOI18N
        jLabel6.setText("Mật khẩu");
        loginPagePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        signUpLabel.setFont(new java.awt.Font("Mulish Medium", 0, 14)); // NOI18N
        signUpLabel.setText("Đăng ký");
        loginPagePanel.add(signUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 60, -1));
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onSignUpLabelClicked(evt);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }
        });

        jLabel3.setFont(new java.awt.Font("Mulish ExtraBold", 0, 24)); // NOI18N
        jLabel3.setText("ĐĂNG NHẬP");
        loginPagePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onSignUpLabelClicked(java.awt.event.MouseEvent evt) {
        this.dispose();

        new SignupPage().setVisible(true);
    }
   
    private void onEmailFieldAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onEmailFieldAction
        // TODO add your handling code here:
    }//GEN-LAST:event_onEmailFieldAction

    private void onPassFieldAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onPassFieldAction
        // TODO add your handling code here:
    }//GEN-LAST:event_onPassFieldAction

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main_style.GradientTextField_Truong emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel loginPagePanel;
    private main_style.GradientTextField_Truong passField;
    private main_style.GradientButton_Truong signInButton;
    private javax.swing.JLabel signUpLabel;
    // End of variables declaration//GEN-END:variables
}
