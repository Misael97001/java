package servicios;

import java.util.ArrayList;
import java.util.Random;

import entidades.Carta;
import entidades.Naipe;

public class Juego {
	
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;


	
    public Juego() {
        this.naipe = new Naipe();
        this.cartasJugadores = new ArrayList<ArrayList<Carta>>();
        this.naipeBarajado= naipe.barajar();
        
    }
    
    public Juego(ArrayList<String> idsJugadores) {
        this.naipe = new Naipe();
        this.cartasJugadores = new ArrayList<ArrayList<Carta>>();

        // For clásico
        for (int i = 0; i < idsJugadores.size(); i++) {
            ArrayList<Carta> manoJugador = new ArrayList<Carta>();
            cartasJugadores.add(manoJugador);
        }
    }


    public String determinarGanador() {
        // 1. Inicializar variables auxiliares
        int idGanador = -1; // Usamos -1 como valor inicial inválido
        int sumaGanador = -1;

        // Obtener el número total de jugadores
        int numJugadores = cartasJugadores.size();

        // 2. Recorrer todos los jugadores (el ID del jugador es i + 1)
        for (int i = 0; i < numJugadores; i++) {
            // Calcular la suma del jugador actual (ID = i + 1)
            int idJugadorActual = i + 1;
            int sumaActual = devolverTotal(idJugadorActual);

            // 3. Comparar con el ganador actual
            // El enunciado pide: "si alguno tiene una cantidad mayor o igual pasa a ser el nuevo ganador"
            if (sumaActual >= sumaGanador) {
                sumaGanador = sumaActual;
                idGanador = idJugadorActual;
            }
        }
        String ganador= ""+idGanador;
        
        // 4. Retornar el idGanador
        return ganador;
    }
    
    public int devolverTotal (int idJugador ) {
    	int suma=0;
    	int indice=idJugador-1;
   
    	if (indice >= 0 && indice < cartasJugadores.size()) {
            ArrayList<Carta> cartasDelJugador = cartasJugadores.get(indice);
            for (int i=0; i<cartasDelJugador.size();i++) {
            	Carta carta=cartasDelJugador.get(i);
            	suma=suma+carta.getNumero().getValor();
            }
    	}else {
    		System.out.println("Error: ID de jugador invalido");
    		return 0;
    	}
            return suma;
    }
    
     
    public  ArrayList<ArrayList<Carta>> entregarCartas (int cartasPorJugador) {
		int contador=0;
		for(int i=0;i<cartasPorJugador;i++) {
			for (int j=0; j<cartasJugadores.size();j++) {
				Carta cartaEntregada = naipeBarajado.get(contador);
				cartasJugadores.get(j).add(cartaEntregada);
				contador++;
			}
		}
		return cartasJugadores;
	}
	
    
    
    


	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}


    
	
	
}
