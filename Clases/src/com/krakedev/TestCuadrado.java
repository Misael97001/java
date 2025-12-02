package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		
		c1.lado=3;
		c2.lado=6;
		c3.lado=9;
		
		double areaC1=c1.calcularArea();
		double perimetroC1=c1.perimetroCuadrado();
		
		double areaC2=c2.calcularArea();
		double perimetroC2=c2.perimetroCuadrado();
		
		double areaC3=c3.calcularArea();
		double perimetroC3=c3.perimetroCuadrado();
		
		System.out.println("El area del cuadrado 1 es: "+areaC1);
		System.out.println("El perimetro del cuadrado 1 es: "+perimetroC1);

		System.out.println("El area del cuadrado 2 es: "+areaC2);
		System.out.println("El perimetro del cuadrado 2 es: "+perimetroC2);

		System.out.println("El area del cuadrado 3 es: "+areaC3);
		System.out.println("El perimetro del cuadrado 3 es: "+perimetroC3);
		
	}

}
