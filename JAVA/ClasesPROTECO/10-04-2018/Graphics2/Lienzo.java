import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Lienzo extends JPanel{
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g); //Esta línea es necesaria para pintar sí o sí men
		Graphics2D g2d = (Graphics2D)g;
		//Pinta líneas con parámetros (x1, y1, x2, y2);
		g2d.drawLine(30,30, 200,30);
		g2d.drawLine(200,30, 30,200);
		g2d.drawLine(30,200, 200,200);
		g2d.drawLine(200,200, 30,30);
	}
}