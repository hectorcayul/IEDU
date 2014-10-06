package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Area;
import Controlador.Usuario;
import android.util.Log;


public class AreaFacade {
	//Contruir objeto para devolver consulta de tipo usuario
public Area factory(ResultSet rs) throws SQLException{
		
		int idArea=rs.getInt("idArea");
		String nombre = rs.getString("Nombre");
		
		
		return new Area(idArea, nombre);
	}
		
		
	//metodo consulta para todos usuarios
	  public List<Area> findAll() {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Area> area=null;
	
	        String sql="SELECT * FROM hcayul2011.Area";
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            area=new ArrayList<Area>();
	            while(rs.next())
	            	area.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return area;
	    }
	  
	  public List<Area> findByidArea(String idArea) {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Area> area=null;
	
	        String sql="SELECT * FROM hcayul2011.Area WHERE idArea="+idArea;
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            area=new ArrayList<Area>();
	            while(rs.next())
	            	area.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return area;
	    }

	    	
}
	


