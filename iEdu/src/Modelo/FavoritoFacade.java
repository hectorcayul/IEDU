package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Area;
import Controlador.Favoritos;
import Controlador.Usuario;
import android.util.Log;


public class FavoritoFacade {
	//Contruir objeto para devolver consulta de tipo usuario
public Favoritos factory(ResultSet rs) throws SQLException{
		
		int idCarrera	=rs.getInt("idCarrera");
		int idUsuario = rs.getInt("idUsuario");
		
		
		return new Favoritos(idCarrera, idUsuario);
	}
		
		
	//metodo consulta para todos usuarios
	  public List<Favoritos> findAllByIdCarrera(int idCarrera ) {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Favoritos> favorito=null;
	
	        String sql="SELECT*FROM hcayul2011.Favoritos f INNER JOIN Carrera c ON f.idCarrera=c.idCarrera WHERE f.idCarrera="+idCarrera;
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            favorito=new ArrayList<Favoritos>();
	            while(rs.next())
	            	favorito.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return favorito;
	    }

	  public List<Favoritos> findAllByIdUsuario(int idUsuario ) {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Favoritos> favorito=null;
	
	        String sql="SELECT*FROM hcayul2011.Favoritos f INNER JOIN Usuario u ON f.idUsuario=u.idUsuario WHERE f.idUsuario="+idUsuario;
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            favorito=new ArrayList<Favoritos>();
	            while(rs.next())
	            	favorito.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return favorito;
	    }

	  
}
	


