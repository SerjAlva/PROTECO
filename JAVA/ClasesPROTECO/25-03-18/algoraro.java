import javax.swing.*; 
import java.awt.event.*; 

class Ventana extends JFrame { 
public Ventana() { 
setSize(400, 400); 
setTitle("Titulo de la Ventana"); 
setVisible(true); 
addWindowListener(new ObservadorVentana(this)); 
addKeyListener(new KeyAdapter() { 
public void keyReleased(KeyEvent e) { 
boolean ControlPres = (e.getModifiers() & 
KeyEvent.CTRL_MASK) != 0; 
if (e.getKeyCode()==67) { 
//este mensaje solo es de muestra, aca 
//debes de colocar todo el 
//codigo que cierre tu programa. 
JOptionPane.showMessageDialog(null, 
"Presione control + c", 
"Consulta Web", 
JOptionPane.INFORMATION_MESSAGE); 
} 
} 
}); 
} 
} 

class EventosDeVentana extends JFrame { 
public static void main(String args[]) { 
Ventana ventana = new Ventana(); 
} 
} 