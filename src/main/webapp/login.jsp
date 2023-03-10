<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/9/23
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>

<%
     String username =  request.getParameter("userName");
     String password = request.getParameter("password");


    if(username != null && password != null)
    {
        if(username.equals("admin") && password.equals("password"))
        {
            response.sendRedirect(String.format("/profile.jsp?userName=%s&&password=%s", username, password));
        }
    }


    request.setAttribute("username", username);
    request.setAttribute("password", password);


%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <h1>Login Form</h1>
    <form>
        <input type="text" name="userName">
        <input type="text" name="password">
        <button>Submit</button>
    </form>


<p>${username}</p>
<p>${password}</p>


</body>
</html>
