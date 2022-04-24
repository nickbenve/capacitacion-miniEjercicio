package inscripcionMaterias;

public class Departamento {
	private String nombre;
	
	
	

	public Departamento(String nombre) {
		super();
		this.nombre = nombre;
	}




	public void abrirCurso(Curso curso) throws NoCumpleCantidadException {
	
		if(curso.cumpleCantidad()) {
			curso.activarCurso();
		}
		
		
	}
	
}
