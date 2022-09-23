
package controller;
import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import Beans.Usuario;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController {
    
    @Override
    public String login(String email_usr, String contrasena_usr){
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM usuario WHERE email_usr = '" + email_usr + "' and contrasena_usr = '" + contrasena_usr + "'";
        
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                double cel_usr = rs.getDouble("cel_usr");
                String placa = rs.getString("placa");
                String marca = rs.getString("marca");
                String color = rs.getString("color");
                double dinero_disp = rs.getDouble("dinero_disp");
                boolean estado_usr = rs.getBoolean("estado_usr");
                
                boolean premium = rs.getBoolean("premium");
                Usuario usuario;
                usuario = new Usuario(email_usr, contrasena_usr, nombre, apellido, cel_usr, placa, marca, color,dinero_disp, estado_usr, id);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
        return "false";
    }
    
}
