package teacher;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDB extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    response.setContentType("text/html;charset=UTF-8");
    ResultSet rs=null;
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection db = DriverManager.getConnection("jdbc:mysql://localhost/DB2?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
    Statement s = db.createStatement();
    rs=s.executeQuery("SELECT * FROM Users");
     PrintWriter out=response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            while(rs.next())
            {
            out.println(rs.getString("id1"));
            }            
            out.println("</body>");
            out.println("</html>");
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }            

    }

}
