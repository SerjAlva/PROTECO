import java.util.Scanner;
public class MainPersona{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.println("Ingresa el numero de personas que deseas registrar");
		int nPersonas = teclado.nextInt();
		Persona[] personas = new Persona[nPersonas];

		for(int i = 0; i < personas.length; i++){
			System.out.println();
			System.out.println();
			personas[i] = new Persona();
			personas[i].setNombre();
			personas[i].setEdad();
			personas[i].setEstatura();
			personas[i].setPeso();
		}

		for(int i = 0; i < personas.length; i++){
			System.out.println();
			System.out.println();
			System.out.println("Nombre de la persona " + (i+1) + ": " + personas[i].getNombre());
			System.out.println("Edad de la persona " + (i+1) + ": " + personas[i].getEdad());
			System.out.println("Estatura de la persona " + (i+1) + ": " + personas[i].getEstatura() + " metros");
			System.out.println("Peso de la persona " + (i+1) + ": " + personas[i].getPeso() + " kilogramos");
		}
	}
}