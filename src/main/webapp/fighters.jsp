<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/13/23
  Time: 12:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Fighters</title>
</head>
<body>

<c:forEach items="${fighters}" var="fighter">
    <p>${fighter.name} has ${fighter.hitPoints}HP.</p>
</c:forEach>


</body>
</html>
