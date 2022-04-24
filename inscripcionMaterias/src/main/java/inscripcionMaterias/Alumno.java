package inscripcionMaterias;

import java.util.ArrayList;
import java.util.Collection;

public class Alumno {
	private String nombre;
	Collection<Materia> materiasQueAprobo; 
					

	public Alumno(String nombre, Collection<Materia> materiasAprobadas) {
		super();
		this.setNombre(nombre);
		materiasQueAprobo=new ArrayList<Materia>();
		materiasQueAprobo=materiasAprobadas;

	}

	

	private void setNombre(String nombre2) {
		this.nombre=nombre2;
		
	}



	public Collection<Materia> getMateriasQueAprobo() {
		return materiasQueAprobo;
	}

	
	public void setMateriasQueAprobo(Collection<Materia> materiasQueAprobo) {
		this.materiasQueAprobo = materiasQueAprobo;
	}




	
	
	public void inscribirse(Curso curso) throws NoCumpleCorrelativasException {
				
		if(curso.cumpleCorrelativas(this)) {
			curso.agregarAlumno(this);
		
		}else {
			throw new NoCumpleCorrelativasException("le faltan correlativas");
		}
	}


	


	
}