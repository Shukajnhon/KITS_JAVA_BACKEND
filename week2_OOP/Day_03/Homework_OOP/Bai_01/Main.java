package week2_OOP.Day_03.Homework_OOP.Bai_01;

public class Main {
    // 1. Quản lý nhân viên: Xây dựng một hệ thống quản lý nhân viên, trong đó bạn
    // cần tạo các lớp như Employee, Manager, và Engineer. Mỗi lớp sẽ có các thuộc
    // tính và phương thức riêng, và sử dụng tính kế thừa để tái sử dụng mã.
    public static void main(String[] args) {

        System.out.println("======= Employee ======= ");
        // Employee
        Employee employee = new Employee("David", "094xxxxxxx", 800);
        employee.getName();
        employee.getPhoneNumber();
        employee.work();

        System.out.println("======= Engineer ======= ");
        // Engineer
        Engineer engineer = new Engineer("John", "094xxxxxxx", 1200, "Developer");

        engineer.getName();
        engineer.getRole();
        engineer.work();

        System.out.println("======= Manager ======= ");
        // manager
        Manager manager = new Manager("Anna", "096xxxxxxx", 1400, "Marketing");
        manager.getName();
        manager.getDepartment();
        manager.work();

    }
}
