public class Main{
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(10D, 20D);
		Rectangulo r2 = new	Rectangulo(20D, 50D);
		Rectangulo r3 = r1.agrandar(10);

		System.out.println();
		System.out.println("Rectangulo uno...");
		new Mostrar(r1);
		System.out.println("Rectangulo dos...");
		new Mostrar(r2);
		System.out.println("Rectangulo agrandado...");
		new Mostrar(r3);		
	}
}