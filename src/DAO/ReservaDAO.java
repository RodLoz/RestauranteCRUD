
package DAO;
import java.util.Date;


public class ReservaDAO {
   
    private String idReserva, idUsuario, local, observacion;
    private Date fecha;
    private int cantPersonas, totalReservas; 

    public String getIdReserva() {
       System.out.println(idReserva);
        return idReserva;
    }

    public void setIdReserva(String idReserva) {       
        this.idReserva = idReserva;
        System.out.println(idReserva);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getTotalReservas() {
         //System.out.println(totalReservas);
        return totalReservas;
    }

    public void setTotalReservas(int totalPersonas) {        
        this.totalReservas = totalPersonas;
    }
    
    
}
