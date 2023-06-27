package week2_OOP.Day_01.Exercises.Bai_05;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);

    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    void showTasks() {
        System.out.println("Quản lý nhân sự");
    }

}
