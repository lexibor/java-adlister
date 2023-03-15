import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmployees
{
    public static void main(String[] args)
    {
        try {
            // register driver
            DriverManager.registerDriver(new Driver());
            // make the connection

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            //create a statement object

            Statement stmt = connection.createStatement();

            // run query with statement and parse result set

            String query = "SELECT * FROM employees";
            ResultSet rs = stmt.executeQuery(query);


            List<String> names = new ArrayList<>();

            for (int i = 0; i < 10; i++)
            {
                rs.next();
                names.add(rs.getString("first_name"));
            }

            System.out.println(names);


        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }




    }
}
