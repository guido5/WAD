package Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResponseSaveServlet")
public class ResponseSaveServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        for (int i=0; i<5;i++) {
            String articulo = (String) request.getParameter("articulo"+i);
            if (articulo != null) {
                out.println("Articulo seleccionado: Articulo" + (i+1));
            }
        }
    }
}
