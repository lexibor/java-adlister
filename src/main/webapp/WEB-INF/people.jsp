<%@ page import="model.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/10/23
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>People</title>
</head>
<body>

    <%@ include file="../partials/navbar.jsp" %>
    <h1>People</h1>
    <c:choose>

        <c:when test="${people.isEmpty()}">
            <h3>No People</h3>
        </c:when>

        <c:otherwise>

            <c:forEach var="person" items="${people}">
                <h3>
                        ${person.name}
                    <c:if test="${person.age < 21}">
                        (minor)
                    </c:if>
                </h3>

            </c:forEach>

        </c:otherwise>
    </c:choose>

    <%@ include file="../partials/footer.jsp" %>

</body>
</html>
