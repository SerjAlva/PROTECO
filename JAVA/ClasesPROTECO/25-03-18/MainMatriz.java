import java.util.Scanner;
public class MainMatriz{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int des = 0;
		System.out.println("Ingresa el numero de renglones y columnas de la matriz a y b: ");
		Matriz a = new Matriz(teclado.nextInt());
		Matriz b = new Matriz(a.renglones);
		System.out.println("Llenando matriz a");
		a.llenarMatriz();
		System.out.println("Lenando matriz b");
		b.llenarMatriz();
		while (des != 4){
			System.out.printf("\n\n\nQue desea hacer?\n\t1)Sumar matrices\n\t2)Restar matrices\n\t3)Multiplicar matrices\n\t4)Salir\n\n\n");	
			des = teclado.nextInt();
			switch (des){
				case 1:
					a.imprimirOperacion(a, b, a.suma(a, b));
					break;
				case 2:
					a.imprimirOperacion(a, b, a.resta(a,b));
					break;
				case 3:
					a.imprimirOperacion(a, b, a.multiplicacion(a,b));
			}
		}
	}
}