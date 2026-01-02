package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {

	private int dia;
	private int hora;
	private int minuto;
	
	public Alarma(int dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}
	
	
	public int getDia() {
		return dia;
	}
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}


	@Override
	public String toString() {
		return "Alarma [dia=" + Util.formatearDia(dia) + 
				", hora=" + Util.formatearHora(hora) + 
				", minuto=" + minuto + "] \n";
	}
	
	
	
	
}
