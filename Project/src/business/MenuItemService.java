package business;

import entity.MenuItem;
import utils.DataConnectionManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuItemService {

    public List<MenuItem> getAll() {
        List<MenuItem> list = new ArrayList<>();
        String sql = "SELECT menu_id, name, price, type, status_menu FROM menu_items";

        try (Connection conn = DataConnectionManager.openConnect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                MenuItem item = new MenuItem(
                        rs.getInt("menu_id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getString("type"),
                        rs.getString("status_menu")
                );
                list.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}