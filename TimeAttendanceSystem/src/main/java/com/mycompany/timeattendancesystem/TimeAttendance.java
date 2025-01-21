package com.mycompany.timeattendancesystem;

public class TimeAttendance {
    private int employeeNumber;
    private String date;
    private String checkIn;
    private String checkOut;

    public TimeAttendance(int employeeNumber, String date, String checkIn, String checkOut) {
        this.employeeNumber = employeeNumber;
        this.date = date;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getDate() {
        return date;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void displayAttendanceDetails() {
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Date: " + date);
        System.out.println("Check-In Time: " + checkIn);
        System.out.println("Check-Out Time: " + checkOut);
    }
}
