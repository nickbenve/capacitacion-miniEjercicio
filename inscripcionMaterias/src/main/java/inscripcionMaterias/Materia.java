package inscripcionMaterias;

import java.util.ArrayList;
import java.util.Collection;

public class Materia {
	private String nombre;
	Collection<Materia> correlativas;
	
	public Materia(String nombre, Collection<Materia> materiasExiguidas) {
		super();
		this.nombre = nombre;
		this.correlativas= new ArrayList<Materia>();
		correlativas=materiasExiguidas;
	}
	
	

	public Collection<Materia> getCorrelativas(){
		return this.correlativas;
	}
	
}
