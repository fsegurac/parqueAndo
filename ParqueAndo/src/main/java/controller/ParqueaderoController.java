package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import Beans.Parqueadero;
import connection.DBConnection;

public class ParqueaderoController implements IParqueaderoController{
    
    @Override
    public String login(String email_Parq, String contrasena_Parq) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM parqueadero WHERE email_parq = '" + email_Parq + "' and contrasena_parq = '" + contrasena_Parq + "'";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id_NIT = rs.getInt("id_NIT");
                String razon_Social = rs.getString("razon_social");
                String direccion_Parq = rs.getString("direccion_parq");
                double cel_Parq = rs.getDouble("cel_Parq");
                double dinero_Ganado = rs.getDouble("dinero_ganado");
                boolean estado_Parq = rs.getBoolean("estado_parq");
                Parqueadero parqueadero = new Parqueadero(id_NIT, razon_Social, direccion_Parq, cel_Parq, email_Parq, dinero_Ganado, contrasena_Parq, estado_Parq);
                        
                return gson.toJson(parqueadero);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
        return "false";
    }

    @Override
    public String register(int id_NIT, String razon_Social, String direccion_Parq, 
            double cel_Parq,String email_Parq, double dinero_Ganado,
            String contrasena_Parq, boolean estado_Parq) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "Insert into parqueadero values('" +id_NIT+ "', '" +razon_Social + "', '" + direccion_Parq + "', '" + cel_Parq + "','" + email_Parq + "','" + 0.0 + "', '" + contrasena_Parq + "', '" + "1" + "')";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            
            Parqueadero parqueadero = new Parqueadero(id_NIT, razon_Social, 
                    direccion_Parq, cel_Parq, email_Parq, dinero_Ganado, 
                    contrasena_Parq, estado_Parq);

            st.close();

            return gson.toJson(parqueadero);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
        return "false";

    }

    
}
