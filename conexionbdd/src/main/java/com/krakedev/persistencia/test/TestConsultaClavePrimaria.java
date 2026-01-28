package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaClavePrimaria {

	public static void main(String[] args) {
		
		ArrayList<Persona> personas;
		try {
			personas = AdminPersonas.buscarPorCedula("1700000001");
			System.out.println(personas);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
