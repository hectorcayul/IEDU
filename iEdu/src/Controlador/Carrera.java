package Controlador;

import java.sql.Blob;



public class Carrera {
	public int idCarrera;
	public int idArea;
	public int idInstitucion;
	public String nombre;
	public String tituloProfesional;
	public String gradoAcademico;
	public String duracion;
	public String regimenEstudio;
	public String nem;
	public String lenguaje;
	public String matematica;
	public String ciencias;
	public String historia;
	public Blob malla;
	public int ranking;
	
	public Carrera(int idCarrera,int idArea,int idInstitucion,String nombre, String tituloProfesional,String gradoAcademico,String duracion,String regimenEstudio,
			String nem,String lenguaje,String matematica,String ciencias,String historia, Blob malla, int ranking){
		this.idCarrera=idCarrera;
		this.idArea=idArea;
		this.idInstitucion=idInstitucion;
		this.nombre=nombre;
		this.tituloProfesional=tituloProfesional;
		this.gradoAcademico=gradoAcademico;
		this.duracion=duracion;
		this.regimenEstudio=regimenEstudio;
		this.nem=nem;
		this.lenguaje=lenguaje;
		this.matematica=matematica;
		this.ciencias=ciencias;
		this.historia=historia;
		this.malla=malla;
		this.ranking=ranking;		
	}
	public int getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
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

	public String getTituloProfesional() {
		return tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getRegimenEstudio() {
		return regimenEstudio;
	}

	public void setRegimenEstudio(String regimenEstudio) {
		this.regimenEstudio = regimenEstudio;
	}

	public String getNem() {
		return nem;
	}

	public void setNem(String nem) {
		this.nem = nem;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getMatematica() {
		return matematica;
	}

	public void setMatematica(String matematica) {
		this.matematica = matematica;
	}

	public String getCiencias() {
		return ciencias;
	}

	public void setCiencias(String ciencias) {
		this.ciencias = ciencias;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public Blob getMalla() {
		return malla;
	}

	public void setMalla(Blob malla) {
		this.malla = malla;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}



	

}
