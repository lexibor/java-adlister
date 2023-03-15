import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCExample
{
    public static void main(String[] args)
    {
        try
        {
            // register driver
            DriverManager.registerDriver(new Driver());

            // make the connection

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            //create a statement object

            Statement stmt = connection.createStatement();

            // run query with statement and parse result set

            String query = "SELECT * FROM albums";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next())
            {
                System.out.println(rs.getString("artist"));
            }

        }
        catch(SQLException sqlx)
        {
            throw new RuntimeException(sqlx);
        }
    }
}
