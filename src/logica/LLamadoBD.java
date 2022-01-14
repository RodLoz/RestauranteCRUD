package logica;
import DAO.LoginDAO;
import DAO.ReservaDAO;
import DAO.UsuarioDAO;
import UTIL.ConexionBD;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Date;

public class LLamadoBD {
    ArrayList<UsuarioDAO> listaUsuario = null;
    UsuarioDAO objUsuario = null;
    LoginDAO objLoginDAO = null;
    Connection cn = null;
    PreparedStatement pt = null;
    ResultSet rs = null;    
    ArrayList<ReservaDAO> listaReserva = null;
    ReservaDAO objReserva = null;

    
public ArrayList <UsuarioDAO> cargarListaUsuarios(){           
    try {
        ConexionBD objC = new ConexionBD();
        cn = objC.GetConecxionBD();
        pt = cn.prepareStatement("Select * from  registro;");
        rs = pt.executeQuery();
        listaUsuario = new ArrayList<UsuarioDAO>();
        while (rs.next()) {
           objUsuario = new UsuarioDAO();
           objUsuario.setNombre(rs.getString(1));
           objUsuario.setUser(rs.getString(2));
           objUsuario.setTelefono(rs.getInt(3));
           objUsuario.setCorreo(rs.getString(4));           
           listaUsuario.add(objUsuario);          
            
        }      
    } catch (Exception e) {
         System.out.println(e);
    }    
    return listaUsuario;
}    

public int guardarDatosUsuarios(UsuarioDAO objUsuario){
       int i = 0;
       try{
       ConexionBD objC = new ConexionBD();
        cn = objC.GetConecxionBD();
        pt = cn.prepareStatement("insert into registro values (?,?,?,?,?)");
        pt.setString(1, objUsuario.getNombre());
        pt.setString(2, objUsuario.getUser());
        pt.setInt(3, objUsuario.getTelefono());
        pt.setString(4, objUsuario.getCorreo());
        pt.setString(5, objUsuario.getPassword());
        i = pt.executeUpdate();
        pt.close();
        cn.close();
       }catch(Exception e){
           i = 0;
       }
    return i;
}
 
 public String buscarUsuario(String username, String password){
    String busquedaUser = null;
   
    try{
    ConexionBD objC = new ConexionBD();
    cn = objC.GetConecxionBD();
    pt = cn.prepareStatement("Select idUser,password FROM registro WHERE idUser = '" + username + "' && password = '" + password +"'");
    rs = pt.executeQuery();
    
    if(rs.next()){
       busquedaUser =  "Usuario encontrado";
    }else{
       busquedaUser = "Usuario no encontrado";
    }
    pt.close();
    cn.close();
    }catch (Exception e){
        System.out.println(e);
    }
    return busquedaUser;
} 
  
 public int EliminarRegistro(UsuarioDAO objUsuario){
     int i = 0;
       try{
       ConexionBD objC = new ConexionBD();
        cn = objC.GetConecxionBD();
        pt = cn.prepareStatement("Delete from registro where idNombre =?");
        pt.setString(1, objUsuario.getNombre());        
        i = pt.executeUpdate();
        pt.close();
        cn.close();
       }catch(Exception e){
           i = 0;
       }
    return i;
 }
 
 public int ModificarUsuarios(){
     int i = 0;
     try{
         ConexionBD objC = new ConexionBD();
         cn = objC.GetConecxionBD();
         pt = cn.prepareStatement("Update persona set idNombre =?, idUser =?, telefono=?, correo=?, password=? ");
         pt.setString(1, objUsuario.getNombre());
         pt.setString(2, objUsuario.getUser());
         pt.setInt(3, objUsuario.getTelefono());
         pt.setString(4, objUsuario.getCorreo());
         pt.setString(5, objUsuario.getPassword());
         i = pt.executeUpdate();
         pt.close();
         cn.close();
     }catch (Exception e){
             i = 0;
     }
     return i;
 }    
 
 public int insertarUser(LoginDAO objLoginDAO){
      int i = 0;
     try{
         ConexionBD objC = new ConexionBD();
         cn = objC.GetConecxionBD();
         pt = cn.prepareStatement("{call insertarUsuario(?,?,?)}");
         pt.setString(1, objLoginDAO.getIdUser()); 
         pt.setString(2, objLoginDAO.getIdNombre()); 
         pt.setString(3, objLoginDAO.getPassword());         
         i = pt.executeUpdate();
         pt.close();
         cn.close();
     }catch (Exception e){
             System.out.println(e);   
             i = 0;
     }
     return i;
 }
 
