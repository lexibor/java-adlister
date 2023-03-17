package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Connection connection = null;
        String username = request.getParameter("username");
        String password = request.getParameter("password");

//
//        System.out.println(username);
//        System.out.println(password);

        // TODO: find a record in your database that matches the submitted password
//        User user = DaoFactory.getUsersDao().findByUsername(username);
        // TODO: make sure we find a user with that username

//        if(user == null)
//        {
//            System.out.println("password");
//            response.sendRedirect("/login");
//            return;
//        }



        // TODO: check the submitted password against what you have in your database
//        boolean validAttempt = DaoFactory.getUsersDao().findByUsername(username).getPassword().equals(password);
//        boolean validAttempt = password.equals(user.getPassword());



//        if (validAttempt) {
//            // TODO: store the logged in user object in the session, instead of just the username
//            System.out.println("user");
//            request.getSession().setAttribute("user", user);
//            response.sendRedirect("/profile");
//        }
//        else
//        {
//            System.out.println("login");
//            response.sendRedirect("/login");
//        }
    }
}
