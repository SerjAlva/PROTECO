public class Mostrar{
	Mostrar(Rectangulo r){
		System.out.println();
		System.out.println("Las caracteristicas del rectangulo son: ");
		System.out.println("Base = " + r.getBase());
		System.out.println("Altura = " + r.getAltura());
		System.out.println("Area = " + r.calcularArea());
		System.out.println("Perimetro = " + r.calcularPerimetro());
		System.out.println();
	}
}