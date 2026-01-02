package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.utils.*;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;

public class TestAlarmas {
	public static void main(String[] args) {
		
		Alarma a1= new Alarma(DiasSemana.LUNES, 1, 24);
		Alarma a2= new Alarma(DiasSemana.MARTES, 20, 54);
		Alarma a3= new Alarma(DiasSemana.VIERNES, 14, 24);
		Alarma a4= new Alarma(DiasSemana.SABADO, 18, 51);
		Alarma a5= new Alarma(DiasSemana.DOMINGO, 6, 15);
		Alarma a6= new Alarma(DiasSemana.JUEVES, 8, 52);
		
		AdminAlarmas admin= new AdminAlarmas();
		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		admin.agregarAlarma(a4);
		admin.agregarAlarma(a5);
		admin.agregarAlarma(a6);
		
		ArrayList<Alarma> alarmasActuales=admin.getAlarmas();
		System.out.println(alarmasActuales);
	}
}
