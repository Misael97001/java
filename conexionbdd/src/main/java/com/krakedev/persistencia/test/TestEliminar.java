package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		
		// Definimos la cédula de la persona que deseamos borrar de la base de datos
				String cedulaAEliminar = "171623131";
				
				try {
					// Llamamos al método eliminar pasando únicamente el String de la cédula [cite: 12]
					AdminPersonas.eliminar(cedulaAEliminar);
					
					// Mensaje informativo si la ejecución fue exitosa
					System.out.println("PERSONA ELIMINADA CON ÉXITO: " + cedulaAEliminar);
					
				} catch (Exception e) {
					// Capturamos cualquier error de conexión o de SQL
					System.out.println("ERROR EN EL SISTEMA AL ELIMINAR: " + e.getMessage());
				}
	}

}
