package bank.management.system;

import java.sql.*;

public class Connect_DB {

    Connection connection;

    Statement statement;

    public Connect_DB(){

        try{
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banksystem_1","root","SQLbench");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
