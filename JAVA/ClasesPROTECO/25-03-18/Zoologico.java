public class Zoologico{
	public final int N=10;
	public Animal[] animales = new Animal[N];
	public int numero = 0;

	public void agregarAnimal(Animal a){
		if(numero == N)
			System.out.println("Zoologico lleno");
		else
			animales[numero] = a;
			numero++;
	}
}