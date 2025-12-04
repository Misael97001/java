package cmc.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		
		Telefono t1= new Telefono("claro", "121231231", 12);
		Telefono t2= new Telefono("claro", "121231231", 13);
		Telefono t3= new Telefono("movi", "121231231", 14);
		Telefono t4= new Telefono("movi", "121231231", 15);
		
		AdminTelefono at=new AdminTelefono();
		int contadorClaro=at.contarClaro(t1, t2, t3, t4);
		System.out.println("Contador Claro: "+contadorClaro);
		
	}

}
