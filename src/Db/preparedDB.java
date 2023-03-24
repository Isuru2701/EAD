package Db;
import java.sql.*;

public class preparedDB {


    public static void main(String[] args) {
        String path = "jdbc:mysql://localhost:3306/school";
        Connection conn;

        try {
            conn = DriverManager.getConnection(path, "root", "");
            PreparedStatement statement = conn.prepareStatement("Insert into student values(?, ?);");

            //array with 10 random names
            String[] names = {"John", "Peter", "Mary", "Jane", "Bob", "Alice", "Mars", "Venus", "Jupiter", "Saturn"};
            //for loop, 1 to 10
            for (int i = 0; i < 10; i++) {
                statement.setInt(1, i);
                statement.setString(2, names[i]);
                statement.executeUpdate();
            }
        }
        catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }
    }
}
