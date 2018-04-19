import java.util.Scanner;
public class CarroCamaro extends Carro{
	private String modelo;
	private Double altura;
	private Double peso;

	Scanner teclado = new Scanner(System.in);

	public String toString(){
		return String.format("El modelo es %s\nEl peso es: %.2f\nLa altura es: %,2f\n",modelo, getPeso(), getAltura());
	}

	public CarroCamaro(String modelo, Double peso, Double altura){		
		super(peso, altura);
		this.modelo = modelo;
	}
}