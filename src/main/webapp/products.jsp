<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/14/23
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>

  <form action="products" method="post">
    <label for="name">Name:</label>
    <input type="text" name="name" id="name">
    <br>
    <label for="price">Price:</label>
    <input type="text" name="price" id="price">
    <input type="submit">
  </form>

  <h2>All products:</h2>

  <c:forEach var="product" items="${products}">
    <div class="product">
      <h3>${product.name}</h3>
      <p>Price: $${product.price}</p>
    </div>
  </c:forEach>

</body>
</html>
