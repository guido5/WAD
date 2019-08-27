package Application;

import OperacionesMatematicas.ReglaDeCramer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCramer")
public class ServletCramer extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int values[][] = new int[3][4];

        for(int i = 0; i < 3; i++) {
            values[i][0]= Integer.parseInt(request.getParameter("valueX"+(i+1)));
            values[i][1]= Integer.parseInt(request.getParameter("valueY"+(i+1)));
            values[i][2]= Integer.parseInt(request.getParameter("valueZ"+(i+1)));
            values[i][3]= Integer.parseInt(request.getParameter("equalValue"+(i+1)));
        }

        ReglaDeCramer cramer = new ReglaDeCramer(values);

        if (cramer != null) {
            int solution[] = cramer.resolve();
            out.println("<h1>x = " + solution[0] + "</h1>");
            out.println("<h1>y = " + solution[1] + "</h1>");
            out.println("<h1>z = " + solution[2] + "</h1>");
        } else {
            out.println("<h1>El sistema no tiene solucion<h1>");
        }

    }
}
