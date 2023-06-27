package week2_OOP.Day_01.Exercises.Bai_05;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    void showTasks() {
        System.out.println("fixing bugs");
    }

}
