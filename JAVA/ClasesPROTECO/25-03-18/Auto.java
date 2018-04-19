import java.util.Scanner;
public class Auto{
	private int modelo;
	private String color;
	private String marca;
	public Boolean encendido = false;
	public Boolean apagado = true;

	Scanner teclado = new Scanner(System.in);

	public void setModelo(int modelo){
		if (modelo <= 1960)
			this.modelo = 2000;
		else
			this.modelo = modelo;
	}

	public int getModelo(){
		return modelo;
	}

	public void setColor(String color){
		if (color == null)
			this.color = "Negro";
		else
			this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setMarca(String marca){
		if (marca == null)
			this.marca = "Ford";
		else
			this.marca = marca;
	}

	public String getMarca(){
		return marca;
	}

	public void encender(){
		if (encendido == false){
		System.out.println("Tu vehiculo esta encendido");
		encendido = true;
		apagado = false;
		}
		else
		System.out.println("Tu vehiculo ya estaba encendido...");
	}

	public void apagar(){
		if (apagado == false){
			System.out.println("Apagando...");
			apagado = true;
			encendido = false;
		}
		else
		System.out.println("Tu vehiculo ya estaba apagado...");
	}

	public void kmh(){
		if(!encendido){
			System.out.println("Tu vehiculo esta reposo porque esta apagado");
			return;
		}
		Double velocidad;
		System.out.println("Ingresa las RPM indicadas en tu automovil");
		int rpm = teclado.nextInt();
		System.out.println("Ingresa el diametro entero y externo de las llantas de tu vehiculo, si no lo conoces ingresa 0");
		int diametro = teclado.nextInt(); 
		if (rpm == 1000) //1000 rpm indican que el auto se encuentra en neutral...
			System.out.println("Tu vehiculo esta en reposo");
		else{
			if (diametro == 0)	
				velocidad = (rpm*622*60)/(2*3.1416*1000000); //622 Es el diametro en mm default standar
			else
				velocidad = (rpm*diametro*60)/(2*3.1416*1000000);
			System.out.println("Tu vehiculo va a " + velocidad + "km/h");
		}
		

	}

	public Auto(){
		modelo = 1980;
		color = "Negro";
		marca = "Chevrolet";
	}

	public Auto(int modelo, String color, String marca){
		this.modelo = modelo;
		this.color = color;
		this.marca = marca;
	}
}