package ConexaoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class SingleConnection {

	private static String url = "jdbc:postgresql://localhost:5434/posjava";
	private static String password = "Kleber01@";
	private static String user = "postgres";
	private static Connection connection = null;
	
	static {
		conectar();
	}

	public SingleConnection() {
		conectar();
	}
//
	private static void conectar() {
		try {
			
			if (connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);//não salvará os dados automaticamente isso sera feito por mim
				System.out.println("conectou com sucesso");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	public static Connection getConnection() {
		return connection;
	}

}
