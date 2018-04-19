public class CarroBMW extends Carro{
	private String modelo = "BMW";

	public String toString(){
		return String.format("El modelo es %s\nEl peso es: %.2f\nLa altura es: %,2f\n",modelo, getPeso(), getAltura());
	}

	public CarroBMW(String modelo, Double peso, Double altura){
		super(peso, altura);
		this.modelo = modelo;
	}
}