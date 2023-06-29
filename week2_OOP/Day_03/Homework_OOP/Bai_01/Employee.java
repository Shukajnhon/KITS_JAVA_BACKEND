package week2_OOP.Day_03.Homework_OOP.Bai_01;

class Employee {
    private String name, phoneNumber;
    private double salary;

    // Constructor
    public Employee(String name, String phoneNumber, double salary) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    // Getter
    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public String getPhoneNumber() {
        System.out.println("PhoneNumber: " + phoneNumber);
        return phoneNumber;
    }

    public double getSalary() {
        System.out.println("Salary: " + salary);
        return salary;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    // methods
    void work() {
        System.out.println("Employee is working");
    }

    // Calculator Salary
    public double calculateSalary() {
        return salary;
    }
}
