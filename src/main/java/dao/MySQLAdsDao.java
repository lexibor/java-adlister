package dao;

import com.mysql.cj.jdbc.Driver;
import model.Ad;
import model.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads
{

    private Connection connection;

    public MySQLAdsDao(Config config) {
        try
        {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }


    @Override
    public List<Ad> all()
    {
        List<Ad> ads = new ArrayList<>();

        try
        {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");

            while(rs.next())
            {
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("description")

                );

                ads.add(ad);
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return ads;
    }

    @Override
    public Long insert(Ad ad)
    {
        try
        {
            String insertQuery = String.format("INSERT INTO ads(user_id, title, description) VALUES (%d, '%s', '%s')",
                    1,
                    ad.getTitle(),
                    ad.getDescription()
                    );
            System.out.println(insertQuery);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
//            if(rs.next())
//            {
//                System.out.println(rs.getLong(1));
//            }
            rs.next();

            return rs.getLong(1);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

    }
}
