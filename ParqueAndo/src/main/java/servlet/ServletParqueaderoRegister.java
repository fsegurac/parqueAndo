package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ParqueaderoController;

/**
 * Servlet implementation class ServletUsuarioRegister
 */
@WebServlet("/ServletParqueaderoRegister")
public class ServletParqueaderoRegister extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletParqueaderoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ParqueaderoController parqueadero = new ParqueaderoController();
        
        int id_NIT = Integer.parseInt(request.getParameter("id_NIT"));
        String razon_Social = request.getParameter("razon_Social");
        String direccion_Parq = request.getParameter("direccion_Parq");
        double cel_Parq = Double.parseDouble(request.getParameter("cel_Parq"));      
        String email_PArq = request.getParameter("email_Parq");
        double dinero_Ganado = 0.0;
        String contrasena_Parq = request.getParameter("contrasena_Parq");
        boolean estado_Parq = Boolean.parseBoolean(request.getParameter("estado_Parq"));
        

        String result = parqueadero.register(id_NIT, razon_Social, direccion_Parq, 
                cel_Parq, email_PArq, dinero_Ganado, contrasena_Parq, estado_Parq);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}