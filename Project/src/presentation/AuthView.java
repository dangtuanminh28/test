package presentation;

import business.UserService;
import entity.User;
import java.util.Scanner;

public class AuthView {
    private UserService userService = new UserService();
    private Scanner sc = new Scanner(System.in);

    public void displayAuthMenu() {
        while (true) {
            System.out.println("""
                    -------------------------------------------------
                    |          HỆ THỐNG QUẢN LÝ NHÀ HÀNG            |
                    |                                               |
                    |          1. Đăng nhập                         |
                    |          2. Đăng ký                           |
                    |          3. Thoát                             |
                    |                                               |
                    -------------------------------------------------
                    Mời bạn nhập lựa chọn:
                    """);
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập lại!");
                continue;
            }
            switch (choice) {
                case 1:
                    handleLogin();
                    break;
                case 2:
                    handleRegister();
                    break;
                case 3:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private void handleLogin() {
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        User loggedInUser = userService.login(user, pass);

        if (loggedInUser != null) {
            System.out.println("Đăng nhập thành công! Quyền: " + loggedInUser.getRole());

            if (loggedInUser.getRole().equals("MANAGER")) {
                ManagerView managerView = new ManagerView();
                managerView.displayMenu();
            } else if (loggedInUser.getRole().equals("CHEF")) {

            } else {

            }
        } else {
            System.out.println("Sai mật khẩu");
        }
    }

    private void handleRegister() {
        System.out.println("--- ĐĂNG KÝ KHÁCH HÀNG ---");
        System.out.print("Tên đăng nhập mới: ");
        String user = sc.nextLine();
        System.out.print("Mật khẩu: ");
        String pass = sc.nextLine();
        System.out.print("Họ tên: ");
        String name = sc.nextLine();

        String result = userService.register(user, pass, name);
        System.out.println(result);
    }
}
