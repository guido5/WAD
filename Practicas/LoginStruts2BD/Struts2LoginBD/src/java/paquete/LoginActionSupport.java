package paquete;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Clase validadora de login con action support.
 * Agregar clase de conexion de db.
 * No debe llevar constructores
 * @author avata
 */
public class LoginActionSupport extends ActionSupport {
 
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String execute() throws Exception {
        LoginBean loginBean = new LoginBean(userName, password);
        try {
            if (loginBean.validateUser()) {
                //out.print("<h1>Bienvenido</h1>" + loginBean.getUser());
                return SUCCESS;
            } else {
                return ERROR;
                //out.print("<h1>Error no existe usuario</h1>");
            }
        } catch (Exception e) {
            //out.print("<h1>Error no se puede conectar a DB</h1>");
            e.printStackTrace();
            return ERROR;
        }
    }
    
}
