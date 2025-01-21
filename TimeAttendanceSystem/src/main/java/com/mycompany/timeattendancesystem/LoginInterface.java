package com.mycompany.timeattendancesystem;

public interface LoginInterface {
    
    boolean login(String username, String password) throws LoginException;
    void startLogin();
}
