package conexion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class ConexionSQL {

	private Connection conexion;
	private String bd = "lauulu";
	private String login = leerAchivo("./src/conexion/DatosConexion.ini", 0);
	private String pwd = leerAchivo("./src/conexion/DatosConexion.ini", 1);
	private String url = leerAchivo("./src/conexion/DatosConexion.ini", 2)+bd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public Connection conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println("-> Conexión con MySQL establecida");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver JDBC No encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la BD");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error general de Conexión");
			e.printStackTrace();
		}
		return conexion;
	}

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
}
