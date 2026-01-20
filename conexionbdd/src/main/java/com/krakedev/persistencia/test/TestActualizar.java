package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
	
		// Creamos un objeto EstadoCivil con los nuevos datos (C de Casado)
				EstadoCivil ec = new EstadoCivil("C", "Casado");
				
				// Creamos el objeto Persona con la cédula que ya existe en la base y los nuevos nombres/apellidos
				Persona p = new Persona("171623131", "Julio Alberto", "Jaramillo Laurido", ec);
				
				try {
					// Usamos el Convertidor para transformar Strings en objetos Date 
					Date fechaNac = Convertidor.convertirFecha("1990/10/12");
					Date horaNac = Convertidor.convertirHora("14:45");

					// Seteamos el resto de atributos que queremos actualizar
					p.setFechaNacimiento(fechaNac);
					p.setHoraNacimiento(horaNac);
					p.setCantidadAhorrada(new BigDecimal(5000.75));
					p.setNumeroHijos(2);
					p.setEstatura(1.72);
					
					// Llamamos al método estático actualizar de AdminPersonas
					AdminPersonas.actualizar(p);
					
					// Si no hubo error, imprimimos confirmación
					System.out.println("PERSONA ACTUALIZADA CON ÉXITO");

				} catch (Exception e) {
					// En caso de error, mostramos el mensaje que viene desde AdminPersonas o Convertidor
					System.out.println("ERROR EN EL SISTEMA AL ACTUALIZAR: " + e.getMessage());
				}
	}

}
