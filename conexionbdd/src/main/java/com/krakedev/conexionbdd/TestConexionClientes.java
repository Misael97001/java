package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexionClientes {

	public static void main(String[] args) {
		
		Connection connection= null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres",
					"postgres","KrakeDev");
			System.out.println("Conexion exitosa");
			ps=connection.prepareStatement("insert into compras (id_compra, cedula, fecha_compra, monto)"
					+  "values (?,?,?,?)");
			ps.setInt(1, 15);
			ps.setString(2, "1723456789");
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2026/01/12 10:05:04";
			try {
				Date fecha=sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis=fecha.getTime();
				System.out.println(fechaMilis);
				//crea un java.sql.Date partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);
				ps.setDate(3, fechaSQL);					
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ps.setBigDecimal(4, new BigDecimal(469.69));
			ps.executeUpdate();
			System.out.println("EJECUTA INSERT");	
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
