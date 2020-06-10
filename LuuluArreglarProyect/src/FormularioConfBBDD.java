import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

public class FormularioConfBBDD extends JFrame {
	private Controlador miControlador;

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField ttxUsrBBDD;
	private JTextField txtPwdBBDD;
	private JTextArea txtUrlBBDD;
	
	public static String leerAchivo(String fichero, int num) {
		FileReader fr = null;
		BufferedReader br = null;
		String salida = "";
		try {
			fr = new FileReader(fichero);
			br = new BufferedReader(fr);
			String linea;
			int contLinea = 0;
			while ((linea = br.readLine()) != null) {
				if (num == contLinea) {
					salida = linea;
				}
				contLinea++;
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}

	public FormularioConfBBDD() {
		setTitle("Configuracion Base de datos");
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
		btnAceptar.setBounds(265, 486, 89, 23);
		contentPane.add(btnAceptar);
		
		ttxUsrBBDD = new JTextField(leerAchivo("./src/conexion/DatosConexion.ini", 0));
		ttxUsrBBDD.setBounds(44, 120, 140, 23);
		contentPane.add(ttxUsrBBDD);
		ttxUsrBBDD.setColumns(10);
		
		txtPwdBBDD = new JTextField(leerAchivo("./src/conexion/DatosConexion.ini", 1));
		txtPwdBBDD.setBounds(44, 233, 140, 23);
		contentPane.add(txtPwdBBDD);
		txtPwdBBDD.setColumns(10);
		
		txtUrlBBDD = new JTextArea(leerAchivo("./src/conexion/DatosConexion.ini", 2));
		txtUrlBBDD.setBounds(44, 316, 235, 83);
		contentPane.add(txtUrlBBDD);
		
		JLabel lblUsrBBDD = new JLabel("Usuario:");
		lblUsrBBDD.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUsrBBDD.setBounds(45, 95, 89, 14);
		contentPane.add(lblUsrBBDD);
		
		JLabel lblPwdBBDD = new JLabel("Contrase\u00F1a:");
		lblPwdBBDD.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPwdBBDD.setBounds(44, 208, 104, 14);
		contentPane.add(lblPwdBBDD);
		
		JLabel lblUrlBBDD = new JLabel("Url:");
		lblUrlBBDD.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUrlBBDD.setBounds(44, 291, 46, 14);
		contentPane.add(lblUrlBBDD);
		
		String inputUser = leerAchivo("./src/conexion/DatosConexion.ini", 0);
		String inputPass = leerAchivo("./src/conexion/DatosConexion.ini", 1);
		String inputLink = leerAchivo("./src/conexion/DatosConexion.ini", 2);
		
		JButton btnSaveBBDD = new JButton("Guardar");
		btnSaveBBDD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				modifyFile(inputUser, ttxUsrBBDD.getText());
				if(inputPass == "") {
					modifyFile(" ", txtPwdBBDD.getText());					
				}else {
					modifyFile(inputPass, txtPwdBBDD.getText());
				}
				modifyFile(inputLink, txtUrlBBDD.getText());
				
			}
		});
		btnSaveBBDD.setBounds(146, 486, 89, 23);
		contentPane.add(btnSaveBBDD);
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	public void goLogin() {
		miControlador.goLoginFormularioConfBBDD();
	}
	static void modifyFile(String oldString, String newString)
    {
        File fileToBeModified = new File("./src/conexion/DatosConexion.ini");         
        String oldContent = "";         
        BufferedReader reader = null;         
        FileWriter writer = null;         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));            
            String line = reader.readLine();             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();                 
                line = reader.readLine();
            }             
            String newContent = oldContent.replaceAll(oldString, newString);             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {              
                reader.close();                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
	
}
