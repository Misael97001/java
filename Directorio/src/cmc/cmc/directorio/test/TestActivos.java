package cmc.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf= new Telefono("claro", "1231313", 46);
		Contacto c1= new Contacto("Andres", telf, 69);
		
		System.out.println("Nombre: "+c1.getNombre()+" Tiene Whatsapp: "+c1.getTelefono().isTieneWhatsapp());
		
		AdminContactos ac=new AdminContactos();
		ac.activarUsuario(c1);
		
		System.out.println("Nombre: "+c1.getNombre()+" Tiene Whatsapp: "+c1.getTelefono().isTieneWhatsapp());
		
	}

}
