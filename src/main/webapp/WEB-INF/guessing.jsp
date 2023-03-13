<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/13/23
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>

    <h1>${invalid}</h1>
    <h1>Guess a number between 1 and 3:</h1>

    <br>

    <form method="post" action="guess">
        <input type="text" name="guessing" id="guessing">
        <button>Submit</button>

    </form>



</body>
</html>
