package model;

import java.sql.ResultSet;
import java.sql.SQLException;

//import java.util.Objects;

public class User {
    private int userId;
    private String userName;
    private String userEmail;
    private int roleId; // Foreign key to Role

    // Constructors
    public User() {}

    public User(int userId, String userName, String userEmail, int roleId) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.roleId = roleId;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    // toString method
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
