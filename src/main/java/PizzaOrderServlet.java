import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
            String crust = request.getParameter("crust");
            String sauce = request.getParameter("sauce");
            String size = request.getParameter("size");
            String address = request.getParameter("address");
            String topping = request.getParameter("topping");

            System.out.println(crust);
            System.out.println(sauce);
            System.out.println(size);
            System.out.println(topping);
            System.out.println(address);



            request.getRequestDispatcher("/WEB-INF/pizza-order.jsp").forward(request, response);
    }

}
