import java.util.Scanner;
public class Calculadora{
	public void sumar(){
		Scanner teclado = new Scanner(System.in);
			System.out.println("Ingresa el primer numero:");
			Double a = teclado.nextDouble();
			System.out.println("Ingresa el numero a sumar");
			try{
				Double b = teclado.nextDouble();
				System.out.println("La suma de " + a + " + " + b + " es: " + (a+b));
			} catch(NumberFormatException ex){
				System.out.println("No se soportan las cadenas o caracteres no numericos");
				return;
			}
				
	}

	public void restar(){
		Scanner teclado = new Scanner(System.in);
		try{
			System.out.println("Ingresa el primer numero:");
			Double a = teclado.nextDouble();
			try{
				System.out.println("Ingresa el numero a restar");
				Double b = teclado.nextDouble();
				System.out.println("La resta de " + a + " - " + b + " es: " + (a-b));
			} catch(NumberFormatException ex){
				System.out.println("No se soportan las cadenas o caracteres no numericos");
			} 
		} catch(NumberFormatException ex){
			System.out.println("No se soportan las cadenas o caracteres no numericos");
		} 
	}

	public void multiplicar(){
		Scanner teclado = new Scanner(System.in);
		try{
			System.out.println("Ingresa el primer numero a multiplicar:");
			Double a = teclado.nextDouble();
			try{
				System.out.println("Ingresa el numero a multiplicar");
				Double b = teclado.nextDouble();
				System.out.println("La multiplicacion de " + a + "x+ " + b + " es: " + (a*b));
			} catch(NumberFormatException ex){
				System.out.println("No se soportan las cadenas o caracteres no numericos");
			} 
		} catch(NumberFormatException ex){
			System.out.println("No se soportan las cadenas o caracteres no numericos");
		} 
	}

	public void dividir(){
		Scanner teclado = new Scanner(System.in);
		try{
			System.out.println("Ingresa el dividendo:");
			Double a = teclado.nextDouble();
			try{
				System.out.println("Ingresa el divisor:");
				Double b = teclado.nextDouble();
				if(b==0){
					System.out.println("No se permite la division entre cero");
					return;	
				}					
			try{
				Double c = a/b;
				System.out.println("La division de " + a + " / " +  b  +  " es:" + (a/b));
				} catch(ArithmeticException ex){
				System.out.println("No es posible dividir entre cero...");
				}				
			} catch(NumberFormatException ex){
			System.out.println("No se soportan las cadenas o caracteres no numericos");
			}
		} catch(NumberFormatException ex){
			System.out.println("No se soportan las cadenas o caracteres no numericos");
		} 				
	}

	public void menu(){
		
	}

	public Calculadora(){

	}
}
