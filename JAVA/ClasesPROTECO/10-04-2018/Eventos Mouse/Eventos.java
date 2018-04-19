import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Eventos extends JFrame{
	JButton boton;
	JLabel etiqueta;
	JPanel panel;
	int contador = 0;

	public Eventos(){
		panel = new JPanel();
		boton = new JButton("Presioname");
		etiqueta = new JLabel();
		agregarElementos();
		crearVentana();
	}

	private void agregarElementos(){
		boton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				contador++;
				etiqueta.setText("" + contador);
			}
		});
		panel.add(boton);
		panel.add(etiqueta);
	}

	private void crearVentana(){
		setLayout(new FlowLayout());
		add(panel);
		setVisible(true);
		setSize(600, 600);
		setResizable(true);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Eventos();
	}
}