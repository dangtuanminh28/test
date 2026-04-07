package Array;

abstract class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract double getAverageScore();
}

class ITStudent extends  Student {
    private double javaScore;
    private double cssScore;

    public ITStudent(String id, String name, double javaScore, double cssScore) {
        super(id, name);
        this.javaScore = javaScore;
        this.cssScore = cssScore;
    }

    @Override
    public double getAverageScore() {
        return (javaScore + cssScore)/2;
    }
}

class LanguageStudent extends  Student {
    private double englishScore;
    private double frenchScore;

    public LanguageStudent(String id, String name, double englishScore, double frenchScore) {
        super(id, name);
        this.englishScore = englishScore;
        this.frenchScore = frenchScore;
    }

    @Override
    public double getAverageScore() {
        return (englishScore + frenchScore)/2;
    }
}