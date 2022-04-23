package inscripcionMaterias;



import java.util.ArrayList;
import java.util.Collection;

public class Curso {
	private int minimoRequerido;
	private int anio;
	private int cuatrimestre;
	private boolean estado;
	private Materia materia;
	
	Collection<Alumno> alumnosInscriptos;
	
	public Curso(int minimoRequerido, int anio, int cuatrimestre, Materia materia) {
		super();
		alumnosInscriptos = new ArrayList<Alumno>();
		this.setAnio(anio);
		this.setCuatrimestre(cuatrimestre);
		this.materia = materia;
		this.estado=false;
	}

	
	public Materia getMateria() {
		return materia;
	}


	public void agregarAlumno(Alumno alumno) throws  NoCumpleCorrelativasException {
		
		if(this.cumpleCorrelativas(alumno)) {
			this.alumnosInscriptos.add(alumno);
		}else {
			throw new NoCumpleCorrelativasException("le faltan correlativas");
		}
	}


	private boolean cumpleCorrelativas(Alumno alumno) {
		for(Materia materia: materia.getCorrelativas()) {
			if(!alumno.getMateriasQueAprobo().contains(materia)) {
				return false;
			};
		}
		return true;
	}


	public int getMinimoRequerido() {
		return minimoRequerido;
	}


	public void setMinimoRequerido(int minimoRequerido) {
		this.minimoRequerido = minimoRequerido;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public int getCuatrimestre() {
		return cuatrimestre;
	}


	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public void activarCurso() {
		this.estado=true;
	}
	
	public boolean cumpleCantidad() throws NoCumpleCantidadException {
		if(alumnosInscriptos.size()>this.getMinimoRequerido()) {
			this.activarCurso();
		}else {
			throw new NoCumpleCantidadException("No es suficiente la cantidad de inscriptos");
		}
		return false;
	}


	
}