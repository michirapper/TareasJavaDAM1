package tablasSwingTEST;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TablasSwing extends JFrame {

	private JPanel contentPane;
	private JTable tabla;
	private DefaultTableModel modelo;
	private JButton btnAlta, btnBaja, btnModificar, btnFin;
	private JTextField txtUsr, txtPwd;

	public static void main(String[] args) {
		TablasSwing frame = new TablasSwing();
		frame.setVisible(true);
	}

	public TablasSwing() {
		setTitle("Tablas Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1041, 564);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tabla.getSelectionModel().clearSelection();
				limpiarCampos();
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(212, 58, 517, 260);
		contentPane.add(scrollPane);

		tabla = new JTable();
		tabla.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int fila = tabla.getSelectedRow();
				txtUsr.setText((String) modelo.getValueAt(fila, 0));
				txtPwd.setText((String) modelo.getValueAt(fila, 1));
				updateBaja();
				updateModificar();
			}
		});
		modelo = new DefaultTableModel(
				new Object[][] { { "Pedro", "123" }, { "Admin", "Secreto" }, { "Camacho", "oculto" }, },
				new String[] { "Usr", "Pwd" });
		tabla.setModel(modelo);
		scrollPane.setViewportView(tabla);

		btnAlta = new JButton("Alta");
		btnAlta.setEnabled(false);
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.addRow(new String[] { txtUsr.getText(), txtPwd.getText() });
				limpiarCampos();
			}
		});
		btnAlta.setBounds(150, 386, 89, 23);
		contentPane.add(btnAlta);

		btnBaja = new JButton("Baja");
		btnBaja.setEnabled(false);
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.removeRow(tabla.getSelectedRow());
				limpiarCampos();
			}
		});
		btnBaja.setBounds(368, 386, 89, 23);
		contentPane.add(btnBaja);

		btnModificar = new JButton("Modificar");
		btnModificar.setEnabled(false);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = tabla.getSelectedRow();
				modelo.setValueAt(txtUsr.getText(), fila, 0);
				modelo.setValueAt(txtPwd.getText(), fila, 1);
				limpiarCampos();
			}
		});
		btnModificar.setBounds(585, 386, 89, 23);
		contentPane.add(btnModificar);

		btnFin = new JButton("Fin");
		btnFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFin.setBounds(804, 386, 89, 23);
		contentPane.add(btnFin);

		txtUsr = new JTextField();
		txtUsr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateAlta();
				updateModificar();
			}
		});
		txtUsr.setBounds(158, 340, 260, 20);
		contentPane.add(txtUsr);
		txtUsr.setColumns(10);

		txtPwd = new JTextField();
		txtPwd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateAlta();
				updateModificar();
			}
		});
		txtPwd.setColumns(10);
		txtPwd.setBounds(534, 340, 260, 20);
		contentPane.add(txtPwd);
	}

	private void updateAlta() {
		if (txtPwd.getText().length() == 0 || txtUsr.getText().length() == 0) {
			btnAlta.setEnabled(false);
		} else {
			btnAlta.setEnabled(true);

		}
	}

	private void updateBaja() {
		if (tabla.getSelectedRow() == -1) {
			btnBaja.setEnabled(false);
		} else {
			btnBaja.setEnabled(true);
		}
	}

	private void updateModificar() {
		if (txtPwd.getText().length() == 0 || txtUsr.getText().length() == 0 || tabla.getSelectedRow() == -1) {
			btnModificar.setEnabled(false);
		} else {
			btnModificar.setEnabled(true);

		}
	}

	protected void limpiarCampos() {
		txtUsr.setText("");
		txtPwd.setText("");
		updateAlta();
		updateBaja();
		updateModificar();
	}
}
