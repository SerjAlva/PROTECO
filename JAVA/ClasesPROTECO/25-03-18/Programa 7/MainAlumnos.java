public class MainAlumnos{
	public static void main(String[] args) {
		Alumnado muchachos = new Alumnado(new AlumnosPrimaria(), new AlumnosPrepa(), new AlumnosUniversidad(), new AlumnosPrimaria(), new AlumnosPrepa(), new AlumnosUniversidad());
		muchachos.aprobar1();
		muchachos.reprobar1();
		muchachos.aprobar2();
		muchachos.reprobar2();
		muchachos.aprobar3();
		muchachos.reprobar3();
	}
}