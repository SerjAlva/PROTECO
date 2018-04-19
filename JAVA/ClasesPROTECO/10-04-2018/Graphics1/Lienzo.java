import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Lienzo extends JPanel{
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g); //Esta línea es necesaria para pintar sí o sí men
		Graphics2D g2d = (Graphics2D)g;
		//Muestra la cadena en coordenadas (10,20)
		g2d.drawString("Hola mundo", 10, 20);
	}
}