package Db;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class firstdb {
    public static void main(String[] args) {
        String path = "jdbc:mysql://localhost:3306/school";
        Connection conn;
        try {
            conn = DriverManager.getConnection(path, "root", "");

            Statement statement = conn.createStatement();
            statement.executeUpdate("Insert into student values(4, 'mars');");

            ResultSet rs = statement.executeQuery("Select * from student;");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }


        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }

    }
}

class db {
    String path = "jdbc:mysql://localhost:3306/school";
    Connection conn;

    public void insert(String query) throws SQLException {

        try {
            conn = DriverManager.getConnection(path, "root", "");
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println("SQLError");
            throw new SQLException();
        }


    }

    public ResultSet fetch(String query) throws SQLException {
        try {
            conn = DriverManager.getConnection(path, "root", "");

            Statement statement = conn.createStatement();

            return statement.executeQuery(query);
        }
        catch (SQLException e) {
            System.err.println("SQLError");
            throw new SQLException();
        }

    }
}
