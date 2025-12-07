package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;


	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante){
	
		for (int i=0; i <estudiantes.size();i++) {
			if(estudiante.getCedula().equals(estudiantes.get(i).getCedula())) {
				System.out.println("El estudiante ya esta matriculado");
				return estudiante;
			}
		}
		return null;
	}
	
	
	public void matricularEstudiantes(Estudiante estudiante) {
		
		Estudiante e=buscarEstudiantePorCedula(estudiante);
		if(e==null) {
			estudiantes.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso() {
		double suma=0;
		Estudiante e;
		for( int i=0; i<estudiantes.size();i++) {
			e=estudiantes.get(i);
			suma=suma+e.calcularPromedioNotasEstudiante();
		}
		return suma/estudiantes.size();
	}
	
}
