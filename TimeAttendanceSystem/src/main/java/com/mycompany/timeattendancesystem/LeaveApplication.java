package com.mycompany.timeattendancesystem;

class LeaveApplication {
    
    protected String employeeNumber;
    protected String startDate;
    protected String endDate;
    
public LeaveApplication(String employeeNumber, String startDate, String endDate) 
    {
        this.employeeNumber = employeeNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }
  
public void displayDetails() 
    {
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
public void updateDetails(String startDate, String endDate) 
    {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

class CasualLeave extends LeaveApplication {
    
public CasualLeave(String employeeNumber, String startDate, String endDate) 
{
    super(employeeNumber, startDate, endDate);
}

@Override
public void displayDetails() 
{
    System.out.println("** Casual Leave Application **");
    super.displayDetails();
}
}

class SickLeave extends LeaveApplication {
    
    public SickLeave(String employeeNumber, String startDate, String endDate) 
    {
        super(employeeNumber, startDate, endDate);
    }

    @Override
    public void displayDetails() 
    {
        System.out.println("** Sick Leave Application **");
        super.displayDetails();
    }
}
