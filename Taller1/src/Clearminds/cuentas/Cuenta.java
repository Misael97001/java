package Clearminds.cuentas;

public class Cuenta {

	private String id;
	private String tipo;
	private double saldo;
	
	public Cuenta(String id) {
		this.id=id;
		this.tipo="A";
	}
	public Cuenta(String id, String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	public void imprimir() {
		System.out.println("************");
		System.out.println("CUENTA");
		System.out.println("************");
		System.out.println("Nombre de Cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: "+saldo);


	}
	
	public void imprimirConMiEstilo() {
		System.out.println();
		
		System.out.println("************");
		System.out.println("CUENTA MI ESTILO");
		System.out.println("************");
		System.out.println("Nombre de Cuenta :) : "+id);
		System.out.println("Tipo -_- : "+tipo);
		System.out.println("Saldo $$$$: "+saldo);

	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	
}
