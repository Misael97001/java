package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public void agregarNota(Nota nuevaNota) {
		Nota notaVerificada;
		for (int i = 0; i < notas.size(); i++) {
			notaVerificada = notas.get(i);

			if (nuevaNota.getMaterias().getCodigo() != notaVerificada.getMaterias().getCodigo()) {

				if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
					notas.add(nuevaNota);
				}
			}
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		for (int i = 0; i < notas.size(); i++) {
			if (codigo.equals(notas.get(i).getMaterias().getCodigo())) {

				if (nuevaNota >= 0 && nuevaNota <= 10) {
					notas.get(i).setCalificacion(nuevaNota);
				}

			} else {
				System.out.println("No encontro el codigo");
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double sumaTotal = 0;
		double promedio = 0;
		for (int i = 0; i < notas.size(); i++) {
			sumaTotal = sumaTotal + notas.get(i).getCalificacion();
		}
		return promedio = sumaTotal / (notas.size());
	}

	public void mostrar() {
		System.out.println("Estudiante[nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", notas:");

		for (int i = 0; i < notas.size(); i++) {
			notas.get(i).mostrar();
		}

		System.out.println("Promedio: " + calcularPromedioNotasEstudiante() + "]");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
