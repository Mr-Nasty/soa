package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Prac2Servelt", urlPatterns = {"/Prac2Servelt"})
public class Prac2Servelt extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String college = "JaiHind";

            com.college.Prac2WS_Service service = new com.college.Prac2WS_Service();
            com.college.Prac2WS port = service.getPrac2WSPort();

            String result = port.collegeName(college);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Prac2 Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>College Name: " + college + "</h2>");
            out.println("<h2>NAAC Grade: " + result + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet client for Practical 2";
    }
}
