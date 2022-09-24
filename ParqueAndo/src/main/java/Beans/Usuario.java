package Beans;

/**
 *
 * @author Fabio
 */
public class Usuario {
    
    private int id;
    private String nombre;
    private String apellido;
    private double cel_usr;
    private String email_usr;
    private String placa;
    private String marca;
    private String color;
    private double dinero_disp;
    private String contrasena_usr;
    private boolean estado_usr;

    public Usuario(int id, String nombre, String apellido, double cel_usr, String email_usr, String placa, String marca, String color, double dinero_disp, String contrasena_usr, boolean estado_usr) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cel_usr = cel_usr;
        this.email_usr = email_usr;
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.dinero_disp = dinero_disp;
        this.contrasena_usr = contrasena_usr;
        this.estado_usr = estado_usr;
    }
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCel_usr() {
        return cel_usr;
    }

    public void setCel_usr(double cel_usr) {
        this.cel_usr = cel_usr;
    }

    public String getEmail_usr() {
        return email_usr;
    }

    public void setEmail_usr(String email_usr) {
        this.email_usr = email_usr;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDinero_disp() {
        return dinero_disp;
    }

    public void setDinero_disp(double dinero_disp) {
        this.dinero_disp = dinero_disp;
    }

    public String getContrasena_usr() {
        return contrasena_usr;
    }

    public void setContrasena_usr(String contrasena_usr) {
        this.contrasena_usr = contrasena_usr;
    }

    public boolean isEstado_usr() {
        return estado_usr;
    }

    public void setEstado_usr(boolean estado_usr) {
        this.estado_usr = estado_usr;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + 
                apellido + ", cel_usr=" + cel_usr + ", email_usr=" + email_usr + 
                ", placa=" + placa + ", marca=" + marca + ", color=" + color + 
                ", dinero_disp=" + dinero_disp + ", contrasena_usr=" + 
                contrasena_usr + ", estado_usr=" + estado_usr + '}';
    }    
    
}
