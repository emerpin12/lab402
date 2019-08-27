package com.senati.ejercicio2;

public class Empleado {
	public String DNI;
	public String nombre;
	public String apellidos;
	public char edad;
	public String fechingreso;
	public Empleado() {
		super();
	}
	public Empleado(String dNI, String nombre, String apellidos, char edad, String fechingreso) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.fechingreso = fechingreso;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public char getEdad() {
		return edad;
	}
	public void setEdad(char edad) {
		this.edad = edad;
	}
	public String getFechingreso() {
		return fechingreso;
	}
	public void setFechingreso(String fechingreso) {
		this.fechingreso = fechingreso;
	}
	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", fechingreso=" + fechingreso + "]";
	}
	
}
