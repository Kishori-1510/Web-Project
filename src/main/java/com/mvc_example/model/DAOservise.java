package com.mvc_example.model;

import java.sql.ResultSet;

public interface DAOservise {
    public void connectDB();
    public boolean verifyLogin(String email,String password);
    public void saveRegistration(String name,String city ,String email,String mobile);
    public void deleteRegistration(String email);
    public ResultSet getAllRegistration();
    public void updateRegistration(String mobile,String email);

}
