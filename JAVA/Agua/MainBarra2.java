import java.util.Random;
import java.util.Scanner;
public class MainBarra2{
	public static void main(String[] args) {
		int agua = 0;
		int mayor = 0;
		int tam;
		Scanner teclado = new Scanner(System.in);
		Random leRandome = new Random();
		System.out.println("Ingresa el tamaño de tu arreglo");
		tam = teclado.nextInt();
		Barra [] prueba = new Barra[tam];

		for (int i = 0; i<prueba.length ; i++) {
			System.out.println("Ingrese el elemento [" + i + "] del arreglo");
			prueba[i] = new Barra(teclado.nextInt());
		}

		/*Para llenarlo de forma aleatoria
		for (int i = 0; i < prueba.length; i++){
			prueba[i]= new Barra(leRandome.nextInt(4));
			//Para imprimir la gráfica pero al revés
			//prueba[i].setGrapher(prueba[i].altura);
		}*/
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