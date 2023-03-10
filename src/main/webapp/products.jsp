<%@ page import="model.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/10/23
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>


<%
    Product p1 = new Product("Apple", 100);
    Product p2 = new Product("Pencil", 99);
    Product p3 = new Product("Oreos", 299);

    List<Product> products = new ArrayList<>(Arrays.asList(p1, p2, p3));

    request.setAttribute("products", products);


%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Products</h1>

<c:forEach var="product" items="${products}">
    <div>
        <h3>${product.name}</h3>
        <h3>$${product.costInCents}</h3>
        <hr>
    </div>
</c:forEach>



</body>
</html>
