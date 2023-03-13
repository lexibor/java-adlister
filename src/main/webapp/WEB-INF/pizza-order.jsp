<%--
  Created by IntelliJ IDEA.
  User: lexibor
  Date: 3/10/23
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>

    <h1>Pizza Order Form</h1>

    <form method="post" action="pizza-order">
        <div>
            <label for="crust">Crust:</label>
            <select name="crust" id="crust">
                <option value="normal">Normal</option>
                <option value="Stuffed">Stuffed</option>
                <option value="garlic">Garlic</option>
            </select>
        </div>

        <br>

        <div>
            <label for="sauce">Sauce:</label>
            <select name="sauce" id="sauce">
                <option value="tomato">Tomato</option>
                <option value="marinara">Marinara</option>
                <option value="pesto">Pesto</option>
            </select>
        </div>

        <br>

        <div>
            <label for="size">Size:</label>
            <select name="size" id="size">
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
            </select>
        </div>

        <br>

        <div>
            <p>Toppings:</p>
            <input type="checkbox" id="pepperoni" name="topping" value="pepperoni">
            <label for="pepperoni">Pepperoni</label><br>
            <input type="checkbox" id="bacon" name="topping" value="bacon">
            <label for="bacon">Bacon</label><br>
            <input type="checkbox" id="mushroom" name="topping" value="mushroom">
            <label for="mushroom">Mushrooms</label>
        </div>

        <br>

        <label for="address">Address:</label>
        <input type="text" name="address" id="address">
        <button>Submit</button>
    </form>


</body>
</html>
