package paquete;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        //String nombre=request.getParameter("nombre");
        HttpSession sesion=request.getSession();
        String cadena = new String("hola sesion");
        sesion.setAttribute("clave", cadena);
        //.......
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("HELLO WORLD");
        out.println("</body>");
        out.println("</html>");
    }
}
