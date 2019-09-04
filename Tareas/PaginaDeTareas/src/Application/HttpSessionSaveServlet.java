package Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HttpSessionSaveServlet")
public class HttpSessionSaveServlet extends HttpServlet {
    private PrintWriter out;
    private HttpSession session;
    private HttpServletRequest request;

    //Post funciona solo con formularios
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}

    //Get funciona con formulario o hipervinculos
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session = request.getSession(false);
        out = response.getWriter();
        this.request = request;
        updateProducts();
    }

   private void updateProducts() {
        for (int i=0; i<5; i++) {
            try {
                String checked = request.getParameter("articulo"+i);
                session.setAttribute("articulo"+i, checked);
                out.println("<h1>Elemento Guardado</h1>");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
