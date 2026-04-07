package business;

import entity.User;
import utils.DataConnectionManager;
import java.sql.*;

public class UserService {

    public User login(String userInput, String passInput) {
        String sql = "SELECT user_id, username, role, status FROM users WHERE username = ? AND password = ?";

        try (Connection conn = DataConnectionManager.openConnect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, userInput);
            pstmt.setString(2, passInput);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new User(
                            String.valueOf(rs.getInt("user_id")),
                            rs.getString("username"),
                            rs.getString("username"),
                            "",
                            rs.getString("role"),
                            rs.getString("status")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String register(String user, String pass, String name) {
        if (user.trim().isEmpty() || pass.trim().isEmpty()) {
            return "Tên đăng nhập và mật khẩu không được để trống!";
        }

        if (isUsernameExists(user)) {
            return "Tài khoản '" + user + "' đã tồn tại!";
        }

        String sql = "INSERT INTO users (username, password, role, status) VALUES (?, ?, 'CUSTOMER', 'ACTIVE')";

        try (Connection conn = DataConnectionManager.openConnect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user);
            pstmt.setString(2, pass);

            if (pstmt.executeUpdate() > 0) {
                return "Đăng ký thành công";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
        return "Đăng ký thất bại!";
    }

    private boolean isUsernameExists(String username) {
        String sql = "SELECT COUNT(*) FROM users WHERE username = ?";
        try (Connection conn = DataConnectionManager.openConnect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}