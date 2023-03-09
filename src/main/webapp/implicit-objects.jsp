<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/9/23
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

  <%-- THIS CODE NORMALLY GOES IN A SERVLET  --%>
<%
    String myName = "Gandalf";
    request.setAttribute("myName", myName);
    String method = request.getMethod();
    if(method.equals("GET"))
    {
      request.setAttribute("message", "The method is GET");

    }
    else if(method.equals("POST"))
    {
      request.setAttribute("message", "The method is POST");
    }

    String input = request.getParameter("someInput");
    request.setAttribute("someInput", input);

%>

<!doctype html>
<html>
<head>
  <title>Implicit Object Example</title>
</head>
<body>
  <h1>Welcome To The Site!</h1>
  <h1><%=request.getAttribute("myName")%></h1>
  <h1>The HTTP method for this page is: <%=request.getAttribute("message")%></h1>
  <p>Path: <%= request.getRequestURL() %></p>
  <p>Query String: <%= request.getQueryString() %></p>
  <p>"name" parameter: <%= request.getParameter("name") %></p>
  <p>"method" attribute: <%= request.getMethod() %></p>
  <p>User-Agent header: <%= request.getHeader("user-agent") %></p>

    <form method="post" action="/implicit-objects.jsp">
        <input type="text" name="someInput">
        <button>Submit</button>
    </form>

<%--    <h1>Some Input: <%=request.getAttribute("someInput")%></h1>--%>
    <h1>Some Input: ${someInput}</h1>

</body>
</html>
