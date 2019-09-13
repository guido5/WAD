package paquete;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html";
    //Initialize global variables
    public void init() throws ServletException {
    }
    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        Set conjunto=getServletContext().getResourcePaths("/");
        String[] arreglo=null;
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet1</title></head>");
        out.println("<body bgcolor=\"#ffffff\">");
        out.println("<p>API Servlets.</p>");
        out.println("ServletContext getResourcePaths:"+conjunto.toString());
        out.println("</body></html>");

    }
    //Clean up resources
    public void destroy() {
    }
}