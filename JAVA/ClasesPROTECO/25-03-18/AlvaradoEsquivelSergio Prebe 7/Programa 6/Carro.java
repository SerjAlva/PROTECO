public class Carro{
	private Double peso;
	private Double altura;
	public Boolean encendido = false;

	public Double getPeso(){
		return peso;
	}

	public Double getAltura(){
		return altura;
	}

	public void setPeso(Double peso){
		this.peso = peso;
	}

	public void setAltura(Double altura){
		this.altura = altura;
	}

	public void encender(){
		if(encendido)
			System.out.println("Tu auto ya estaba encendido");
		else{
			encendido = true;
			System.out.println("Encendiendo auto...");
		}
	}

	public void apagar(){
		if (!encendido) {
			System.out.println("Tu auto ya estaba apgado");
		}
		else{
			encendido = false;
			System.out.println("Apagando auto...");
		}
	}

	public void estado(){
		if(encendido)
			System.out.println("Tu auto esta encendido");
		else
			System.out.println("Tu auto esta apagado");
	}

	public String toString(){
		return String.format("El peso es: %.2f \nLa altura es: %,2f\n", peso, altura);
	}

	public Carro(Double peso, Double altura){
		this.peso = peso;
		this.altura = altura;
	}
}