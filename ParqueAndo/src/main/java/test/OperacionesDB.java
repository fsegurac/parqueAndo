package test;

import Beans.*;
import connection.DBConnection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Fabio
 */
public class OperacionesDB {

    public static void main(String[] args) {
        listarTabla("usuario");
    }

    public static void listarTabla(String nombre_tabla) {

        DBConnection conn = new DBConnection();
        String sentenceSQL = "SELECT * FROM " + nombre_tabla;

        try {
            Statement st = conn.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sentenceSQL);

            switch (nombre_tabla) {
                case "usuario":
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String nombre = rs.getString("nombre");
                        String apellido = rs.getString("apellido");
                        double cel_usr = rs.getDouble("cel_usr");
                        String email_usr = rs.getString("email_usr");
                        String placa = rs.getString("placa");
                        String marca = rs.getString("marca");
                        String color = rs.getString("color");
                        double dinero_disp = rs.getDouble("dinero_disp");
                        String contrasena_usr = rs.getString("contrasena_usr");
                        boolean estado_usr = rs.getBoolean("estado_usr");

                        Usuario usuarios = new Usuario(id, nombre, apellido, cel_usr, email_usr, placa, marca, color, dinero_disp, contrasena_usr, estado_usr);
                        System.out.println(usuarios.toString());
                    }
                    break;

                case "parqueadero":
                    while (rs.next()) {
                        int id_NIT = rs.getInt("id_NIT");
                        String razon_social = rs.getString("razon_social");
                        String direccion_parq = rs.getString("direccion_parq");
                        double cel_parq = rs.getDouble("cel_parq");
                        String email_parq = rs.getString("email_parq");
                        double dinero_ganado = rs.getDouble("dinero_ganado");
                        String contrasena_parq = rs.getString("contrasena_parq");
                        boolean estado_parq = rs.getBoolean("estado_parq");
                        
                        Parqueadero parqueaderos = new Parqueadero(id_NIT, razon_social, direccion_parq, cel_parq, email_parq, id_NIT, contrasena_parq, estado_parq);
                        System.out.println(parqueaderos.toString());                        
                    }
                    break;

                case "reserva":
                    while (rs.next()) {                        
                        String email_usr = rs.getString("email_usr");
                        String email_parq = rs.getString("email_parq");
                        Date fechaHora_entrada = rs.getDate("fechaHora_entrada");
                        Date fechaHora_salida = rs.getDate("fechaHora_salida");
                        double tarifa = rs.getDouble("tarifa");
                        int estado_reserva = rs.getInt("estado_reserva");
                        
                        Reserva reservas = new Reserva(email_usr, email_parq, fechaHora_entrada, fechaHora_salida, tarifa, estado_reserva);
                        System.out.println(reservas.toString());
                    }   
                    
                    break;
                default:
                    System.out.println("Nombre de tabla incorrecto.");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            
        } finally {
            conn.desconectar();
            
        }
    }
}
