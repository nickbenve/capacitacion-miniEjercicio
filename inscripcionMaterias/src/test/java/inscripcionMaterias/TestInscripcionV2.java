package inscripcionMaterias;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

public  class TestInscripcionV2 {

	
	@Test()
	public void inscripcionNoOkFaltaCorrelativass() throws Exception{
		
		Collection<Materia> materiasAprobadas= new ArrayList<Materia>();
		Alumno alumno= new Alumno("roberto", materiasAprobadas);
		
		Collection<Materia> materiasExiguidas= new ArrayList<Materia>();
		Materia analisis1= new Materia("AMI",materiasExiguidas);


		Collection<Materia> materiasExiguidas2= new ArrayList<Materia>();
		materiasExiguidas2.add(analisis1);
	    Curso curso2= new Curso(10,2020,1,new Materia("AM2",materiasExiguidas2));
	    
	    assertThrows(NoCumpleCorrelativasException.class,
	    		()->{
	    			alumno.inscribirse(curso2); 
	    		});  
	}
	@Test()
	public void inscripcionOkk() throws Exception{
		
		Collection<Materia> materiasAprobadas= new ArrayList<Materia>();
		Alumno alumno= new Alumno("roberto", materiasAprobadas);
		
		Collection<Materia> materiasExiguidas= new ArrayList<Materia>();
		Materia analisis1= new Materia("AMI",materiasExiguidas);


		Curso curso= new Curso(10,2020,1,analisis1);
		

		alumno.inscribirse(curso);
		  
	    assertTrue(curso.estaInscripto(alumno));
	    
	  
	}
}
