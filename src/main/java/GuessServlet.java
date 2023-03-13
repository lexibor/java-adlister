import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        request.getRequestDispatcher("/WEB-INF/guessing.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(3 - 1 + 1) + 1;

//        int randomNum = 2;

        String guessNum = request.getParameter("guessing");

        System.out.println(guessNum);

        if(Integer.parseInt(guessNum) <= 3 && Integer.parseInt(guessNum) >=1)
        {
            if(Integer.parseInt(guessNum) == randomNum)
            {
                response.sendRedirect("/correct");
            }
            else
            {
                response.sendRedirect("/incorrect");
            }
        }
        else
        {
            request.setAttribute("invalid", "Invalid Number...");
            response.sendRedirect("/guess");
        }
    }
}
