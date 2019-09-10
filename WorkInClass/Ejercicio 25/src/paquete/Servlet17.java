package paquete;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet(name = "Servlet17")
public class Servlet17 extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html";
    //Initialize global variables
    public void init() throws ServletException {
    }
    //Process the HTTP Get request
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet1</title></head>");
        out.println("<body bgcolor=\"#ffffff\">");
        out.println("<p>API Servlets.</p>");
        int longitud=request.getContentLength();
        out.println("Longitud del cuerpo de la peticion:"+longitud);

        out.println("</body></html>");
    }
    //Clean up resources
    public void destroy() {
    }
}
