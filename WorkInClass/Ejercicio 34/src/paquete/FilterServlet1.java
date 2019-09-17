package  paquete;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

public class FilterServlet1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String parametroprueba = filterConfig.getInitParameter("parametroprueba");      //Los parametros que salen de aqui son globales y estan declarados en el web.xml
        System.out.println("Parametro de prueba: " + parametroprueba);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

            HttpServletRequest request = (HttpServletRequest) servletRequest;
            String ip = request.getRemoteAddr();                                    //Obtiene lo que es la direccionIP del que se esta conectando.
            System.out.println("IP:"+ip + ", TIEMPO:"+ new Date().toString());
              filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {}
}
