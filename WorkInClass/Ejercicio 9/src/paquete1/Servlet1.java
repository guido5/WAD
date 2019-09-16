package paquete1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String[] arreglo=null;
        Cookie galleta2 = new Cookie("id2","12");
        Cookie galleta3 = new Cookie("id3","13");
        galleta2.setMaxAge(365*24*60*1000);
        response.addCookie(galleta2);
        response.addCookie(galleta3);
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet servlet2</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Como estas</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
