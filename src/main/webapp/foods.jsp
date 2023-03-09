<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/9/23
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>

<%
    String foodType = request.getParameter("food");

    if(foodType.equals("rhubarb"))
    {
        response.sendRedirect("/ew.jsp");
    }

    request.setAttribute("foodType", foodType);

    Map<String, String> foods = new HashMap<>();
    List<String> meats = new ArrayList<>(Arrays.asList(
            "Burgers",
            "Steak",
            "Hot Dogs"

    ));

    List<String> dairy = new ArrayList<>(Arrays.asList(
            "Cheese",
            "Milk"
            ));
    foods.put("meat", meats.toString());
    foods.put("dairy", dairy.toString());

    request.setAttribute("foods", foods.get(foodType));

%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Food Type: ${foodType}</h1>

    <h3>${foods}</h3>

</body>
</html>
