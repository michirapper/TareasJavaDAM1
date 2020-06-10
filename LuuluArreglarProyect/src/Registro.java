import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class Registro extends JFrame {
	private Controlador miControlador;

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtEmail;
	private JTextField txtDni;
	private JTextField txtContrasena;
	private JTextField txtComprobarContrasena;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFotoperfil;

	public Registro() {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 559);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goLogin();
			}
		});
		btnAceptar.setBounds(34, 436, 89, 23);
		contentPane.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goLogin();
			}
		});
		btnCancelar.setBounds(227, 436, 89, 23);
		contentPane.add(btnCancelar);

		JCheckBox chckbxAceptaLosTerminos = new JCheckBox("Acepta los terminos y condiciones del usuario");
		chckbxAceptaLosTerminos.setBounds(10, 385, 348, 23);
		contentPane.add(chckbxAceptaLosTerminos);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(10, 23, 76, 14);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(10, 40, 188, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(10, 88, 188, 20);
		contentPane.add(txtApellidos);

		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellidos.setBounds(10, 71, 76, 14);
		contentPane.add(lblApellidos);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(10, 119, 76, 14);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 136, 188, 20);
		contentPane.add(txtEmail);

		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDni.setBounds(10, 164, 76, 14);
		contentPane.add(lblDni);

		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(10, 181, 188, 20);
		contentPane.add(txtDni);

		JLabel lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContrasena.setBounds(10, 212, 113, 14);
		contentPane.add(lblContrasena);

		txtContrasena = new JTextField();
		txtContrasena.setColumns(10);
		txtContrasena.setBounds(10, 229, 188, 20);
		contentPane.add(txtContrasena);

		JLabel lblComprobarContrasena = new JLabel("Confirmar contrase\u00F1a:");
		lblComprobarContrasena.setForeground(Color.WHITE);
		lblComprobarContrasena.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblComprobarContrasena.setBounds(10, 260, 188, 14);
		contentPane.add(lblComprobarContrasena);

		txtComprobarContrasena = new JTextField();
		txtComprobarContrasena.setColumns(10);
		txtComprobarContrasena.setBounds(10, 277, 188, 20);
		contentPane.add(txtComprobarContrasena);

		JRadioButton rdbtnAlumno = new JRadioButton("Alumno");
		buttonGroup.add(rdbtnAlumno);
		rdbtnAlumno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAlumno.setBounds(40, 322, 109, 23);
		contentPane.add(rdbtnAlumno);

		JRadioButton rdbtnProfesor = new JRadioButton("Profesor");
		buttonGroup.add(rdbtnProfesor);
		rdbtnProfesor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnProfesor.setBounds(207, 322, 109, 23);
		contentPane.add(rdbtnProfesor);
		
		textFotoperfil = new JTextField();
		textFotoperfil.setBounds(221, 68, 122, 156);
		contentPane.add(textFotoperfil);
		textFotoperfil.setColumns(10);
		
		JButton btnFotoperfil = new JButton("Cargar foto de perfil");
		btnFotoperfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFotoperfil.setBounds(208, 228, 150, 23);
		contentPane.add(btnFotoperfil);
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void goLogin() {
		miControlador.goLoginRegistro();
	}
}
