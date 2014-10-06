package Controlador;

public class Region {
	public int idRegion;
	public String nombre;
	public String ciudad;

	
	public Region(int idRegion, String nombre,String ciudad){
		this.idRegion=idRegion;
		this.nombre=nombre;
		this.ciudad=ciudad;
				
	}


	public int getIdRegion() {
		return idRegion;
	}


	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	

}
