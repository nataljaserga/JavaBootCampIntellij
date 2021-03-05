package finalActivity;

public class Student {
    private String schoolName;

    public Student() {
    }

    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduce() {

        System.out.println("I am study in university "+this.schoolName);
    }
}
