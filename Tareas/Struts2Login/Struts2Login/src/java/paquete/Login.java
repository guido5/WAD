package paquete;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author avata
 */
public class Login extends ActionSupport {
    
    private String userName;
    private String password;
    
    public String execute() throws Exception {
        
        LoginBean login = new LoginBean();
        if (login.validateUser(userName, password)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
        
    }

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
    
    
    
}
