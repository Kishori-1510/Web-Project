package com.mvc_example.model;
import java.sql.*;


public class DAOserviseImpl implements DAOservise{

    private Connection connection;
    private Statement stmt;

    @Override
    public void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration","root","kishori15");
            stmt=connection.createStatement();


        }catch (Exception e){
          e.printStackTrace();
        }
    }

    @Override
    public boolean verifyLogin(String email, String password) {
      try {
          ResultSet result= stmt.executeQuery("select * from login where email='"+email+"'and password='"+password+"'");
          if (result.next()){
              return true;
          }else{
              return  false;
          }

      }catch (Exception e){
          e.printStackTrace();
      }
        return false;
    }

    @Override
    public void saveRegistration(String name, String city, String email, String mobile) {
    try {
       stmt.executeUpdate("insert into register values('"+name+"','"+city+"','"+email+"','"+mobile+"')");


    }catch (Exception e){
        e.printStackTrace();
    }

    }

    @Override
    public void deleteRegistration(String email) {
      try {
          stmt.executeUpdate("delete from register where email='"+email+"'");

      }catch (Exception e)
      {
          e.printStackTrace();
      }
    }

    @Override
    public void updateRegistration(String mobile, String email) {
        try {
            stmt.executeUpdate("update register set mobile='"+mobile+"' where email='"+email+"'");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public ResultSet getAllRegistration() {
        try {
            ResultSet result= stmt.executeQuery("select * from register");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
}
