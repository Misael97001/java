package cmc.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("claro", "8065321", 45);
		Telefono t2 = new Telefono("claro", "12312321", 48);

		Contacto c1 = new Contacto("Misael", t1, 54.3);
		Contacto c2 = new Contacto("Jefferson", t2,70);
		AdminContactos ac = new AdminContactos();
		Contacto masPesado = ac.buscarMasPeso(c1, c2);
		System.out.println("El mas pesado es : " + masPesado.getNombre() + " PESO: " + masPesado.getPeso()
				+ " Telefono: " + masPesado.getTelefono().getOperadora() + " " + masPesado.getTelefono().getNumero()
				+ " " + masPesado.getTelefono().getCodigo());

		System.out.println("Misma operadora: " + ac.compararOperadores(c1, c2));

	}

}
