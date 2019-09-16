package paquete;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet0")
public class Servlet0 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String encodeURL1 =response.encodeURL("/Ejercicio11_war_exploded/Servlet1");
        String encodeURL2 =response.encodeURL("/Ejercicio11_war_exploded/Servlet2");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet0</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<a href=\""+encodeURL1+"\">Servlet1</a>");
        out.println("<a href=\""+encodeURL2+"\">Servlet1</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
