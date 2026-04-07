package presentation;

import business.MenuItemService;
import entity.MenuItem;
import java.util.List;
import java.util.Scanner;

public class ManagerView {
    private MenuItemService menuService = new MenuItemService();
    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        int choice;

        do {
            System.out.println("""
                    -------------------------------------------------
                    |          HỆ THỐNG QUẢN LÝ (MANAGER)           |
                    |                                               |
                    |          1. Thêm món ăn                       |
                    |          2. Xóa món ăn                        |
                    |          3. Sửa món ăn                        |
                    |          4. Tìm kiếm món ăn theo tên          |
                    |          5. Xem danh sách món ăn (Dạng bảng)  |
                    |          6. Đăng xuất                         |
                    |                                               |
                    -------------------------------------------------
                    Mời bạn nhập lựa chọn:
                    """);

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
                continue;
            }

            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    deleteMenu();
                    break;
                case 5:
                    displayList();
                    break;
                case 6:
                    System.out.println("Đang quay lại màn hình chính...");
                    break;
                default:
                    System.err.println("Vui lòng nhập lại!");
            }
        } while (true);
    }

    private void displayList() {
        List<MenuItem> list = menuService.getAll();

        System.out.println("\n" + "=".repeat(80));
        System.out.printf("| %-5s | %-25s | %-15s | %-12s | %-10s |%n",
                "ID", "TÊN MÓN", "GIÁ ", "LOẠI", "TRẠNG THÁI");
        System.out.println("-".repeat(80));

        if (list.isEmpty()) {
            System.out.println("| " + " ".repeat(20) + "DANH SÁCH ĐANG TRỐNG" + " ".repeat(30) + " |");
        } else {
            for (MenuItem item : list) {
                System.out.printf("| %-5d | %-25s | %-15s | %-12s | %-10s |%n",
                        item.getMenu_id(),
                        item.getName(),
                        String.format("%,.0f", item.getPrice()), // Định dạng 50,000
                        item.getType(),
                        item.getStatus_menu());
            }
        }
        System.out.println("=".repeat(80) + "\n");
    }

    private void addMenu() {
    }

    private void deleteMenu() {
    }
}