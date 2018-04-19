import java.util.Scanner;
public class MainPrebeList{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		PrebeList prebemart = new PrebeList();
		int des = 0;

		System.out.println("Bienvenido a PrebeMart, eliga una de las siguientes opciones:");
		while(des != 5){
			System.out.printf("\n\n\t1)Anadir producto\n\t2)Remover producto\n\t3)Desplegar lista de compras\n\t4)Comprar\n\t5)Salir\n");
			des = teclado.nextInt();
			switch (des){
				case 1:
					prebemart.anadirItem();
					break;
				case 2:
					prebemart.desplegar();
					prebemart.removerItem();
					break;
				case 3:
					prebemart.desplegar();
					break;
				case 4:
					if(prebemart.comprar()){
						des = 5;
						break;
					}
					else{
						prebemart.desplegar();
						prebemart.removerItem();
					}
					break;
			}
		}

	}
}