package  paquete;
public class BienvenidoAction {
    private String username;

    //Va a seer llamado por la propiedad property en el archivo de salida
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
