package com.cmc.evaluacion.entidades;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	
	public Cuota(int numero) {
		this.numero = numero;
	}
	
	public void mostrarPrestamo () {
		System.out.printf("%d | %.2f | %.2f | %.2f | %.2f | %.2f\n", 
	            numero, cuota, capital, inicio, abonoCapital, saldo);
	}
	
	Utilitario u= new Utilitario();
	
	
	public double getCuota() {
		return cuota;
	}
	public double getCapital() {
		return capital;
	}
	public double getInicio() {
		return inicio;
	}
	public double getInteres() {
		return interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setCuota(double cuota) {
		double cuotaR=u.redondear(cuota);
		this.cuota = cuotaR;
	}
	public void setCapital(double capital) {
		double capitalR = u.redondear(capital);
		this.capital = capitalR;
	}
	public void setInicio(double inicio) {
		double inicioR= u.redondear(inicio);
		this.inicio = inicioR;
	}
	public void setInteres(double interes) {
		double interesR=u.redondear(interes);
		this.interes = interesR;
	}
	public void setAbonoCapital(double abonoCapital) {
		double abonoCapitalR=u.redondear(abonoCapital);
		this.abonoCapital = abonoCapitalR;
	}
	public void setSaldo(double saldo) {
		double saldoR= u.redondear(saldo);
		this.saldo = saldoR;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
