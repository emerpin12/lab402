package com.senati.ejercicio2;



public class Libros{
	public String titulo;
	public String autor;
	public int nrpaginas;
	public int nrisbn;
	public Libros() {
		super();
	}
	public Libros(String titulo, String autor, int nrpaginas, int nrisbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nrpaginas = nrpaginas;
		this.nrisbn = nrisbn;
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
	public int getNrpaginas() {
		return nrpaginas;
	}
	public void setNrpaginas(int nrpaginas) {
		this.nrpaginas = nrpaginas;
	}
	public int getNrisbn() {
		return nrisbn;
	}
	public void setNrisbn(int nrisbn) {
		this.nrisbn = nrisbn;
	}
	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", autor=" + autor + ", nrpaginas=" + nrpaginas + ", nrisbn=" + nrisbn
				+ "]";
	}
	
	

}