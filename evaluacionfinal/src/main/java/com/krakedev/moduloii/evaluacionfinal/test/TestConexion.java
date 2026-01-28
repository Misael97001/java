package com.krakedev.moduloii.evaluacionfinal.test;

import com.krakedev.moduloii.evaluacionfinal.utils.ConexionBDD;

public class TestConexion {

	public static void main(String[] args) {
		
		try {
			ConexionBDD.conectar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
