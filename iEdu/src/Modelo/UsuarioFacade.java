package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Usuario;
import android.util.Log;


public class UsuarioFacade {
	//Contruir objeto para devolver consulta de tipo usuario
public Usuario factory(ResultSet rs) throws SQLException{
		
		int idUsuario=rs.getInt("idUsuario");
		String nombre = rs.getString("Nombre");
		String apellido =rs.getString("Apellido");
		String correo=rs.getString("Correo");
		int region=rs.getInt("idRegion");
		String contrasena=rs.getString("Contrasena");
		
		return new Usuario(idUsuario, nombre, apellido, correo, region,contrasena);
	}
		
		
	//metodo consulta para todos usuarios
	  public List<Usuario> findAll() {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Usuario> usuario=null;
	
	        String sql="SELECT*FROM hcayul2011.Usuario";
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            usuario=new ArrayList<Usuario>();
	            while(rs.next()){
	            System.out.println(rs.getString((0)));
	            System.out.println(rs.getString(1));
	            System.out.println(rs.getString(2));
	            System.out.println(rs.getString(3));
	            	//usuario.add(factory(rs));
	            }
	        } catch (SQLException ex) {
	        	System.out.print(ex);
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return usuario;
	    }
	  
	  public List<Usuario> findByCorreo(String correo,String contrasena) {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Usuario> usuario=null;
	
	        String sql="SELECT * FROM hcayul2011.Usuario WHERE Correo='"+correo+"' AND Contrasena='"+contrasena+"'";
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            usuario=new ArrayList<Usuario>();
	            while(rs.next())
	            	
	            	usuario.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return usuario;
	    }

	    	
}
	


