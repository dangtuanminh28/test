package ra.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            int choice;
            System.out.println("""
                    *********************QUẢN LÝ SINH VIÊN********************
                    1.Hiển thị danh sách sinh viên
                    2.Thêm sinh viên
                    3.Cập nhật thông tin sinh viên theo mã sinh viên
                    4.Xóa sinh viên theo mã sinh viên
                    5.Tìm sinh viên theo tên sinh viên
                    6.Thoát
                    Lựa chọn của bạn:
                    """);
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (listStudent.isEmpty()) {
                        System.err.println("Danh sách rỗng");
                    } else {
                        for (int i = 0; i <= listStudent.size(); i++) {
                            System.out.println("----- Danh sách học sinh thứ " + (i + 1) + "-----");
                            Student s = listStudent.get(i);
                            s.displayData();
                        }
                        System.out.println("----------------");
                    }
                    break;
                case 2:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ": ");
                        Student addStudent = new Student(0, "", 0, "");
                        addStudent.inputData(sc);
                        listStudent.add(addStudent);
                    }
                    System.out.println("Đã thêm thành công!");
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên để cập nhật: ");

                    break;
                case 4:
                    System.out.println("Nhập id sinh viên để xóa: ");
                    int deleteId = sc.nextInt();
                    boolean checkDelete = listStudent.removeIf(s -> s.getId() == deleteId);
                    if (checkDelete) {
                        System.out.println("Đã xóa id: " + deleteId);
                    } else {
                        System.err.println("Id ko tồn tại");
                    }
                    break;
                case 5:
                    System.out.println("Nhập id sinh viên để tìm kiếm: ");
                    String searchName = sc.nextLine();

                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.err.println("Lỗi ko hợp lệ");
            }
        } while (true);
    }
}
