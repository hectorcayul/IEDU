package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Area;
import Controlador.Favoritos;
import Controlador.Instituciones;
import Controlador.Usuario;
import android.util.Log;


public class InstitucionesFacade {
	//Contruir objeto para devolver consulta de tipo usuario
public Instituciones factory(ResultSet rs) throws SQLException{
		
		int idInstitucion=rs.getInt("ID_Institucion");
		String nombre = rs.getString("Nombre");
		String acreditacion = rs.getString("Acreditacion");
		int idRegion = rs.getInt("idRegion");
		
		return new Instituciones(idInstitucion, nombre, acreditacion, idRegion);
	}
		
		
	//metodo consulta para todos usuarios
	  public List<Instituciones> findAllByIdCarrera(int idRegion ) {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Instituciones> institucion=null;
	
	        String sql="SELECT * FROM hcayul2011.Instituciones WHERE idRegion="+idRegion;
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            institucion=new ArrayList<Instituciones>();
	            while(rs.next())
	            	institucion.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return institucion;
	    }
	  
	  
}
	


