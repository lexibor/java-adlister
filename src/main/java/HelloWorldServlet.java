import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// User goes to http://localhost:8080/hello and sees "Hello World"

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out = response.getWriter();
        out.println("<h1 style='color:red'>Hello :)</h1><br><h3>hihihihihihhiihihihihihihi</h3><a href='/login'>Login Page</a><script>alert('ALERT')</script>");
    }
}
