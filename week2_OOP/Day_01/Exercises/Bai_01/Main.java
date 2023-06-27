package week2_OOP.Day_01.Exercises.Bai_01;

public class Main {
    public static void main(String[] args) {
        UniversityStudent ubUniversityStudent = new UniversityStudent("Peter", "ABC123", 2000);
        ubUniversityStudent.getName();
        ubUniversityStudent.getStudentId();
        ubUniversityStudent.showInfo();

        System.out.println("======collegeStudent======");
        CollegeStudent collegeStudent = new CollegeStudent("Anna", "123ABC", 2000);
        collegeStudent.getName();
        collegeStudent.getStudentId();
        collegeStudent.showInfo();
    }
}
