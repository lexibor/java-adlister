<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/17/23
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>XSS!</title>
</head>
<body>

<%--<h1>Hello ${name}!</h1>--%>
<h1>Hello <c:out value="${name}" /></h1>

<form>
    <input type="text" name="name">
    <button>Submit</button>
</form>

</body>
</html>