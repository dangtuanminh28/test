package Array;


import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

class ClassManager {
    private Set<String> studentIds = new HashSet<>();
    private List<Student> studentList = new ArrayList<>();
    private Map<String, Student> studentMap = new HashMap<>();

    public void addStudent(Student s) {
        if(studentIds.contains(s.getId())) {
            System.err.println("Lỗi: ID " + s.getId() +  " đã tồn tại!");
        } else {
            studentIds.add(s.getId());
            studentList.add(s);
            studentMap.put(s.getId(), s);
        }
    }

    public void displayStudent() {
        for (Student s : studentList) {
            System.out.println("Id: " + s.getId());
            System.out.println("Tên: " + s.getName());
            System.out.println("Điểm trung bình: " + s.getAverageScore());
            System.out.println("-------------------------");
        }
    }

    public void sortStudent() {
        System.out.println("Danh sách sinh viên đã đc xếp theo giảm dần");
        studentList.sort((s1, s2) -> Double.compare(s2.getAverageScore(), s1.getAverageScore()));
    }
}

public class Main {
    public static void main(String[] args) {
        ClassManager manager = new ClassManager();

        System.out.println("Danh sách sinh viên");
        manager.addStudent(new ITStudent("B201", "Minh", 9.0, 8.0));
        manager.addStudent(new LanguageStudent("B202", "Lan", 7.5, 9.5));
        manager.addStudent(new ITStudent("B203", "Nam", 6.0, 7.0));

        // Trùng id
        manager.addStudent(new ITStudent("B203", "Nam", 6.0, 7.0));

        manager.displayStudent();

        manager.sortStudent();
        manager.displayStudent();
    }
}
