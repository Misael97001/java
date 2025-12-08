package entidades;

import java.util.ArrayList;

public class Naipe {
	
	private ArrayList<Numero> numerosPosibles=new ArrayList<Numero>();
	private ArrayList<Carta> cartas;
	
	
	
	
	
	public Naipe() {
		Numero numero1= new Numero("A", 11);
		numerosPosibles.add(numero1);
		Numero numero2= new Numero("2", 2);
		numerosPosibles.add(numero1);
		Numero numero3= new Numero("3", 3);
		numerosPosibles.add(numero1);
		Numero numero4= new Numero("4", 4);
		numerosPosibles.add(numero1);
		Numero numero5= new Numero("5", 5);
		numerosPosibles.add(numero1);
		Numero numero6= new Numero("6", 6);
		numerosPosibles.add(numero1);
		Numero numero7= new Numero("7", 7);
		numerosPosibles.add(numero1);
		Numero numero8= new Numero("8", 8);
		numerosPosibles.add(numero1);
		Numero numero9= new Numero("9", 9);
		numerosPosibles.add(numero1);
		Numero numero10= new Numero("10", 10);
		numerosPosibles.add(numero1);
		Numero numero11= new Numero("J", 10);
		numerosPosibles.add(numero1);
		Numero numero12= new Numero("Q", 10);
		numerosPosibles.add(numero1);
		Numero numero13= new Numero("K", 10);
		numerosPosibles.add(numero1);
		Palos palo = new Palos();		
		for (int i=0; i<numerosPosibles.size();i++) {
			Carta nuevaCartaCR= new Carta(numerosPosibles.get(i),palo.getCorazonRojo() );
			cartas.add(nuevaCartaCR);
			
			Carta nuevaCartaCN= new Carta(numerosPosibles.get(i),palo.getCorazonNegro() );
			cartas.add(nuevaCartaCN);
			
			Carta nuevaCartaTR= new Carta(numerosPosibles.get(i),palo.getTrebol() );
			cartas.add(nuevaCartaTR);
			
			Carta nuevaCartaDI= new Carta(numerosPosibles.get(i),palo.getDiamante() );
			cartas.add(nuevaCartaDI);
			
		}
	}
	

	public ArrayList<Carta> barajar () {
		ArrayList<Carta> barajeado= new ArrayList<Carta>();
		ArrayList<Carta> auxiliar= new ArrayList<Carta>();
		for (int i=0; i<100;i++ ) {
			int posicion=Random.obtenerPosicion();
			Carta cartaPosicion=cartas.get(posicion);
			if(cartaPosicion.getEstado().equals("N")) {
				auxiliar.add(cartaPosicion);
				cartaPosicion.setEstado("C");
			}else if(cartaPosicion.getEstado().equals("C")) {
				
			}
		}
		
		for (int i=0; i<cartas.size();i++) {
			if(cartas.get(i).getEstado().equals("N")) {
				auxiliar.add(cartas.get(i));
			}
		}
		
		return barajeado;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

		
	
	
}
