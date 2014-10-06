package Controlador;

public class Instituciones {
	public int idInstitucion;
	public String nombre;
	public String acreditacion;
	public int idRegion;
	
	
	public Instituciones(int idInstitucion,String nombre, String acreditacion, int idRegion){
		this.idInstitucion=idInstitucion;
		this.nombre=nombre;
		this.acreditacion=acreditacion;
		this.idRegion=idRegion;
		
	}


	public int getIdInstitucion() {
		return idInstitucion;
	}


	public void setIdInstitucion(int idInstitucion) {
		this.idInstitucion = idInstitucion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAcreditacion() {
		return acreditacion;
	}


	public void setAcreditacion(String acreditacion) {
		this.acreditacion = acreditacion;
	}


	public int getIdRegion() {
		return idRegion;
	}


	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}
	
	

}
