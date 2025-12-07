package krakedev.entidades;

public class Nota {
	private Materia materias;
	private double calificacion;

	public void mostrar() {
		System.out.println("Nota[materia=" + materias.getNombre() + ", codigo=" + materias.getCodigo() + ", calificacion="
				+ calificacion + "]");
	}

	public Materia getMaterias() {
		return materias;
	}

	public void setMaterias(Materia materias) {
		this.materias = materias;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
