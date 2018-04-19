import java.util.Scanner;
public class MainCalculadora{
	public static void main(String[] args) {
	Calculadora miCalcu = new Calculadora();
	int des = 0;
		Scanner teclado = new Scanner(System.in);
		while (des != 5){
			System.out.printf("\n\n\nQue desea hacer?\n\t1)Sumar dos numeros\n\t2)Restar dos numeros\n\t3)Multiplicar dos numeros\n\t4)Dividir dos numeros\n\t5)Salir\n\n");
			try{
				des = teclado.nextInt();
			} catch(NumberFormatException ex){
				System.out.println("No se soportan las cadenas o caracteres no numericos");
				des = 0;
			}
			switch (des){
				case 1:
					miCalcu.sumar();
					break;
				case 2:
					miCalcu.restar();
					break;
				case 3:
					miCalcu.multiplicar();
					break;
				case 4:
					miCalcu.dividir();
					break;
				case 6:
					try{Double b = teclado.nextDouble();} catch(java.util.InputMismatchException ex){System.out.println("Nmms numeros wey");}
					break;
			}
		}	
	}
}