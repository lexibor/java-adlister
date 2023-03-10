<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/9/23
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>

<%
    String userName = request.getParameter("userName");
    String password = request.getParameter("password");

    request.setAttribute("userName", userName);
    request.setAttribute("password", password);

//    if(!userName.equals("admin") || !password.equals("password"))
//    {
//        response.sendRedirect("/login.jsp");
//    }



%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>

    <%@ include file="partials/navbar.jsp" %>

    <h1>Welcome, ${userName}</h1>


    <h3>Username: ${userName}</h3>
    <h3>Password: ${password}</h3>


</body>
</html>
