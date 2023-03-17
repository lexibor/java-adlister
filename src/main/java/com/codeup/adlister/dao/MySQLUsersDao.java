package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import model.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users
{
    private Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }


    @Override
    public User findByUsername(String username)
    {
        String sql = "SELECT * FROM users WHERE username = ?";
        try
        {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            for(User user : createUsersFromResults(rs))
            {
                if(user.getUsername().equals(username))
                {
                    return user;
                }
            }

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

//    @Override
//    public User findPassword(String password)
//    {
//        String sql = "SELECT * FROM users WHERE password = ?";
//        try
//        {
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, password);
//            ResultSet rs = ps.executeQuery();
//            for(User user : createUsersFromResults(rs))
//            {
//                if(user.getPassword().equals(password))
//                {
//                    return user;
//                }
//            }
//
//        }
//        catch (SQLException e)
//        {
//            throw new RuntimeException(e);
//        }
//        return null;
//    }




    @Override
    public Long insert(User user)
    {
        try {
            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            PreparedStatement ps = connection.prepareStatement(createInsertQuery(user), PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }

    private String createInsertQuery(User user) {
        return "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    }



    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }



    private List<User> createUsersFromResults(ResultSet rs) {
        List<User> users = new ArrayList<>();
       try
        {
            while (rs.next())
            {
                users.add(extractUser(rs));
            }

//            for(User user : users)
//            {
//                System.out.println(user.getPassword());
//            }

            return users;

        }
       catch(SQLException e)
       {
           throw new RuntimeException(e);
       }
    }


//    public static void main(String[] args)
//    {
//
//        User user = new User("MikuHatsune", "greatestvocaloid@email.com", "worldismine");
//        DaoFactory.getUsersDao().insert(user);
//        System.out.println(DaoFactory.getUsersDao().findByUsername("MikuHatsune").getPassword());
//
//    }

}
