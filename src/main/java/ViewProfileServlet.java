import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("user") != null)
        {
            String username = (String) session.getAttribute("user");
            request.setAttribute("username", username);
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        }
        else
        {
            response.sendRedirect("/login");
        }




//        System.out.println(request.getParameter("logoutBtn"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

            request.getSession().invalidate();
            response.sendRedirect("/login");


    }
}
