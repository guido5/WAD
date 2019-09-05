package Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookiesSaveServlet")
public class CookiesSaveServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        for (int i=0; i<5; i++) {
            try {
                String checked = request.getParameter("articulo"+i);
                Cookie galleta = new Cookie("articulo"+i, checked);
                response.addCookie(galleta);
                out.println("<h1>Cookie Guardada</h1>");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
