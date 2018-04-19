import java.util.Math;
public class Circulo{
	public Double radio;

	public Double area(){
		return Math.pow(Math.PI*radio,2);
	}

	public Double perimetro(){
		return Math.PI*2*radio;
	}

	public Circulo(Double radio){
		this.radio = radio;
	}
}