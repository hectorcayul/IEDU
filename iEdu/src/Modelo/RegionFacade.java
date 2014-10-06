package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Region;
import Controlador.Usuario;
import android.util.Log;


public class RegionFacade {
	//Contruir objeto para devolver consulta de tipo usuario
public Region factory(ResultSet rs) throws SQLException{
		
		int idRegion=rs.getInt("idRegion");
		String nombre = rs.getString("Nombre");
		String ciudad =rs.getString("Ciudad");
		
		return new Region(idRegion, nombre, ciudad);
	}
		
		
	//metodo consulta para todos usuarios
	  public List<Region> findAll() {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Region> region=null;
	
	        String sql="SELECT * FROM hcayul2011.Region";
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            region=new ArrayList<Region>();
	            while(rs.next())
	            	region.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return region;
	    }
	  
	  
	  public List<Region> findAllById(int id) {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Region> region=null;
	
	        String sql="SELECT * FROM hcayul2011.Region WHERE idRegion="+id;
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            region=new ArrayList<Region>();
	            while(rs.next())
	            	region.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return region;
	    }
	  
	  
}
	


