package com.senati.ejercicio2;

public class CintasCD {
	public String titulo;
	public String autor;
	public String lugar;
	public String duracion;
	public CintasCD() {
		super();
	}
	public CintasCD(String titulo, String autor, String lugar, String duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.lugar = lugar;
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "CintasCD [titulo=" + titulo + ", autor=" + autor + ", lugar=" + lugar + ", duracion=" + duracion + "]";
	}
	
}