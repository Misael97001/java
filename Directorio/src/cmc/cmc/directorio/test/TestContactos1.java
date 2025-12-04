package cmc.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {
	public static void main(String[] args) {
		Telefono t1=new  Telefono("movi", "12312321", 45);
		Telefono t2=new  Telefono("claro", "12312321", 45);
		
		Contacto c1= new Contacto("Misael", t1,65.3);
		Contacto c2= new Contacto("Jefferson", t2,43);
		
		AdminContactos ac=new AdminContactos();
		Contacto masPesado=ac.buscarMasPeso(c1, c2);
		System.out.println("El mas pesado es : "+masPesado.getNombre()+" PESO: "+
		masPesado.getPeso()+ "Telefono: "+masPesado.getTelefono().getOperadora()
		+" "+masPesado.getTelefono().getNumero()+" "+ masPesado.getTelefono().getCodigo());
		
		System.out.println("Misma operadora: "+ac.compararOperadores(c1, c2));
		
	}
}
