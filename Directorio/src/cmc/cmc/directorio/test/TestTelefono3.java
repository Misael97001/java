package cmc.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
	public static void main(String[] args) {
		Telefono telf1= new Telefono("Movi", "12313121231", 10);
		Telefono telf2= new Telefono("Movi", "53453421231", 15);
		Telefono telf3= new Telefono("Claro", "0328475869", 14);
		
		AdminTelefono at= new AdminTelefono();
		int contadorMovi=at.contarMovi(telf1, telf2, telf3);
		System.out.println("ContadorMovi"+contadorMovi);
	}

}
