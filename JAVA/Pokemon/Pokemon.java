import java.util.Scanner;
public class Pokemon{
	public String nombre;
	public int vida;
	public int nivel;
	public Ataque ataque1;
	public Ataque ataque2;
	public Ataque ataque3;
	public Ataque ataque4;
	public Boolean turno;

	Scanner sc = new Scanner(System.in);
	
	Pokemon(int vida, int nivel){
		System.out.println("Ingresa el nombre de tu Pokemon");
		nombre = sc.nextLine();
		this.vida = vida;
		this.nivel = nivel;
	}
}