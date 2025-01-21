package com.mycompany.timeattendancesystem;
import java.util.Scanner;

class Login implements LoginInterface {
    private String predefinedUsername;
    private String predefinedPassword;

    public Login(String username, String password) {
        this.predefinedUsername = username;
        this.predefinedPassword = password;
    }
    
    @Override
    public boolean login(String username, String password) throws LoginException {
        if (username == null || password == null) {
            throw new LoginException("Username or password cannot be null.");
        }
        if (username.equals(predefinedUsername) && password.equals(predefinedPassword)) {
            return true;
        } else {
            throw new LoginException("Invalid username or password.");
        }
    }
    
    @Override
    public void startLogin() {
        Scanner scanner = new Scanner(System.in);
        
    try {
            
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (login(inputUsername, inputPassword)) {
                System.out.println("Login successful! Welcome, " + inputUsername);
            }
        } catch (LoginException e) {
            System.out.println("Login failed: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            System.exit(1);
        }
    
    }
    

    
    
}
