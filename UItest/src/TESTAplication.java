import javax.swing.*;

public class TESTAplication extends JFrame {

	public TESTAplication() {

		// Parametros asociados a la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		setTitle("Ejemplo JTabbedPane");

		// Creamos el conjunto de pesta�as
		JTabbedPane pesta�as = new JTabbedPane();

		// Creamos el panel y lo a�adimos a las pesta�as
		JPanel panel1 = new JPanel();

		// Componentes del panel1
		JLabel et_p1 = new JLabel("Estas en el panel 1");
		panel1.add(et_p1);

		// A�adimos un nombre de la pesta�a y el panel
		pesta�as.addTab("Panel 1", panel1);

		// Realizamos lo mismo con el resto
		JPanel panel2 = new JPanel();
		pesta�as.addTab("Panel 2", panel2);

		// Componentes del panel2
		JLabel et_p2 = new JLabel("Estas en el panel 2");
		panel2.add(et_p2);

		JPanel panel3 = new JPanel();

		// Componentes del panel3
		JLabel et_p3 = new JLabel("Estas en el panel 3");
		panel3.add(et_p3);

		pesta�as.addTab("Panel 3", panel3);

		JPanel panel4 = new JPanel();

		// Componentes del panel4
		JLabel et_p4 = new JLabel("Estas en el panel 4");
		panel4.add(et_p4);

		pesta�as.addTab("Panel 4", panel4);

		getContentPane().add(pesta�as);
	}

	public static void main(String[] args) {

		TESTAplication ventana = new TESTAplication();

	}

}