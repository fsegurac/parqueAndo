package controller;

public interface IParqueaderoController {
    
    public String login(String email_Parq, String contrasena_Parq);
    public String register(int id_NIT, String razon_Social, String direccion_Parq, 
            double cel_Parq, String email_Parq, double dinero_disp, String contrasena_Parq, 
            boolean estado_Parq);
}
