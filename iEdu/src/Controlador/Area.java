package Controlador;

public class Area {
	public int idArea;
	public String nombre;
	public Area(){}
	public Area(int idArea, String nombre){
		this.idArea=idArea;
		this.nombre=nombre;
		
	}
	public int getIdArea() {
		return idArea;
	}
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
