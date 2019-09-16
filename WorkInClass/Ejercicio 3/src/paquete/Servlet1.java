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
public class Servlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String data = request.getParameter("parameter");
            HttpSession session = request.getSession();
            session.setAttribute("clave", data); //podemos mandar un request o un response
            //Atributo es clave - objeto
            //Además que permite guardar en la aplicación un valor.
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hellow World! REMEMBER</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
