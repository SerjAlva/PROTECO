import java.util.Scanner;
public class Matriz{
	public int renglones;
	public int columnas;
	public int[][] matriz;

	Scanner teclado = new Scanner(System.in);

	public Matriz(int n){
		this.renglones = n;
		this.columnas = n;
		matriz = new int[renglones][columnas];
	}

	public void llenarMatriz(){
		for (int i = 0; i < renglones; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Ingresa el elmento [" + i + "][" + j + "]");
				matriz[i][j] = teclado.nextInt();
			}			
		}
	}

	public Matriz suma(Matriz a, Matriz b){
		Matriz c = new Matriz(a.renglones);
		for (int i = 0; i < c.renglones; i++){
			for (int j = 0; j < c.columnas; j++) {
				c.matriz[i][j] = a.matriz[i][j] + b.matriz[i][j];
			}
		}
	return c;
	}

	public Matriz resta(Matriz a, Matriz b){
		Matriz c = new Matriz(a.renglones);
		for (int i = 0; i < c.renglones; i++){
			for (int j = 0; j < c.columnas; j++) {
				c.matriz[i][j] = a.matriz[i][j] - b.matriz[i][j];
			}
		}
	return c;
	}

	public Matriz multiplicacion(Matriz a, Matriz b){
		Matriz c = new Matriz(a.renglones);
		int [] v1 = new int[a.renglones];
		int [] v2 = new int[a.renglones];
		for (int i = 0; i < a.renglones ; i++){
			for(int j = 0; j < a.renglones; j++)
				v1[j] = a.matriz[j][i];
			for(int k = 0; k < a.renglones; k++){
				for(int j = 0; j < b.columnas; j++)
					v2[j] = b.matriz[k][j];
				c.matriz[k][i] = a.dot(v1, v2);
			}
		}
	return c;	
	}

	public int dot(int[] a, int[] b){
		int suma = 0;
		for(int i = 0; i<a.length; i++){
			suma+=(a[i] * b[i]);
		}
		return suma;
	}

	public void imprimirOperacion(Matriz a, Matriz b, Matriz c){
		System.out.println("La matriz a");
		for (int i =0; i < a.renglones; i++) {
			for (int j = 0; j < a.columnas ; j++) {
				if ( j == 0 ){
					System.out.printf("|  %5d  ", a.matriz[i][j]);
				}
				else{
					if (j == a.columnas-1){
						System.out.printf("%5d     |\n", a.matriz[i][j]);
					}
					else
						System.out.printf("%5d  ", a.matriz[i][j]);
				}

			}
		}
		System.out.println("y la matriz b");
		for (int i =0; i < b.renglones; i++) {
			for (int j = 0; j < b.columnas ; j++) {
				if ( j == 0 ){
					System.out.printf("|  %5d  ", b.matriz[i][j]);
				}
				else{
					if (j == b.columnas-1){
						System.out.printf("%5d     |\n", b.matriz[i][j]);
					}
					else
						System.out.printf("%5d  ", b.matriz[i][j]);
				}

			}
		}

		System.out.println("Da como resultado");
		for (int i =0; i < c.renglones; i++) {
			for (int j = 0; j < c.columnas ; j++) {
				if ( j == 0 ){
					System.out.printf("|  %5d  ", c.matriz[i][j]);
				}
				else{
					if (j == c.columnas-1){
						System.out.printf("%5d     |\n", c.matriz[i][j]);
					}
					else
						System.out.printf("%5d  ", c.matriz[i][j]);
				}

			}
		}
	}
}