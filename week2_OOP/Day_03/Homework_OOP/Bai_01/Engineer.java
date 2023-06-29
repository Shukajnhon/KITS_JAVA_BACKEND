package week2_OOP.Day_03.Homework_OOP.Bai_01;

public class Engineer extends Employee {

    private String role;

    public Engineer(String name, String phoneNumber, double salary, String role) {
        super(name, phoneNumber, salary);
        this.role = role;
    }

    // getter
    public String getRole() {
        System.out.println("Role: " + role);
        return role;
    }

    // setter
    public void setRole(String role) {
        this.role = role;
    }

    // methods
    void work() {
        System.out.println("Engineer is working");
    }

}
