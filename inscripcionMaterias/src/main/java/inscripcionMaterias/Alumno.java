package inscripcionMaterias;

import java.util.ArrayList;
import java.util.Collection;

public class Alumno {
	private String nombre;
	Collection<Materia> materiasQueAprobo; 
					

	public Alumno(String nombre,Collection<Materia> materiasQueAproboElAlumno) {
		super();
		this.setNombre(nombre);
		materiasQueAprobo=new ArrayList<Materia>();
		materiasQueAprobo=materiasQueAproboElAlumno;
	}


	public Collection<Materia> getMateriasQueAprobo() {
		return materiasQueAprobo;
	}

	
	public void setMateriasQueAprobo(Collection<Materia> materiasQueAprobo) {
		this.materiasQueAprobo = materiasQueAprobo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	
}