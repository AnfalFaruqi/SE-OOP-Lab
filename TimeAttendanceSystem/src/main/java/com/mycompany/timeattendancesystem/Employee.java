package com.mycompany.timeattendancesystem;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private int employeeNumber;
    private String department;

    public Employee(String firstName, String lastName, int employeeNumber, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Department: " + department);
    }

}
