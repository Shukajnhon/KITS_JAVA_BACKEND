package week2_OOP.Day_01.Exercises.Bai_01;

public class Student {
    String name;
    String student_id;
    int yearOfBirth;

    // Constructor
    public Student(String name, String student_id, int yearOfBirth) {
        this.name = name;
        this.student_id = student_id;
        this.yearOfBirth = yearOfBirth;
    }

    // Methods

    // get name
    void getName() {
        System.out.println("Name: " + name);
    }

    // get student_id
    void getStudentId() {
        System.out.println("Student_ID: " + student_id);
    }

    // show info
    void showInfo() {
        System.out.println("Info: ");
        System.out.println("Name: " + name);
        System.out.println("Student_ID: " + student_id);
        System.out.println("YearOfBirth: " + yearOfBirth);
    }
}
