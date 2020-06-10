import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Vista extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;

	private JTextField txtUsr;
	private JPasswordField txtPwd;
	private JButton btnLogin;
	private JLabel lblRespuesta;

	public Vista() {
		setTitle("Login MVC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 314);
		getContentPane().setLayout(null);

		JLabel lblUsr = new JLabel("Usuario");
		lblUsr.setBounds(62, 46, 125, 20);
		getContentPane().add(lblUsr);

		JLabel lblPwd = new JLabel("Contrase\u00F1a");
		lblPwd.setBounds(62, 107, 125, 20);
		getContentPane().add(lblPwd);

		txtUsr = new JTextField();
		txtUsr.setBounds(221, 43, 159, 27);
		getContentPane().add(txtUsr);
		txtUsr.setColumns(10);

		txtPwd = new JPasswordField();
		txtPwd.setColumns(10);
		txtPwd.setBounds(221, 107, 159, 27);
		getContentPane().add(txtPwd);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.login();
			}
		});
		btnLogin.setBounds(126, 165, 178, 27);
		getContentPane().add(btnLogin);

		lblRespuesta = new JLabel("");
		lblRespuesta.setForeground(Color.RED);
		lblRespuesta.setBounds(154, 138, 262, 20);
		getContentPane().add(lblRespuesta);
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public String getUsr() {
		return txtUsr.getText();
	}

	public String getPwd() {
		return String.valueOf(txtPwd.getPassword());
	}

	public void actualizar() {
		String resultado = miModelo.getResultado();
		if (resultado.equals("Correcto")) {
			miControlador.bienvenida();
			
		} else if(resultado.equals("Incorrecto")){
			lblRespuesta.setText("Usuario o contraseña incorrectos");
		}else {
			System.exit(0);
		}
	}
}
