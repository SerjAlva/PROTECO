import java.util.Scanner;
import java.util.Random;
public class Distribucion{
	public static void main(String[] args) {
		int suma = 0;
		Random cara = new Random();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos dados quieres tirar?");
		int dados = teclado.nextInt();
		//arreglo de dados 
		Dado [] daditos = new Dado[dados];
		//Contador almancena cuantas veces se repiten los resultados
		int [] contador = new int[dados*5+1];
		//El arreglo posibles almacena las combinaciones posibles de los dados
		int [] posibles = new int[dados*5+1];
		//Con este for se llena el arreglo posibles con todos los resultados posibles
		for (int i = 0; i < posibles.length; i++){
			posibles[i]=i+dados;
		}
		System.out.println("Cuantas veces deseas que se tiren los dados?");
		int tiros = teclado.nextInt();
		//resultados almacena el resultado de cada tirada de los n dados
		int [] resultados = new int [tiros];
		System.out.println("Tirando " + dados + " dados " + tiros + " veces...");
		//En este for se almacena el resultado de cada tiro
		for (int i = 0; i < resultados.length; i++){
			//En este for se suma el resultado de cada dado
			for (int j = 0; j < daditos.length; j++){
				suma+=cara.nextInt(6)+1;
			}
			resultados[i] = suma;
			suma = 0;
			//En este for contamos las veces que se han repetido la suma de los dados en contador
			for (int k = 0; k<posibles.length; k++) {
				if(resultados[i]==posibles[k]){
					contador[k]+=1;
					break;
				}
			}
		}
		System.out.println("Graficando la distribucion de los dados...");
		for(int i = 0; i < contador.length; i++){
			System.out.printf("%3d: ", posibles[i]);
			for (int j = 0; j < contador[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}