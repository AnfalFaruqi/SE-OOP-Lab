package com.mycompany.timeattendancesystem;

import java.util.ArrayList;

public class OvertimeManager {

    private ArrayList<Overtime> overtimeRecords = new ArrayList<>();

    public void addOvertimeRecord(Overtime overtime) {
        overtimeRecords.add(overtime);
        System.out.println("Overtime record added successfully!");
    }

    public void viewOvertimeRecords() {
        if (overtimeRecords.isEmpty()) {
            System.out.println("No overtime records available.");
        } else {
            for (Overtime overtime : overtimeRecords) {
                System.out.println("-------------------------");
                overtime.displayOvertimeInfo();
            }
        }
    }

    public void updateOvertimeRecord(int employeeNumber, String newDate, String newStartHour, String newEndHour) {
        for (Overtime overtime : overtimeRecords) {
            if (overtime.getEmployeeNumber() == employeeNumber) {
                overtimeRecords.remove(overtime);
                overtimeRecords.add(new Overtime(overtime.getFirstName(), overtime.getLastName(),
                        overtime.getEmployeeNumber(), overtime.getDepartment(), newDate, newStartHour, newEndHour));
                System.out.println("Overtime record updated successfully!");
                return;
            }
        }
        System.out.println("Overtime record not found!");
    }

    public void deleteOvertimeRecord(int employeeNumber) {
        overtimeRecords.removeIf(overtime -> overtime.getEmployeeNumber() == employeeNumber);
        System.out.println("Overtime record deleted successfully!");
    }
}


