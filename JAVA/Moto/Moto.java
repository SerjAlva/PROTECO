public class Moto{
	private String color;
	private String marca;
	private int modelo;

	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public int getModelo(){
		return modelo;
	}
	public void setModelo(int modelo){
		this.modelo = modelo;
	}

	public void Encender(){
		System.out.println("Encendiendo...");
	}

	public void Apagar(){
		System.out.println("Apagando...");
	}

	public int Kilometraje(){
		return 100000;
	}

	public void Fuel(int cantidad){
		System.out.printf("Tu moto ahora tiene %d litros de gas\n\n", cantidad);
	}

	Moto(){
		modelo = 97;
		marca = "Harley Davidson";
		color = "Negro";
	}

	Moto(String marca, String color, int modelo){
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}
}