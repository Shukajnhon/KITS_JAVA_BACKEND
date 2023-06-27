package week2_OOP.Day_01.Exercises.Bai_05;

class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Methods
    // getter
    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public double getSalary() {
        System.out.println("Salary: " + salary);
        return salary;

    }

    // setter
    public void setName(String name) {

        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
