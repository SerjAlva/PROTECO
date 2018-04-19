import java.util.ArrayList;
import java.util.Scanner;
public class PrebeList{
	ArrayList<String> productos = new ArrayList<String>();
	ArrayList<Double> precios = new ArrayList<Double>();
	Double total = 0D;
	public final Double max = 500.00;

	public void desplegar(){
		System.out.printf("|   Indice   |  Producto  |   Precio   |\n");
		for(int i = 0; i < productos.size(); i++){
			System.out.printf("|   %6d   |", i);
			System.out.printf("  %8s  |", productos.get(i));
			System.out.printf("   %6.2f  |\n", (precios.get(i)));
		}
		System.out.printf("                     Total:   %6.2f\n\n", total);
	}

	public void removerItem(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el indice del elemento que desea eliminar");
		int index = teclado.nextInt();
		String producto = productos.remove(index);
		Double precio = precios.remove(index);
		total -= precio;
		System.out.println("Se ha removido " + producto + " y se han ahorrado $" + precio);
	}

	public void anadirItem(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto que desea agregar");
		String producto = teclado.next();
		System.out.println("Ingrese el precio de " + producto);
		Double precio = teclado.nextDouble(); 
		productos.add(producto);
		precios.add(precio);
		total += precio;
		System.out.println("Se ha anadido " + productos.get(productos.size()-1) + " con un precio de $" + precios.get(precios.size()-1));
	}

	public Boolean comprar(){
		if(total <= max){
			System.out.println("Gracias por su compra!");
			return true;
		}
		else{
			System.out.println("El total es de $" + total + " y tu solo tienes $" + max + "...");
			System.out.println("Por favor, deja algunos productos e intentalo de nuevo");
			return false;
		}
	}

	public PrebeList(){

	}

}