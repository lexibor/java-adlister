package controllers;

import dao.DaoFactory;
import dao.Products;
import models.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/products")
public class ProductsServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Products productsDao = DaoFactory.getProductsDao();
        List<Product> products = productsDao.all();

        request.setAttribute("products", products);
        request.getRequestDispatcher("/products.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));

        Product product = new Product(name, price);
//        List<Product> products = Product.getProducts();
//        products.add(product);

        Products productsDao = DaoFactory.getProductsDao();
        productsDao.insert(product);

        List<Product> products = productsDao.all();

        request.setAttribute("products", products);

        request.getRequestDispatcher("/products.jsp").forward(request, response);
    }
}
