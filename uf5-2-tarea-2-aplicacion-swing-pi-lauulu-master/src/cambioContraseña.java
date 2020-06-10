import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class cambioContraseña extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public cambioContraseña() {
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblUsuario.setBounds(35, 35, 70, 14);
		getContentPane().add(lblUsuario);
		
		JLabel lblNuevaContrasea = new JLabel("Nueva contrase\u00F1a:");
		lblNuevaContrasea.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNuevaContrasea.setBounds(35, 77, 137, 14);
		getContentPane().add(lblNuevaContrasea);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a:");
		lblConfirmarContrasea.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblConfirmarContrasea.setBounds(35, 117, 158, 14);
		getContentPane().add(lblConfirmarContrasea);
		
		textField = new JTextField();
		textField.setBounds(202, 35, 167, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 77, 167, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(203, 117, 167, 20);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(335, 227, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(35, 227, 89, 23);
		getContentPane().add(btnCancelar);
		
	}
}

