package LoginConfig;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "CheckIn")
public class CheckIn extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String user = (String) request.getParameter("user");
        String password = (String) request.getParameter("pass");
        LoginBean loginBean = new LoginBean(user, password);
        try {
            if (loginBean.validateUser()) {
                out.print("<h1>Bienvenido</h1>" + loginBean.getUser());
            } else {
                out.print("<h1>Error no existe usuario</h1>");
            }
        } catch (SQLException e) {
            out.print("<h1>Error no se puede conectar a DB</h1>");
            e.printStackTrace();
        }
    }
}
