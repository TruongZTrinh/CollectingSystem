package view;

import database.DatabaseConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.mindrot.jbcrypt.BCrypt;

public class SignupPage extends javax.swing.JFrame {
    private final String placeholderEmail = "Nhập vào email";
    private final String placeholderPassword = "Nhập vào mật khẩu";
    private final String placeholderName = "Nhập vào tên người dùng";
    private final String placeholderRePassword = "Nhập lại mật khẩu";
    
     public SignupPage() {
        initComponents();
    }
    
    Connection connect = DatabaseConnection.getConnection();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appNameLabel = new javax.swing.JLabel();
        headerBackground = new javax.swing.JLabel();
        emailField = new main_style.GradientTextField_Truong();
        passField = new main_style.GradientTextField_Truong();
        nameField = new main_style.GradientTextField_Truong();
        rePassField = new main_style.GradientTextField_Truong();
        signUpButton = new main_style.GradientButton_Truong();
        dangKyLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        rePassLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appNameLabel.setFont(new java.awt.Font("Mulish ExtraBold", 0, 36)); // NOI18N
        appNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        appNameLabel.setText("HỆ THỐNG THU THẬP MẪU");
        getContentPane().add(appNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        headerBackground.setForeground(new java.awt.Color(255, 255, 255));
        headerBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/topImg.png"))); // NOI18N
        headerBackground.setText("HỆ THỐNG THU THẬP MẪU");
        headerBackground.setToolTipText("");
        headerBackground.setAlignmentY(0.0F);
        headerBackground.setDoubleBuffered(true);
        headerBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        headerBackground.setMaximumSize(new java.awt.Dimension(0, 0));
        headerBackground.setMinimumSize(new java.awt.Dimension(0, 0));
        headerBackground.setPreferredSize(new java.awt.Dimension(100, 283));
        headerBackground.setRequestFocusEnabled(false);
        getContentPane().add(headerBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 820, 100));
        headerBackground.getAccessibleContext().setAccessibleName("");

        emailField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.setText("Nhập vào email");
        emailField.setFont(new java.awt.Font("Mulish", 0, 14)); // NOI18N
        emailField.setPreferredSize(new java.awt.Dimension(130, 20));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onEmailFieldAction(evt);
            }
        });
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 250, 30));

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
        getContentPane().add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 250, 30));

        nameField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setText("Nhập vào tên người dùng");
        nameField.setFont(new java.awt.Font("Mulish", 0, 14)); // NOI18N
        nameField.setPreferredSize(new java.awt.Dimension(130, 20));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onNameFieldAction(evt);
            }
        });
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 250, 30));

        rePassField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        rePassField.setForeground(new java.awt.Color(255, 255, 255));
        rePassField.setText("Nhập lại mật khẩu");
        rePassField.setActionCommand("<Not Set>");
        rePassField.setFont(new java.awt.Font("Mulish", 0, 14)); // NOI18N
        rePassField.setPreferredSize(new java.awt.Dimension(130, 20));
        rePassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRePassFieldAction(evt);
            }
        });
        getContentPane().add(rePassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 250, 30));

        signUpButton.setBorder(null);
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Đăng ký");
        signUpButton.setFont(new java.awt.Font("Mulish ExtraLight", 1, 18)); // NOI18N
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 110, 40));
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dangKyLabel.setFont(new java.awt.Font("Mulish ExtraBold", 0, 24)); // NOI18N
        dangKyLabel.setText("ĐĂNG KÝ");
        getContentPane().add(dangKyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 120, -1));

        passLabel.setFont(new java.awt.Font("Mulish Medium", 0, 18)); // NOI18N
        passLabel.setText("Mật khẩu");
        getContentPane().add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 245, 90, -1));

        rePassLabel.setFont(new java.awt.Font("Mulish Medium", 0, 18)); // NOI18N
        rePassLabel.setText("Mật khẩu");
        getContentPane().add(rePassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 245, 90, -1));

        emailLabel.setFont(new java.awt.Font("Mulish Medium", 0, 18)); // NOI18N
        emailLabel.setText("Email");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 175, 90, 20));

        phoneLabel.setFont(new java.awt.Font("Mulish Medium", 0, 18)); // NOI18N
        phoneLabel.setText("Tên người dùng");
        getContentPane().add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 175, 130, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onNameFieldAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onNameFieldAction
        String name = nameField.getText().trim();
        if (!name.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại chỉ nên chứa các chữ số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (name.length() < 9 || name.length() > 11) {
            JOptionPane.showMessageDialog(this, "Số điện thoại nên có độ dài từ 9 đến 11 số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_onNameFieldAction

    private void onRePassFieldAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRePassFieldAction
        String password = passField.getText().trim();
        String rePassword = rePassField.getText().trim();
        if (!rePassword.equals(password)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không khớp!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_onRePassFieldAction

    private void onEmailFieldAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onEmailFieldAction
        String email = emailField.getText().trim();
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!Pattern.matches(emailRegex, email)) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_onEmailFieldAction

    private void onPassFieldAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onPassFieldAction
        String password = passField.getText().trim();
        if (password.length() < 6) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải có ít nhất 6 ký tự!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_onPassFieldAction

    private void addPlaceholderText() {
        setPlaceholder(emailField, placeholderEmail);
        setPlaceholder(passField, placeholderPassword);
        setPlaceholder(nameField, placeholderName);
        setPlaceholder(rePassField, placeholderRePassword);
    }

    private void setPlaceholder(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);

        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                }
            }
        });
    }
    
    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        String email = emailField.getText().trim();
        String name = nameField.getText().trim();
        String password = passField.getText().trim();
        String rePassword = rePassField.getText().trim();
        
         // Ignore placeholder text in validation
        if (email.equals(placeholderEmail)) email = "";
        if (name.equals(placeholderName)) name = "";
        if (password.equals(placeholderPassword)) password = "";
        if (rePassword.equals(placeholderRePassword)) rePassword = "";

        if (email.isEmpty() || name.isEmpty() || password.isEmpty() || rePassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền tất cả các trường!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (!Pattern.matches("^[a-zA-Z\\s]+$", name)) {
            JOptionPane.showMessageDialog(this, "Tên chỉ nên chứa các chữ cái và dấu cách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (!Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email)) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (password.length() < 6) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải có ít nhất 6 ký tự!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không khớp!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            // Thêm người dùng vào cơ sở dữ liệu nếu hợp lệ
            try (PreparedStatement stmt = connect != null ? connect.prepareStatement("INSERT INTO user (user_email, user_name, user_password) VALUES (?, ?, ?)") : null) {
                String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
                if (stmt != null) {
                    stmt.setString(1, email);
                    stmt.setString(2, name);
                    stmt.setString(3, hashedPassword);

                    int rowsInserted = stmt.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(this, "Đăng ký thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    }
                    this.dispose();
                    new LoginPage().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể tạo lệnh PreparedStatement!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi thực hiện câu lệnh SQL: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JLabel dangKyLabel;
    private main_style.GradientTextField_Truong emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel headerBackground;
    private main_style.GradientTextField_Truong nameField;
    private main_style.GradientTextField_Truong passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel phoneLabel;
    private main_style.GradientTextField_Truong rePassField;
    private javax.swing.JLabel rePassLabel;
    private main_style.GradientButton_Truong signUpButton;
    // End of variables declaration//GEN-END:variables
}
