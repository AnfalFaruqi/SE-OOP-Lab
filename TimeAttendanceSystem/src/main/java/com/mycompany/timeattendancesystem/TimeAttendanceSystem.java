package com.mycompany.timeattendancesystem;
import java.util.ArrayList;
import java.util.Scanner;

public class TimeAttendanceSystem {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login loginSystem = new Login("employee1" , "12345" );
        ArrayList<LeaveApplication> leaveApplications = new ArrayList<>();
        OvertimeManager overtimeManager = new OvertimeManager();
        ArrayList<TimeAttendance> timeAtt = new ArrayList<>();

        loginSystem.startLogin();
       

        boolean cont = true;
        while (cont) {
        System.out.println("\nMain Menu:");
        System.out.println("1. Attendance Entry");
        System.out.println("2. Apply for Leave");
        System.out.println("3. Apply for Overtime");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        
        int mainChoice = scanner.nextInt();
        scanner.nextLine(); 

    switch (mainChoice) {
        case 1: 
            boolean Menu = true;
            while (Menu) {
                System.out.println("\nAttendance Menu:");
                System.out.println("1. Add Time Attendance Record");
                System.out.println("2. View Time Attendance Records");
                System.out.println("3. Edit Time Attendance Records");
                System.out.println("4. Delete Time Attendance Records");
                System.out.println("5. Back to Main Menu");
                System.out.print("Enter your choice: ");
                int attendanceChoice = scanner.nextInt();
                scanner.nextLine();

                switch (attendanceChoice) {
                    case 1:
                        System.out.print("Employee Number: ");
                        int empNo = scanner.nextInt();
                        System.out.print("Date (DD-MM-YYYY): ");
                        String attDate = scanner.next();
                        System.out.print("Check-In Time (HH:mm): ");
                        String checkIn = scanner.next();
                        System.out.print("Check-Out Time (HH:mm): ");
                        String checkOut = scanner.next();

                        TimeAttendance Att = new TimeAttendance(empNo, attDate, checkIn, checkOut);
                        timeAtt.add(Att);
                        System.out.println("Time attendance record added successfully!");
                        break;
                        
                    case 2:
                        if (timeAtt.isEmpty()) {
                            System.out.println("No time attendance records found.");
                        } else {
                            for (int i = 0; i < timeAtt.size(); i++) {
                                System.out.println("Record " + (i + 1) + ":");
                                timeAtt.get(i).displayAttendanceDetails();
                                System.out.println("--------------------");
                            }
                        }
                        break;
                        
                    case 3:
                        System.out.print("Enter the record number to edit: ");
                        int editIndex = scanner.nextInt() - 1; 
                        scanner.nextLine();  

                        if (editIndex >= 0 && editIndex < timeAtt.size()) {
                            System.out.print("Enter new Employee Number: ");
                            int newEmpNo = scanner.nextInt();
                            System.out.print("Enter new Date (DD-MM-YYYY): ");
                            String newAttDate = scanner.next();
                            System.out.print("Enter new Check-In Time (HH:mm): ");
                            String newCheckIn = scanner.next();
                            System.out.print("Enter new Check-Out Time (HH:mm): ");
                            String newCheckOut = scanner.next();

                        TimeAttendance updatedRecord = new TimeAttendance(newEmpNo, newAttDate, newCheckIn, newCheckOut);
                        timeAtt.set(editIndex, updatedRecord);  
                        System.out.println("Time attendance record updated successfully!");
                    } else {
                        System.out.println("Invalid record number.");
                    }
                        break;
                        
                    case 4:
       
                        System.out.print("Enter the record number to delete: ");
                        int deleteIndex = scanner.nextInt() - 1;  
                        scanner.nextLine();  

                        if (deleteIndex >= 0 && deleteIndex < timeAtt.size()) {
                        timeAtt.remove(deleteIndex);  
                        System.out.println("Time attendance record deleted successfully!");
                        } else {
                        System.out.println("Invalid record number.");
                        }
                        break;
                        
                    case 5:
                        Menu = false; 
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");

                        }
                    }
                        break;

        case 2: 
            boolean leaveMenu = true;
            while (leaveMenu) {
                System.out.println("\nLeave Menu:");
                System.out.println("1. Apply for Casual Leave");
                System.out.println("2. Apply for Sick Leave");
                System.out.println("3. View All Applications");
                System.out.println("4. Edit an Application");
                System.out.println("5. Delete an Application");
                System.out.println("6. Back to Main Menu");
                System.out.print("Enter your choice: ");
                int leaveChoice = scanner.nextInt();
                scanner.nextLine();

                switch (leaveChoice) {
                    case 1:
                        leaveApplications.add(LeaveApplicationHandler.createLeave(scanner, "casual"));
                        break;
                    case 2:
                        leaveApplications.add(LeaveApplicationHandler.createLeave(scanner, "sick"));
                        break;
                    case 3:
                        if (leaveApplications.isEmpty()) {
                            System.out.println("No leave applications found.");
                        } else {
                            for (int i = 0; i < leaveApplications.size(); i++) {
                                System.out.println("Application " + (i + 1) + ":");
                                leaveApplications.get(i).displayDetails();
                                System.out.println("--------------------");
                            }
                        }
                        break;
                    case 4:
                        LeaveApplicationHandler.editApplication(scanner, leaveApplications);
                        break;
                    case 5:
                        LeaveApplicationHandler.deleteApplication(scanner, leaveApplications);
                        break;
                    case 6:
                        leaveMenu = false; 
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
            break;

        case 3: 
            boolean overtimeMenu = true;
            while (overtimeMenu) {
                System.out.println("\nOvertime Menu:");
                System.out.println("1. Add Overtime Record");
                System.out.println("2. View Overtime Records");
                System.out.println("3. Update Overtime Record");
                System.out.println("4. Delete Overtime Record");
                System.out.println("5. Back to Main Menu");
                System.out.print("Enter your choice: ");
                int overtimeChoice = scanner.nextInt();
                scanner.nextLine();

                switch (overtimeChoice) {
                    case 1:
                        System.out.print("First Name: ");
                        String firstName = scanner.next();
                        System.out.print("Last Name: ");
                        String lastName = scanner.next();
                        System.out.print("Employee Number: ");
                        int employeeNumber = scanner.nextInt();
                        System.out.print("Department: ");
                        String department = scanner.next();
                        System.out.print("Overtime Date (DD-MM-YYYY): ");
                        String date = scanner.next();
                        System.out.print("Start Hour (HH:mm): ");
                        String startHour = scanner.next();
                        System.out.print("End Hour (HH:mm): ");
                        String endHour = scanner.next();

                        Overtime overtime = new Overtime(firstName, lastName, employeeNumber, department, date, startHour, endHour);
                        overtimeManager.addOvertimeRecord(overtime);
                        break;
                    case 2:
                        overtimeManager.viewOvertimeRecords();
                        break;
                    case 3:
                        System.out.print("Enter Employee Number to update: ");
                        int updateEmpNo = scanner.nextInt();
                        System.out.print("New Overtime Date (DD-MM-YYYY): ");
                        String newDate = scanner.next();
                        System.out.print("New Start Hour (HH:mm): ");
                        String newStartHour = scanner.next();
                        System.out.print("New End Hour (HH:mm): ");
                        String newEndHour = scanner.next();
                        overtimeManager.updateOvertimeRecord(updateEmpNo, newDate, newStartHour, newEndHour);
                        break;
                    case 4:
                        System.out.print("Enter Employee Number to delete: ");
                        int deleteEmpNo = scanner.nextInt();
                        overtimeManager.deleteOvertimeRecord(deleteEmpNo);
                        break;
                    case 5:
                        overtimeMenu = false; // Exit Overtime Menu
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
            break;

        case 4: 
            cont = false;
            System.out.println("Exiting the system. Goodbye!");
            break;

        default:
            System.out.println("Invalid choice! Please try again.");
    }
        }
    }
}



    






