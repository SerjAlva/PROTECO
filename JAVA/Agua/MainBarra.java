import java.util.Random;
public class MainBarra{
	public static void main(String[] args) {
		Barra [] prueba = new Barra[7]; //Para variar el tamaño de el arreglo modificar el número de elementos
		Random leRandome = new Random();
		int agua = 0;
		int mayor = 0;
		for (int i = 0; i < prueba.length; i++){
			prueba[i]= new Barra(leRandome.nextInt(4));
			//Para imprimir la gráfica pero al revés
			//prueba[i].setGrapher(prueba[i].altura);
		}
		System.out.println("El arreglo es: ");
		for (int i = 0; i < prueba.length; i++){
			System.out.print(prueba[i].altura + " ");
			if(prueba[i].hasLeft(prueba, i) && prueba[i].hasRight(prueba, i)){
				agua += prueba[i].water(prueba, i);
			}
		}
		mayor = prueba[0].altura;
		//Encontrando el elemento más alto de el arreglo
		for(int i = 0; i < prueba.length; i++){
			if(mayor < prueba[i].altura)
				mayor = prueba[i].altura;
		}
		//Configurando grapher como el más alto del arreglo
		for(int i = 0; i < prueba.length; i++)
			prueba[i].setGrapher(mayor);
		System.out.println("Imprimiendo gráfica de barras horizontal");
		for(int i = 0; i < prueba.length; i++){
			System.out.printf("%2d: ", prueba[i].altura);
			for(int j = 0; j < prueba[i].altura; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Imprimiendo grafica de barras vertical\n\n");
		for (int i = 0; i <= mayor; i++){
			for(int j = 0; j < prueba.length; j++){
				System.out.printf("%c", prueba[j].graph());
			}
			System.out.println();
		}
		for(int j = 0; j < prueba.length; j++){
				System.out.printf("%d", prueba[j].altura);
			}
		System.out.println();
		System.out.println("En el arreglo caben " + agua + " de agua v:");
	}
}