package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private String userId;
    private String fullName;
    private String email;
    private String role;

    public User() {
        this("", "", "", "");
    }

    public User(String userId, String fullName, String email, String role) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
    }

    public User(ResultSet rs) throws SQLException {
        this(rs.getString("id"), rs.getString("name"), rs.getString("email"), rs.getString("role"));
    }

    public String getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", fullName=" + fullName + ", email=" + email + ", role=" + role + '}';
    }
}
