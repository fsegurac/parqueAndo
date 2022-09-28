
package controller;


public interface IUsuarioController {
    public String login(String email_usr, String contrasena_usr);
    public String register(int id, String nombre, String apellido, double cel_usr, String email_usr, String placa, String marca, String color, double dinero_disp, String contrasena_usr, boolean estado_usr);    
}
