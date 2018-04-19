public class Barco extends VehiculoAcuatico{
	public Barco(String nombre){
		super(nombre);
	}
	public void encenderMotores(){
		System.out.println("Encendiendo motores...");
	}
	@Override
	public void navegar(){
		System.out.println("Soy un barco we xd y me llamo " + nombre);
	}
}