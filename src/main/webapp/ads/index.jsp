<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/14/23
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dao.Ads</title>
</head>
<body>

<c:forEach var="ad" items="${ads}">
    <div>
        <h2>${ad.title}</h2>
        <p>${ad.description}</p>
    </div>
</c:forEach>


</body>
</html>