 //APARTADO DE LLAMADO A LA BASE DE DATOS DEL REGISTRO DE RESERVAS
 
 
 public ArrayList <ReservaDAO> cargarListaReservas(){           
    try {
        ConexionBD objC = new ConexionBD();
        cn = objC.GetConecxionBD();
        pt = cn.prepareStatement("Select * from  reserva;");
        rs = pt.executeQuery();
        listaReserva = new ArrayList<ReservaDAO>();
        while (rs.next()) {
           objReserva = new ReservaDAO();
           objReserva.setIdReserva(rs.getString(1));
           objReserva.setLocal(rs.getString(2));
           objReserva.setCantPersonas(rs.getInt(3));
           objReserva.setFecha(rs.getDate(4)); 
           objReserva.setObservacion(rs.getString(5));
           objReserva.setIdUsuario(rs.getString(6));         
           listaReserva.add(objReserva);          
            
        }      
    } catch (Exception e) {
         System.out.println(e);
    }    
    return listaReserva;
}    
 
 public int guardarDatosReservas(ReservaDAO objReservaDAO){       
       java.util.Date utilDate = new Date();
       utilDate = objReservaDAO.getFecha();
       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
      
       int i = 0;
       try{
       ConexionBD objC = new ConexionBD();
        cn = objC.GetConecxionBD();      
        pt = cn.prepareStatement("{call insertarReserva(?,?,?,?,?)}");
        //pt.setString(1, objReservaDAO.getIdReserva());
        pt.setString(1, objReservaDAO.getLocal());
        pt.setInt(2, objReservaDAO.getCantPersonas());
        pt.setDate(3, sqlDate);
        pt.setString(4, objReservaDAO.getObservacion());
        pt.setString(5, objReservaDAO.getIdUsuario());                
        i = pt.executeUpdate(); 
        pt.close();
        cn.close();
       }catch(Exception e){
           e.printStackTrace();
           i = 0;
       }
    return i;
}
 
 public String buscarReserva(String username, String password){
    String busquedaUser = null;
   
    try{
    ConexionBD objC = new ConexionBD();
    cn = objC.GetConecxionBD();
    pt = cn.prepareStatement("Select idUser,password FROM registro WHERE idUser = '" + username + "' && password = '" + password +"'");
    rs = pt.executeQuery();
    
    if(rs.next()){
       busquedaUser =  "Usuario encontrado";
    }else{
       busquedaUser = "Usuario no encontrado";
    }
    pt.close();
    cn.close();
    }catch (Exception e){
        System.out.println(e);
    }
    return busquedaUser;
} 
  
 public int EliminarReserva(String _idReserva){
     int i = 0;
       try{
       ConexionBD objC = new ConexionBD();
        cn = objC.GetConecxionBD();
        pt = cn.prepareStatement("{call eliminarReserva(?)}");
        pt.setString(1, objReserva.getIdReserva());        
        i = pt.executeUpdate();
        pt.close();
        cn.close();
       }catch(Exception e){
           i = 0;
       }
    return i;
 }
 
 public int ModificarReserva(){
     int i = 0;
     try{
         ConexionBD objC = new ConexionBD();
         cn = objC.GetConecxionBD();
         pt = cn.prepareStatement("Update persona set idNombre =?, idUser =?, telefono=?, correo=?, password=? ");
         pt.setString(1, objUsuario.getNombre());
         pt.setString(2, objUsuario.getUser());
         pt.setInt(3, objUsuario.getTelefono());
         pt.setString(4, objUsuario.getCorreo());
         pt.setString(5, objUsuario.getPassword());
         i = pt.executeUpdate();
         pt.close();
         cn.close();
     }catch (Exception e){
             i = 0;
     }
     return i;
 }  
 
 public int cantidadReservas(Date fecha, String local){
       java.util.Date utilDate = new Date();
       utilDate = fecha;
       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
       int cantReser = 0;
       try{
       ConexionBD objC = new ConexionBD();
        cn = objC.GetConecxionBD();
        pt = cn.prepareStatement("{call cantReservas(?,?)}");
        pt.setDate(1, sqlDate);
        pt.setString(2, local);
        rs = pt.executeQuery(); 
        if (rs.next()){        
        cantReser = rs.getInt(1);  
        }   
        pt.close();
        cn.close();
       }catch(Exception e){
           System.out.println(e);
       }       
    return cantReser;
      
 }
 
 public ArrayList <ReservaDAO> filtrarReservas(String filtroConsulta){           
    try {
        ConexionBD objC = new ConexionBD();
        cn = objC.GetConecxionBD();
        pt = cn.prepareStatement("{call mostrarReservas(?)}");       
        pt.setString(1, filtroConsulta);
        rs = pt.executeQuery();
        listaReserva = new ArrayList<ReservaDAO>();
        while (rs.next()) {
           objReserva = new ReservaDAO();
           objReserva.setIdReserva(rs.getString(1));
           objReserva.setLocal(rs.getString(2));
           objReserva.setCantPersonas(rs.getInt(3));
           objReserva.setFecha(rs.getDate(4)); 
           objReserva.setObservacion(rs.getString(5));
           objReserva.setIdUsuario(rs.getString(6));         
           listaReserva.add(objReserva);             
        }      
    } catch (Exception e) {
         System.out.println(e);
    }    
    return listaReserva;
} 
 
}