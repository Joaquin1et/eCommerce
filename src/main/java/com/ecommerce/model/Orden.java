package com.ecommerce.model;

import java.util.Date;

public class Orden {
	private Integer is;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private double total;

	public Orden(Integer is, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
		super();
		this.is = is;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}
	
	//---Generamos un constructor vacio ---
	public Orden() {
		
	}

	public Integer getIs() {
		return is;
	}

	public void setIs(Integer is) {
		this.is = is;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaRecibida() {
		return fechaRecibida;
	}

	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [is=" + is + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + "]";
	}
	
	
	
	

}
