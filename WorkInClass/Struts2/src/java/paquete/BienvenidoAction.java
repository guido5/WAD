
package paquete;

/**
 * Clase que se necesita para crear una accion en java. 
 * Usualmente se utiliza mas action support
 * La etiqueta property busca de la pila de acciones e invoca el getter
 * de lo que pongamos ahi.
 * @author avata
 */
public class BienvenidoAction {
    
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String execute() {
        return "exitoso";
    }
    
}
