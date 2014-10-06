package Controlador;

public class Usuario {
	public int idUsuario;
	public String nombre;
	public String apellido;
	public String correo;
	public int region;
	public String contrasena;
	
	public Usuario(int idUsuario, String nombre,String apellido,String correo,int region,String contrasena){
		this.idUsuario=idUsuario;
		this.nombre=nombre;
		this.apellido=apellido;
		this.correo=correo;
		this.region=region;
		this.contrasena=contrasena;
		
	}
	public String toString(){
		return this.nombre+" "+this.apellido;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getRegion() {
		return region;
	}
	public void setRegion(int region) {
		this.region = region;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	

}
