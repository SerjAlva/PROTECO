import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana(){
		super("Juego");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		Lienzo lienzo = new Lienzo();
		add(lienzo);
		Thread t = new Thread(lienzo);
		t.start();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ventana();
	}
}