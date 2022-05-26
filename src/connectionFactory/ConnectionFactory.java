package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {

	private String schemaOracle = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private String user = JOptionPane.showInputDialog("Digite usuário: ");
	private String password = JOptionPane.showInputDialog("Digite senha: ");

	public Connection conectarOracle() {

		try {
			return DriverManager.getConnection(schemaOracle, user, password);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar");
			throw new RuntimeException(e);
		}
	}
	
}
