package StructuralPatterns.FacadePattern.JdbcWithAFacade;

import CreationPatterns.Singleton.DBSingleton;

import javax.management.InstanceAlreadyExistsException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DBSingleton instance = null;

    public JdbcFacade() throws InstanceAlreadyExistsException {
        instance = DBSingleton.getInstance();
    }

    public int createTable() throws SQLException {
        int count = 0;
        try {
            Connection conn = (Connection) instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("");
            sta.close();
            conn.close();
        } catch (Exception e) {
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection conn = (Connection) instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("");
            sta.close();
            conn.close();
        } catch (Exception e) {
        }
        return count;
    }

    public List<Address> getAddresses() throws SQLException {
        List<Address> addresses = new ArrayList<>();

        try {
            Connection con = (Connection) instance.getConnection();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("");

            while (rs.next()) {
                System.out.println(rs.getString(1)+ rs.getString(2) + rs.getString(3));
            }

            rs.close();
            statement.close();
            con.close();
        } catch (Exception e){

        }
        return addresses;
    }
}

class Address {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String id;
    String city;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    String state;
}
