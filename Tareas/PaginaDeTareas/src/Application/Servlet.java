package Application;

import OperacionesMatematicas.EcuacionesDeSegundoGrado;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    private EcuacionesDeSegundoGrado ecuacion;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double valueX = Double.parseDouble(request.getParameter("valueX"));
        double valueY = Double.parseDouble(request.getParameter("valueY"));
        double valueZ = Double.parseDouble(request.getParameter("valueZ"));
        ecuacion = new EcuacionesDeSegundoGrado(valueX, valueY, valueZ);
        double results[] = ecuacion.resolve();
        PrintWriter out = response.getWriter();
        if (results != null) {
            out.write("<h1>X1: "+ results[0] +"</h1>");
            out.write("<h1>X2: "+ results[1] +"</h1>");
        } else {
            out.write("<h1> Tu ecuacion no tiene solucion");
        }

    }
}
