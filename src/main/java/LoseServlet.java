import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/incorrect")
public class LoseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        request.setAttribute("outcome", "Incorrect Number :(");

        request.getRequestDispatcher("/WEB-INF/outcome.jsp").forward(request, response);

    }


}
