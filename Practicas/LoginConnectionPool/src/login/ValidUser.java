package login;

import dhcp.DataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "ValidUser")
public class ValidUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = (String) request.getParameter("user");
        String pass = (String) request.getParameter("pass");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DataSource.getInstance().getConnection();
            statement = connection.createStatement();
            String sqlSentence = "SELECT password FROM users WHERE id='" + user + "'";
            resultSet = statement.executeQuery(sqlSentence);
            resultSet.first();
            if (pass.equals(resultSet.getString("password"))){
                response.sendRedirect("exito.jsp");
            } else {
                //Usuario existente con contraseña equivocada
                response.sendRedirect("index.jsp");
            }

        }  catch (SQLException e) {
            //Usuario inexistente
            e.printStackTrace();
            response.sendRedirect("index.jsp");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
