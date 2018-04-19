import java.util.Random;
public class Dado{

	Random cara;

	public int tirar(){
		return cara.nextInt(6)+1;
	}
}