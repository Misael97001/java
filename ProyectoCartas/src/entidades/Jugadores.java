package entidades;

import java.util.ArrayList;

import servicios.Juego;

public class Jugadores {

	private ArrayList<String> jugadores;

	
	public void jugar() {
		jugadores = new ArrayList<String>();
		jugadores.add("Jugador 1");
		jugadores.add("Jugador 2");
		jugadores.add("Jugador 3");
		
		Juego juego= new Juego(jugadores);
		
		ArrayList<ArrayList<Carta>> cartas =juego.entregarCartas(5);

		for (int i=0; i<jugadores.size();i++) {
			 System.out.println(jugadores.get(i) + " total: " + cartas.get(i).size());
		}
		String ganador= juego.determinarGanador();
	System.out.println("Ganador: "+ganador);
	}


	public ArrayList<String> getJugadores() {
		return jugadores;
	}


	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	
	
	
	
}
