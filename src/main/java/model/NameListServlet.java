package model;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/people")
public class NameListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Person p1 = new Person("Fred", 24);
        Person p2 = new Person("Sally", 34);
        Person p3 = new Person("Andy", 14);

        List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3));

        request.setAttribute("people", people);
        // send a response based on the people.jsp

        request.getRequestDispatcher("/WEB-INF/people.jsp").forward(request, response);
    }

}
