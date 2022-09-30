package Beans;

/**
 *
 * @author Fabio
 */
public class Parqueadero {
    
    private int id_NIT;
    private String razon_social;
    private String direccion_parq;
    private double cel_parq;
    private String email_parq;
    private double dinero_ganado;
    private String constrasena_parq;
    private boolean estado_parq;

    public Parqueadero(int id_NIT, String razon_social, String direccion_parq, double cel_parq, String email_parq, double dinero_ganado, String constrasena_parq, boolean estado_parq) {
        this.id_NIT = id_NIT;
        this.razon_social = razon_social;
        this.direccion_parq = direccion_parq;
        this.cel_parq = cel_parq;
        this.email_parq = email_parq;
        this.dinero_ganado = dinero_ganado;
        this.constrasena_parq = constrasena_parq;
        this.estado_parq = estado_parq;
    }

    public int getId_NIT() {
        return id_NIT;
    }

    public void setId_NIT(int id_NIT) {
        this.id_NIT = id_NIT;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getDireccion_parq() {
        return direccion_parq;
    }

    public void setDireccion_parq(String direccion_parq) {
        this.direccion_parq = direccion_parq;
    }

    public double getCel_parq() {
        return cel_parq;
    }

    public void setCel_parq(double cel_parq) {
        this.cel_parq = cel_parq;
    }

    public String getEmail_parq() {
        return email_parq;
    }

    public void setEmail_parq(String email_parq) {
        this.email_parq = email_parq;
    }

    public double getDinero_ganado() {
        return dinero_ganado;
    }

    public void setDinero_ganado(double dinero_ganado) {
        this.dinero_ganado = dinero_ganado;
    }

    public String getConstrasena_parq() {
        return constrasena_parq;
    }

    public void setConstrasena_parq(String constrasena_parq) {
        this.constrasena_parq = constrasena_parq;
    }

    public boolean isEstado_parq() {
        return estado_parq;
    }

    public void setEstado_parq(boolean estado_parq) {
        this.estado_parq = estado_parq;
    }

    @Override
    public String toString() {
        return "Parqueadero{" + "id_NIT=" + id_NIT + ", razon_social=" + razon_social 
                + ", direccion_parq=" + direccion_parq + ", cel_parq=" + cel_parq + 
                ", email_parq=" + email_parq + ", dinero_ganado=" + dinero_ganado + 
                ", constrasena_parq=" + constrasena_parq + ", estado_parq=" + estado_parq + '}';
    }
    
}