package com.mycompany.timeattendancesystem;
import java.util.ArrayList;
import java.util.Scanner;

class LeaveApplicationHandler {

    //all of the CRUD methods
    
    public static LeaveApplication createLeave(Scanner scanner, String type) {
        System.out.print("Enter Employee Number: ");
        String employeeNumber = scanner.nextLine();

        
        System.out.print("Enter Start Date (DD-MM-YYYY): ");
        String startDate = scanner.nextLine();

        System.out.print("Enter End Date (DD-MM-YYYY): ");
        String endDate = scanner.nextLine();
        
        System.out.println("Data has been stored.");

        if (type.equals("casual")) {
            return new CasualLeave(employeeNumber, startDate, endDate);
        } else if (type.equals("sick")) {
            return new SickLeave(employeeNumber, startDate, endDate);
        } else {
            throw new IllegalArgumentException("Unknown leave type: " + type);
        }
    }

    
    public static void editApplication(Scanner scanner, ArrayList<LeaveApplication> leaveApplications) {
        System.out.print("Enter the application number to edit: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); 

        if (index >= 0 && index < leaveApplications.size()) {
            
            System.out.print("Enter new Start Date (DD-MM-YYYY): ");
            String newStartDate = scanner.nextLine();

            System.out.print("Enter new End Date (DD-MM-YYYY): ");
            String newEndDate = scanner.nextLine();

            leaveApplications.get(index).updateDetails(newStartDate, newEndDate);
            System.out.println("Application updated successfully.");
        } else {
            System.out.println("Invalid application number.");
        }
    }

   
    public static void deleteApplication(Scanner scanner, ArrayList<LeaveApplication> leaveApplications) {
        System.out.print("Enter the application number to delete: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); 

        if (index >= 0 && index < leaveApplications.size()) {
            leaveApplications.remove(index);
            System.out.println("Application deleted successfully.");
        } else {
            System.out.println("Invalid application number.");
        }
    }
}
