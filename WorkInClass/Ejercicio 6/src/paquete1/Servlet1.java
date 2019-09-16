package paquete1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            String ruta = request.getRealPath("/hola"); //Está depreciado (no es lo más correcto)
            ServletContext application = this.getServletContext();
            String ruta2 = application.getRealPath("/");
            out.println("<h1>RUTA: "+ruta+"</h1>");
            out.println("<h1>RUTA: "+ruta2+"</h1>");
        }
    }
}
