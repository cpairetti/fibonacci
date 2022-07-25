package com.FIBONACCI.ApiRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estadistica")
public class Estadistica {

	@Id  
	@Column(name="tamanio")
	private long tamanio;

	@Column(name="resultado")
	private long resultado;
	
	@Column(name="cantidad")
	private long cantidad;
	   
	public Estadistica() {}

	public Estadistica(long tamanio, long resultado, long cantidad) {
	    this.tamanio = tamanio;
		this.resultado = resultado;
		this.cantidad = cantidad;
	}

	public long getTamanio() {
		return tamanio;
	}

	public void setTamanio(long tamanio) {
		this.tamanio = tamanio;
	}

	public long getResultado() {
		return resultado;
	}

	public void setResultado(long resultado) {
		this.resultado = resultado;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	   
	   
}
