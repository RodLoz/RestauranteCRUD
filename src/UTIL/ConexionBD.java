package UTIL;
import java.sql.*;


public class ConexionBD {
    
    public static void main(String[] args){
            ConexionBD ObjConexion = new ConexionBD();
                        ObjConexion.GetConecxionBD();
    }
    
    public Connection GetConecxionBD(){
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/restaurantedb", "root", "Rodrigo72640832");
            System.out.println("Se conecto!");
        } catch (Exception e) {
            System.out.println("No se conecto!");
        }
        return cn;
    }
}
