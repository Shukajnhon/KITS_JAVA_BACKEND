package week2_OOP.Day_03.Homework_OOP.Bai_01;

class Manager extends Employee {

    private String department;

    // Constructor
    public Manager(String name, String phoneNumber, double salary, String department) {
        super(name, phoneNumber, salary);
        this.department = department;
    }

    // getter
    public String getDepartment() {
        return department;
    }

    // Setter
    public void setDepartment(String department) {
        this.department = department;
    }

    // methods
    void work() {
        System.out.println("Manager is working");
    }

}
