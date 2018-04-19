public class MainCarros{
	public static void main(String[] args) {
		CarroCamaro miCamaro = new CarroCamaro("1997", 1000D, 1.6);
		CarroBMW miBMW = new CarroBMW("2016", 987.75, 1.5);

		System.out.println(miCamaro.toString());
		miCamaro.encender();
		miCamaro.estado();
		miCamaro.apagar();
		System.out.println(miBMW.toString());
		miBMW.encender();
		miBMW.estado();
		miBMW.apagar();	
	}
}