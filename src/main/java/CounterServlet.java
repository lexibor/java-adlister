import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet( value = "/count")
public class CounterServlet extends HttpServlet
{

    public static int count = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.getWriter().println(count);
        count++;
    }

}
