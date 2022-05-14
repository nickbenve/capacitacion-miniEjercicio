package inscripcionMaterias;

import java.util.ArrayList;
import java.util.Collection;


import javax.validation.constraints.NotBlank;

public class Materia {
	
	@NotBlank
	private String nombre;
	
//	@Min(2000)
//	private Integer anio;
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
