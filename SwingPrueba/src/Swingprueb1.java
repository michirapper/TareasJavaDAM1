
import javax.swing.*;

public class Swingprueb1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana Hola Mundo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hola Mundo");
		frame.getContentPane().add(label);
		//frame.pack();
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
}
