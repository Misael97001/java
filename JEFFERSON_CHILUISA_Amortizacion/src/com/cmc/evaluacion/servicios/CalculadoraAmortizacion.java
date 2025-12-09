package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double Co = prestamo.getMonto();
		double i = prestamo.getInteres();
		i = i / 12;
		i = i / 100;
		int n = prestamo.getPlazo();

		double cuota = (Co * i) / (1 - (Math.pow(1 + i, -n)));
		return cuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		double cuotaFija = calcularCuota(prestamo);
		// Saldo inicial es un valor fijo.
		double saldoInicial = prestamo.getMonto();
		ArrayList<Cuota> cuotas = prestamo.getCuotas();

		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota cuota = new Cuota(i + 1);
			cuota.setCuota(cuotaFija);
			cuotas.add(cuota);
			if (i == 0) {
				cuotas.get(i).setCapital(saldoInicial);
			}
		}

		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota nuevaCuota = cuotas.get(i);
			double interes = prestamo.getInteres();
		//El error se genera debido a que si llamo en el interador i=11 llama a la posicion 
			// 11+1 = 12 el cual no existe esa posicion
			
			if (1+i < cuotas.size()) {
					Cuota siguienteCuota = cuotas.get(i + 1);
				calcularValoresCuota(interes, nuevaCuota, siguienteCuota);
			} else {
				double saldoPendiente = cuotas.get(i).getSaldo();
				cuotas.get(i).setSaldo(0);
				cuotas.get(i).setCuota(cuotaFija + saldoPendiente);
			}
		}
	}

	public static void calcularValoresCuota(double i, Cuota cuotaActual, Cuota cuotaSiguiente) {
		double interesPeriodo = (i / 12) / 100;
		// 1. Calcular Interés: Capital al inicio * Tasa mensual
		double interesCalculado = cuotaActual.getCapital() * interesPeriodo;
		cuotaActual.setInteres(interesCalculado);

		// 2. Calcular Abono a Capital: Cuota Fija - Interés
		double abonoCapital = cuotaActual.getCuota() - interesCalculado;
		cuotaActual.setAbonoCapital(abonoCapital);

		// 3. Calcular Saldo Final: Capital Inicial - Abono a Capital
		double saldoFinal = cuotaActual.getCapital() - abonoCapital;
		cuotaActual.setSaldo(saldoFinal);

		// 4. Uso del tercer parámetro: Establecer el Capital Inicial de la Siguiente
		// Cuota.
		// Esto solo ocurre si la cuota actual NO es la última.
		if (cuotaSiguiente != null) {
			// El saldo final de ESTA cuota se convierte en el capital inicial de la
			// SIGUIENTE.
			cuotaSiguiente.setCapital(saldoFinal);
		}

	}
	
	public static void mostrarTabla(Prestamo prestamo) {
		
		ArrayList<Cuota>cuotas=prestamo.getCuotas();
		Cuota cuotaPorMostrar;
		System.out.println("Número | Cuota | Inicio | Interés | Abono | Saldo");
		for (int i=0; i<prestamo.getPlazo();i++) {
				cuotaPorMostrar=cuotas.get(i);
				cuotaPorMostrar.mostrarPrestamo();
		}
		
	}
}
