package DAO;

public class UsuarioDAO {
    private String nombre, correo, user, password;
    private int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {       
        return user;        
    }

    public void setUser(String user) {      
        this.user = user;        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
   
    public String getRegistro (){
        String mensaje;
        mensaje = "Registro existoso";
        return mensaje;
    }
}
