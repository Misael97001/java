package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	//en esta clase creamos las instancias de las alamras y los metodos para agregar y consultar
	private ArrayList<Alarma> alarmas = new ArrayList<Alarma>();

	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	
	
}
