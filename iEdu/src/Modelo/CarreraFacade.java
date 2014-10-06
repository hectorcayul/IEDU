package Modelo;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controlador.Carrera;
import Controlador.Usuario;
import android.media.Image;
import android.util.Log;


public class CarreraFacade {
	//Contruir objeto para devolver consulta de tipo usuario
public Carrera factory(ResultSet rs) throws SQLException{
		
	
	  int idCarrera=rs.getInt("idCarrera");
	  int idArea=rs.getInt("idArea");
	  int idInstitucion=rs.getInt("idInstitucion");
	  String nombre=rs.getString("Nombre");
	  String tituloProfesional=rs.getString("Titulo_Profesional");
	  String gradoAcademico=rs.getString("Grado_Academico");
	  String duracion=rs.getString("Duracion");
	  String regimenEstudio=rs.getString("Regimen_Estudio");
	  String nem=rs.getString("NEM");
	  String lenguaje=rs.getString("Lenguaje");
	  String matematica=rs.getString("Matematica");
	  String ciencias=rs.getString("Ciencias");
	  String historia=rs.getString("Historia");
	  Blob malla=rs.getBlob("Malla");
	  int ranking=rs.getInt("Ranking");
	
	  return new Carrera(idCarrera, idArea, idInstitucion, nombre, tituloProfesional, gradoAcademico, duracion, regimenEstudio, nem, lenguaje, matematica, ciencias, historia, malla, ranking);
	}
		
		
	  public List<Carrera> findAll() {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Carrera> carrera=null;
	
	        String sql="SELECT * FROM hcayul2011.Carrera";
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            carrera=new ArrayList<Carrera>();
	            while(rs.next())
	            	carrera.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return carrera;
	    }
	  public List<Carrera> findAllByIdArea(String idArea) {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Carrera> carrera=null;
	
	        String sql="SELECT * FROM hcayul2011.Carrera WHERE idArea="+idArea;
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            carrera=new ArrayList<Carrera>();
	            while(rs.next())
	            	carrera.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return carrera;
	    }
	  public List<Carrera> findAllByIdInstitucion(String idInstitucion) {
		  
	        conexionBD connect = null;
	        PreparedStatement ps=null;
	        List<Carrera> carrera=null;
	
	        String sql="SELECT * FROM hcayul2011.Carrera WHERE idArea="+idInstitucion;
	        try {
	            connect = new conexionBD();
	            ps = connect.getConexion().prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            carrera=new ArrayList<Carrera>();
	            while(rs.next())
	            	carrera.add(factory(rs));
	            
	        } catch (SQLException ex) {
	           Log.e("Error -> DeviceFacade -> findById",ex.getMessage());
	        } finally {
	            if (connect != null)
	            	connect.close();
	        }
	        return carrera;
	    }
	    	
}
	


