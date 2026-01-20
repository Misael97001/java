package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {

	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar" + persona);
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("insert into personas (cedula,nombre,apellido, "
					+ "estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,"
					+ "fecha_nacimiento,hora_nacimiento)" + "values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error de insertar");

		} finally {
			// cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
				// el mensaje y el objeto exception
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

	}

	// EJERCICIO 1: Método actualizar [cite: 3]
	public static void actualizar(Persona persona) throws Exception {
		Connection con = null; // Declaramos la conexión
		PreparedStatement ps; // Declaramos el objeto para ejecutar la sentencia SQL
		LOGGER.trace("Actualizando persona: " + persona); // Registramos el objeto que llega 

		try {
			con = ConexionBDD.conectar(); // Abrimos la conexión a la base de datos 

			// Preparamos la sentencia SQL usando "?" como parámetros 
			// Nota: La cédula no se actualiza, se usa para encontrar el registro 
			ps = con.prepareStatement("update personas set nombre=?, apellido=?, estado_civil_codigo=?, "
					+ "numero_hijos=?, estatura=?, cantidad_ahorrada=?, fecha_nacimiento=?, hora_nacimiento=? "
					+ "where cedula=?");

			// Reemplazamos los "?" por los valores del objeto persona en orden
			ps.setString(1, persona.getNombre()); // Incógnita 1: nombre
			ps.setString(2, persona.getApellido()); // Incógnita 2: apellido
			ps.setString(3, persona.getEstadoCivil().getCodigo()); // Incógnita 3: código estado civil
			ps.setInt(4, persona.getNumeroHijos()); // Incógnita 4: número de hijos
			ps.setDouble(5, persona.getEstatura()); // Incógnita 5: estatura
			ps.setBigDecimal(6, persona.getCantidadAhorrada()); // Incógnita 6: cantidad ahorrada

			// Convertimos la fecha de java.util.Date a java.sql.Date 
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));

			// Convertimos la hora de java.util.Date a java.sql.Time
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));

			// La cédula es la última incógnita para el WHERE 
			ps.setString(9, persona.getCedula());

			ps.executeUpdate(); // Ejecutamos la actualización en la base de datos
			LOGGER.debug("Persona actualizada correctamente"); // Log de éxito

		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e); // Registramos el error detallado 
			throw new Exception("Error al actualizar la persona"); // Lanzamos excepción al test
		} finally {
			// El bloque finally garantiza que la conexión se cierre siempre 
			try {
				if (con != null) {
					con.close(); // Cerramos la conexión para liberar recursos
				}
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos al cerrar", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	// EJERCICIO 2: Método eliminar 
	public static void eliminar(String cedula) throws Exception {
		Connection con = null; // Declaramos la conexión
		PreparedStatement ps; // Declaramos el objeto para la sentencia SQL
		LOGGER.trace("Eliminando persona con cédula: " + cedula); // Log del parámetro recibido

		try {
			con = ConexionBDD.conectar(); // Conectamos a la base de datos

			// Sentencia SQL para borrar por clave primaria (cedula) 
			ps = con.prepareStatement("delete from personas where cedula = ?");

			// Asignamos la cédula recibida al primer "?" de la sentencia
			ps.setString(1, cedula);

			ps.executeUpdate(); // Ejecutamos el borrado 
			LOGGER.debug("Registro eliminado"); // Log de éxito

		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e); // Log en caso de error
			throw new Exception("Error al eliminar la persona"); // Reportamos el error
		} finally {
			// Cerramos la conexión pase lo que pase
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos al cerrar", e);
				throw new Exception("Error con la base de datos");
			}
		}

	}
}
