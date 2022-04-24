package inscripcionMaterias;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

public class TestApertura {
	
	@Test
	public void cantidadSuficiente() throws Exception{
		
		Collection<Materia> materiasExiguidas= new ArrayList<Materia>();
		Materia analisis1= new Materia("AMI",materiasExiguidas);
		Curso curso= new Curso(1,2020,1,analisis1);
		
		Collection<Materia> materiasAprobadas= new ArrayList<Materia>();
		Alumno alumno= new Alumno("roberto", materiasAprobadas);
		Alumno alumno2= new Alumno("roberto2", materiasAprobadas);
		
		alumno.inscribirse(curso);
		alumno2.inscribirse(curso);
		Departamento sistemas= new Departamento("sistemas");

	
		sistemas.abrirCurso(curso);
		
		assertTrue(curso.estadoActual());
				
				
	

		
		
	}
	
	
	
	@Test
	public void cantidadInSuficiente() throws Exception{
		
		Collection<Materia> materiasExiguidas= new ArrayList<Materia>();
		Materia analisis1= new Materia("AMI",materiasExiguidas);
		Curso curso= new Curso(4,2020,1,analisis1);
		
		Collection<Materia> materiasAprobadas= new ArrayList<Materia>();
		Alumno alumno= new Alumno("roberto", materiasAprobadas);
		
		Alumno alumno2= new Alumno("carlos", materiasAprobadas);
		Alumno alumno3= new Alumno("mir", materiasAprobadas);
		
		alumno.inscribirse(curso);
		alumno2.inscribirse(curso);
		alumno3.inscribirse(curso);
		Departamento sistemas= new Departamento("sistemas");
		
	
		assertThrows(NoCumpleCantidadException.class,
	    		()->{
	    			sistemas.abrirCurso(curso); 
	    		});
	  

		
		
	}

//	@Test
//	public void cantidadInsuficiente() throws Exception{
//		
//	}

	
}
