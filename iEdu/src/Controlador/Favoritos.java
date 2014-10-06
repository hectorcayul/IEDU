package Controlador;

public class Favoritos {
	public int idCarrera;
	public int idUsuario;
	
	public Favoritos(int idCarrera, int idUsuario){
		this.idCarrera=idCarrera;
		this.idUsuario=idUsuario;
	}

	public int getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	

}
