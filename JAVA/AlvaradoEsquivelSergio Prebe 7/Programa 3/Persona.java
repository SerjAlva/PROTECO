import java.util.Scanner;
public class Persona{
	private String nombre;
	private int edad;
	private Double estatura;
	private Double peso;

	Scanner teclado = new Scanner(System.in);

	public String getNombre(){
		return nombre;
	}

	public void setNombre(){
		System.out.println("Ingresa el nombre de la persona");
		nombre = teclado.next();
	}

	public int getEdad(){
		return edad;
	}

	public void setEdad(){
		System.out.println("Ingresa la edad de " + nombre);
		edad = teclado.nextInt();
	}

	public Double getEstatura(){
		return estatura;
	}

	public void setEstatura(){
		System.out.println("Ingresa la estatura de " + nombre);
		estatura = teclado.nextDouble();
	}

	public Double getPeso(){
		return peso;
	}

	public void setPeso(){
		System.out.println("Ingresa el peso de " + nombre);
		peso = teclado.nextDouble();
	}

	public Persona(){

	}
}