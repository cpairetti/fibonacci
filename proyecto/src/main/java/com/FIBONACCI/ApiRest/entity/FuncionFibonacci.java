package com.FIBONACCI.ApiRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="funcion")
public class FuncionFibonacci {
	
   @Id  
   @Column(name="tamanio")
   private long tamanio;

   @Column(name="resultado")
   private long resultado;
	  
	  
   public FuncionFibonacci() {}

   public FuncionFibonacci(long tamanio, long resultado) {
	        this.tamanio = tamanio;
	        this.resultado = resultado;
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
	 

	  
}
