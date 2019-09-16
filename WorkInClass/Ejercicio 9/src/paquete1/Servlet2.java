package paquete1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Cookie[] galletas = request.getCookies();
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet servlet2</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Galletas:"+galletas);
        for(int i=0;i<galletas.length;i++)
        {
            out.println("El nombre de la galleta es:"+galletas[i].getName()+"<br>");
            out.println("El valor de la galleta es:"+galletas[i].getValue()+"<br>");

        }
        out.println("</body>");
        out.println("</html>");
    }
}
