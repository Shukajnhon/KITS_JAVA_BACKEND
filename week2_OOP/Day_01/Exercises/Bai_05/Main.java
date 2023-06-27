package week2_OOP.Day_01.Exercises.Bai_05;

public class Main {
    public static void main(String[] args) {

        System.out.println("====== Manager ======");
        Manager manager = new Manager("Tony", 1000);
        manager.getSalary();
        manager.getName();
        manager.showTasks();

        System.out.println("====== Developer ======");
        Developer developer = new Developer("Anna", 1000);
        developer.getName();
        developer.getSalary();
        developer.showTasks();

        System.out.println("====== SalesPerson ======");
        SalesPerson salesPerson = new SalesPerson("Jenny", 800);
        salesPerson.getName();
        salesPerson.getSalary();
        salesPerson.showTasks();

    }
}
