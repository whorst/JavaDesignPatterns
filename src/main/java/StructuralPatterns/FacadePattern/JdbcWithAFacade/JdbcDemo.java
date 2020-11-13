package StructuralPatterns.FacadePattern.JdbcWithAFacade;

import CreationPatterns.Singleton.DBSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CreationPatterns.Singleton.DBSingleton;

import javax.management.InstanceAlreadyExistsException;


public class JdbcDemo {
    public static void main(String args []) throws InstanceAlreadyExistsException {
        DBSingleton instance = DBSingleton.getInstance();

        try{
            Connection conn = (Connection) instance.getConnection();
            Statement sta = conn.createStatement();
            int count = sta.executeUpdate("");

            System.out.println("Table created");

            sta.close();
            sta = conn.createStatement();
            sta.executeUpdate("");
            System.out.println(count + "records created");

            sta.close();

            sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("");

            while(rs.next()){
                System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
