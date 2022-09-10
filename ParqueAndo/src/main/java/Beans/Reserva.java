package Beans;

import java.sql.Date;

/**
 *
 * @author Fabio
 */
public class Reserva {

    private String email_usr;
    private String email_parq;
    private Date fechaHora_entrada;
    private Date fechaHora_salida;
    private double tarifa;
    private int estado_reserva;

    public Reserva(String email_usr, String email_parq, Date fechaHora_entrada, Date fechaHora_salida, double tarifa, int estado_reserva) {
        this.email_usr = email_usr;
        this.email_parq = email_parq;
        this.fechaHora_entrada = fechaHora_entrada;
        this.fechaHora_salida = fechaHora_salida;
        this.tarifa = tarifa;
        this.estado_reserva = estado_reserva;
    }

    public String getEmail_usr() {
        return email_usr;
    }

    public void setEmail_usr(String email_usr) {
        this.email_usr = email_usr;
    }

    public String getEmail_parq() {
        return email_parq;
    }

    public void setEmail_parq(String email_parq) {
        this.email_parq = email_parq;
    }

    public Date getFechaHora_entrada() {
        return fechaHora_entrada;
    }

    public void setFechaHora_entrada(Date fechaHora_entrada) {
        this.fechaHora_entrada = fechaHora_entrada;
    }

    public Date getFechaHora_salida() {
        return fechaHora_salida;
    }

    public void setFechaHora_salida(Date fechaHora_salida) {
        this.fechaHora_salida = fechaHora_salida;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getEstado_reserva() {
        return estado_reserva;
    }

    public void setEstado_reserva(int estado_reserva) {
        this.estado_reserva = estado_reserva;
    }

    @Override
    public String toString() {
        return "Reserva{" + "email_usr=" + email_usr + ", email_parq=" + 
                email_parq + ", fechaHora_entrada=" + fechaHora_entrada + 
                ", fechaHora_salida=" + fechaHora_salida + ", tarifa=" + 
                tarifa + ", estado_reserva=" + estado_reserva + '}';
    }   

}
