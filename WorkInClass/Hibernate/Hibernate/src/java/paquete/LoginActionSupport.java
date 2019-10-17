package paquete;

import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Clase validadora de login con action support.
 * Agregar clase de conexion de db.
 * No debe llevar constructores
 * @author avata
 */
public class LoginActionSupport extends ActionSupport {
 
    String userName, password;
    Session hibernateSession;
    Users login;
    
    public String execute() throws Exception {
        hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
        Transaction t1=hibernateSession.beginTransaction();
        
        //Regresa un object y luego le hacemos un downcasting a clase Users (clase tabla de bd).
        //Como es un solo objeto se utiliza uniqueResult(). No se revisa como tratar mas de un registro.
        //El nombre de la tabla en lenguaje HQL debe ir con mayuscula o si no no jala.
        login=(Users)hibernateSession.createQuery("from Users WHERE id='"+userName+"' AND password='"+password+"'").uniqueResult();
        t1.commit();

        if(userName!=null && password!=null &&(!userName.equals(""))&&(!password.equals("")))
        {
         if(login!=null)
         return SUCCESS; 
        }

        //addActionError("User Name or password does not exist");
        return ERROR;

    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
