package cmc.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {

		Telefono telef=new Telefono("claro", "123123", 15);
		Contacto c = new Contacto("Misael", telef,60.2);
		
		c.imprimir();
	
	}

}
