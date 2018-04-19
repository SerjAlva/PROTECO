import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JComponent;


public class Lienzo extends JComponent implements Runnable{
	Map<String, Point> palabras;
	ArrayList<String> lista = new ArrayList<String>();
	String palabraUsuario;
	int score;

	public Lienzo(){
		setPreferredSize(new Dimension(800, 600));
		palabraUsuario = "";
		palabras = new HashMap<String, Point>();
		setFocusable(true);//El componente podrá estar en primer plano
		requestFocus();//Coloca el componente en primer plano
		llenaLista();
		Collections.shuffle(lista);
		addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e){
				switch(e.getKeyCode()){
					case KeyEvent.VK_ENTER:
						compararPalabra();
						break;
					default:
						palabraUsuario += e.getKeyChar();
						break;
				}
			}
		});
	}
	private void llenaLista(){
		lista.add("hola");
		lista.add("adios");
		lista.add("gato");
		lista.add("zordo");
		lista.add("manco");

	}

	private void compararPalabra(){
		if(palabras.containsKey(palabraUsuario)){
			score++;
			palabras.remove(palabraUsuario);
		}
		palabraUsuario = "";
	}

	public void agregarPalabraMapa(){
		if(lista.size() > 0){
			String s = lista.get(0);
			lista.remove(0);
			int x = new Random().nextInt(600);//Coordenada x aleatoria
			palabras.put(s, new Point(x, 0));
		}
	}
	@Override
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawString("Score: " + score, 10, 10);
		for(String s : palabras.keySet()){ //KeySet es devuelve el conjunto(set) de llaves en palabras
			g2d.setColor(Color.RED);
			g2d.fillRect(palabras.get(s).x, palabras.get(s).y, s.length()*20, 40);
			g2d.setColor(Color.WHITE);
			Font f = new Font("Helvetica", Font.PLAIN, 24);
			g2d.setFont(f);
			g2d.drawString(s, palabras.get(s).x + 20, palabras.get(s).y + 20);
		}
	}

	@Override
	public void run(){
		long referencia = new Date().getTime();
		while(true){
			for (String s : palabras.keySet()) {
				palabras.get(s).y += 2;
			}
			if(new Date().getTime() - referencia >= 1500){
				agregarPalabraMapa();
				referencia = new Date().getTime();
			}
			repaint();
			try{
				Thread.sleep(40);
			} catch(InterruptedException e){}
		}
	}
}