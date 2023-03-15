<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
        <div>
            <h2>Welcome, ${username}</h2>
        </div>

        <div>
            <form action="" method="post">
                <input type="submit" name="logoutBtn" value="logout">
            </form>
        </div>
    </div>


</body>
</html>
