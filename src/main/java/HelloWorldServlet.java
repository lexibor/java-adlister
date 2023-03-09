import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String name = request.getParameter("name");

        PrintWriter out = response.getWriter();

        if(name != null && !name.isEmpty())
        {
            out.printf("<h1>Hello, %s</h1>", name);
        }
        else
        {
            out.println("<h1>Hello, World!</h1>");
        }

    }
}
