import java.util.Math;
public class Hexagono{ //Se trata de un hexagono regular
	public Double lado;

	public Double area(){
		return Math.pow(lado,2)*(3*Math.sqrt(3)/2);
	}

	public Double perimetro(){
		return 6*lado;
	}

	public Hexagono(Double lado){
		this.lado = lado;
	}
}