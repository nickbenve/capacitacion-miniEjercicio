package inscripcionMaterias;

public class Departamento {

	public void abrirCurso(Curso curso) throws NoCumpleCantidadException {
		if(curso.cumpleCantidad()) {
			curso.activarCurso();
		}
	}
	
}
