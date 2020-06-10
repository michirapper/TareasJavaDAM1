import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class pantallaPrincipalPlantilla extends JFrame {
	private Controlador miControlador;

	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnNotas;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private ImageIcon imagenBoton;
	private Icon iconoBoton;

	public pantallaPrincipalPlantilla() {
		setTitle("Cambio contraseña");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnEmpresas = new JButton("EMPRESAS");
		btnEmpresas.setBounds(196, 11, 115, 55);
		getContentPane().add(btnEmpresas);

		btnAlumnos = new JButton("ALUMNOS");
		btnAlumnos.setBounds(321, 11, 112, 55);
		getContentPane().add(btnAlumnos);

		btnNotas = new JButton("NOTAS");
		btnNotas.setBounds(443, 11, 90, 55);
		getContentPane().add(btnNotas);

		btnPerfil = new JButton("");
		btnPerfil.setIcon(new ImageIcon(getClass().getResource("/img/fotoPerfil.png")));
		btnPerfil.setBounds(900, 11, 55, 55);
		getContentPane().add(btnPerfil);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(775, 11, 115, 23);
		contentPane.add(btnCerrarSesion);
		
		JButton btnAsegnarEmpresas = new JButton("ASIGNAR EMPRESAS");
		btnAsegnarEmpresas.setBounds(543, 11, 182, 55);
		contentPane.add(btnAsegnarEmpresas);
		
		JButton btnAgregarEmpresa = new JButton("AGREGAR EMPRESA");
		btnAgregarEmpresa.setBounds(29, 11, 151, 55);
		contentPane.add(btnAgregarEmpresa);
	}
}