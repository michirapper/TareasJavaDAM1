import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.Font;

public class Fromulario extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Fromulario window = new Fromulario();
	}

	/**
	 * Create the application.
	 */
	public Fromulario() {
		setBounds(100, 100, 994, 504);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(93, 335, 85, 21);
		getContentPane().add(btnAdd);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(410, 335, 85, 21);
		getContentPane().add(btnModify);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(748, 335, 85, 21);
		getContentPane().add(btnDelete);
		
		textField = new JTextField();
		textField.setBounds(23, 234, 312, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(345, 234, 293, 28);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(651, 234, 293, 28);
		textField_2.setColumns(10);
		getContentPane().add(textField_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 23, 909, 176);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));l
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nombre", "Apellido", "Telefono"
			}
		));
		scrollPane.setViewportView(table);
		setVisible(true);
	}
}
