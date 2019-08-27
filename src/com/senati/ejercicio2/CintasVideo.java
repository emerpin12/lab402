package com.senati.ejercicio2;

public class CintasVideo {
	public String titulo;
	public String director;
	public String actores;
	public String duracion;
	public CintasVideo() {
		super();
	}
	public CintasVideo(String titulo, String director, String actores, String duracion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "CintasVideo [titulo=" + titulo + ", director=" + director + ", actores=" + actores + ", duracion="
				+ duracion + "]";
	}
	

	
}	 

