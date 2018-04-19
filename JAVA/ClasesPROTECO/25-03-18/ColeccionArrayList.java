import java.util.ArrayList;
public class ColeccionArrayList{
	public static void main(String[] args) {
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("rojo");
		elementos.add(0, "azul");

		for (int i = 0; i < elementos.size(); i++){
			System.out.printf("%s\n", elementos.get(i));
		}

		elementos.remove("rojo");
		System.out.println("\n\nArrayList modificado...");
		for (int i = 0; i < elementos.size(); i++){
			System.out.printf("%s\n", elementos.get(i));
		}
	}
}