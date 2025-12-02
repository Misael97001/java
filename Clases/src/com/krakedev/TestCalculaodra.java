package com.krakedev;

public class TestCalculaodra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calcu=new Calculadora();
		int resultadoSuma=calcu.sumar(5, 8);
		
		int resultadoResta=calcu.restar(10, 3);
		System.out.println("Resultado SUMA:"+ resultadoSuma);
		System.out.println("Resultado RESTA:"+ resultadoResta);
	
		double resultadoMul=calcu.multiplicar(10, 5);
		double resultadoDiv=calcu.dividir(10, 5);
		double resultadoProm=calcu.promediar(10,8,9);
		
		System.out.println("Multiplicacion "+ resultadoMul);
		System.out.println("Division "+ resultadoDiv);
		System.out.println("Promedio "+ resultadoProm);
		calcu.mostrarResultado();
		
	}
	

}
