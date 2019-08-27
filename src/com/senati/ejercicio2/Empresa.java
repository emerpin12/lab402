package com.senati.ejercicio2;

public class Empresa {
	public String codigo;
	public String nombre;
	public String razon;
	public int telefono;
	public String ruc;
	public String direccion;
	public String tpermiso;
	public String pais;
	public Empresa() {
		super();
	}
	public Empresa(String codigo, String nombre, String razon, int telefono, String ruc, String direccion,
			String tpermiso, String pais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.razon = razon;
		this.telefono = telefono;
		this.ruc = ruc;
		this.direccion = direccion;
		this.tpermiso = tpermiso;
		this.pais = pais;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRazon() {
		return razon;
	}
	public void setRazon(String razon) {
		this.razon = razon;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTpermiso() {
		return tpermiso;
	}
	public void setTpermiso(String tpermiso) {
		this.tpermiso = tpermiso;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Empresa [codigo=" + codigo + ", nombre=" + nombre + ", razon=" + razon + ", telefono=" + telefono
				+ ", ruc=" + ruc + ", direccion=" + direccion + ", tpermiso=" + tpermiso + ", pais=" + pais + "]";
	}
	
	
}