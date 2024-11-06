package dao;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public final class UserDao {
    public static String insertUser(User user) {
        try (Connection cnt = new DbContext().getConnection()) {
            // Kiem tra xem user da ton tai chua
            if (UserDao.getUserById(user.getUserId()) != null) {
                return "Người dùng đã tồn tại!";
            }

            String sql = "INSERT INTO user (id, name, role, email) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = cnt.prepareStatement(sql);
            ps.setString(1, user.getUserId());
            ps.setString(2, user.getFullName());
            ps.setString(3, user.getRole());
            ps.setString(4, user.getEmail());
            ps.executeUpdate();
            return "Thêm người dùng thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return e.getSQLState();
        }
    }

    public static User getUserById(String userId) {
        try (Connection cnt = new DbContext().getConnection()) {
            String sql = "SELECT * FROM user WHERE id = ?";
            PreparedStatement ps = cnt.prepareStatement(sql);
            ps.setString(1, userId);
            ResultSet rs = ps.executeQuery();
            return rs.next() ? new User(rs) : null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String updateUser(User user) {
        try (Connection cnt = new DbContext().getConnection()) {
            String sql = "UPDATE user SET name = ?, role = ?, email = ? WHERE id = ?";
            PreparedStatement ps = cnt.prepareStatement(sql);
            ps.setString(1, user.getFullName());
            ps.setString(2, user.getRole());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getUserId());
            ps.executeUpdate();
            return "Cập nhật người dùng thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return e.getSQLState();
        }
    }

    public static List<User> getAllUsers() {
        try (Connection cnt = new DbContext().getConnection()) {
            String sql = "SELECT * FROM user";
            ResultSet rs = cnt.prepareStatement(sql).executeQuery();
            List<User> users = new ArrayList<>();
            while (rs.next()) {
                users.add(new User(rs));
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static String deleteUser(String userId) {
        try (Connection cnt = new DbContext().getConnection()) {
            String sql = "DELETE FROM user WHERE id = ?";
            PreparedStatement ps = cnt.prepareStatement(sql);
            ps.setString(1, userId);
            ps.executeUpdate();
            return "Xóa người dùng thành công!";
        } catch (SQLException e) {
            e.printStackTrace();
            return e.getSQLState();
        }
    }

    public static String save(User user, boolean isAdd) {
        return isAdd ? UserDao.insertUser(user) : UserDao.updateUser(user);
    }
}
