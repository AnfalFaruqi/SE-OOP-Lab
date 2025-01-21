package com.mycompany.timeattendancesystem;

class Overtime extends Employee {
    private String overtimeDate;
    private String startHour;
    private String endHour;

    public Overtime(String firstName, String lastName, int employeeNumber, String department,
                    String overtimeDate, String startHour, String endHour) {
        super(firstName, lastName, employeeNumber, department);
        this.overtimeDate = overtimeDate;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public String getOvertimeDate() {
        return overtimeDate;
    }

    public String getStartHour() {
        return startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void displayOvertimeInfo() {
        displayEmployeeInfo();
        System.out.println("Overtime Date: " + overtimeDate);
        System.out.println("Start Hour: " + startHour);
        System.out.println("End Hour: " + endHour);
    }

}
