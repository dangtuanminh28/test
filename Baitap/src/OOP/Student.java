package OOP;

import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public int age;
    private String job;

    public Student(int id, String name, int age, String job) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public void inputData(Scanner scanner) {
        if (this.id == 0) {
            System.out.println("Nhập id: ");
            this.id = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập Tên: ");
        this.name = scanner.nextLine();
        while (true) {
            System.out.println("Nhập tuổi: ");
            try {
                this.age = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Nhập công việc: ");
        this.job = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("ID: " + this.id);
        System.out.println("Tên: " + this.name);
        System.out.println("Tuổi: " +this.age);
        System.out.println("Job: " + this.job);
    }
}

/*
Phương thức inputData(Scanner scanner): cho phép nhập đầy đủ thông tin của sinh viên
Phương thức displayData(): cho phép hiển thị thông tin của sinh viên
Xây dựng lớp main StudentManagement trong package ra.presentation hiển thị menu và thực hiện các chức năng theo menu sau:
Lưu ý:
Khi thêm sinh viên có thể thêm được nhiều sinh viên
Khi cập nhật và xóa sinh viên, nếu mã sinh viên không tồn tại phải thông báo “Mã sinh viên không tồn tại”
Tìm sinh viên theo tên, hiển thị đầy đủ thông tin sinh viên tìm thấy và tổng số lượng sinh viên tìm thấy
 */