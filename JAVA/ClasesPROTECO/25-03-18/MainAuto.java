import java.util.Scanner;
public class MainAuto{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numAutos, modelo; String marca;
		System.out.println("Ingresa cuantos autos deseas crear");
		numAutos = teclado.nextInt();
		Auto[] autos = new Auto[numAutos];

		for(int i = 0; i < autos.length; i++){
			autos[i] = new Auto();
			System.out.println();
			System.out.println("Ingresa las caracteristicas del auto " + (i+1));
			System.out.println("Ingresa el modelo de tu auto:");
			autos[i].setModelo(teclado.nextInt());
			System.out.println("Ingresa el color de tu auto:");
			autos[i].setColor(teclado.next());
			System.out.println("Ingresa la marca de tu auto:");
			autos[i].setMarca(teclado.next());
			System.out.println();
		}

		for (int i = 0; i < autos.length; i++) {
			int des = 0;
			System.out.println();
			System.out.println();
			System.out.println("El auto " + (i+1) + " tiene las siguientes caracteristicas:");
			System.out.println();
			System.out.println("Moelo: " + autos[i].getModelo());
			System.out.println("Color: " + autos[i].getColor());
			System.out.println("Marca: " + autos[i].getMarca());
			System.out.println();
			while(des != 4){				
				System.out.println("Que deseas hacer con el auto " + (i+1));
				System.out.printf("\n\n\t1)Encender\n\n\t2)Apagar\n\n\t3)Calcular velocidad\n\n\t4)Salir\n\n");
				des = teclado.nextInt();
				switch (des) {
					case 1:
						autos[i].encender();
						break;
					case 2:
						autos[i].apagar();
						break;
					case 3:
						autos[i].kmh();
						break;
					case 4:
						break;
					default:
						System.out.println("Opcion invalida, pruebe de nuevo");
						break;
				}
			}
		}
	}
}