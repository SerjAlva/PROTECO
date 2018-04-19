public class PruebaMoto{
	public static void main(String[] args) {
		Moto miMoto = new Moto();
		Moto miBebe = new Moto("BMW", "Azul", 99);

		miBebe.Encender();
		System.out.printf("\nTu moto modelo %s ha recorrido %d kilometros\n\n", miBebe.getMarca(), miBebe.Kilometraje());
		miBebe.Fuel(20);
		miBebe.Apagar();
	}
}