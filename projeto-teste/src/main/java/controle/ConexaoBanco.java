package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

	private static Connection conexao;
	private static ConexaoBanco instancia;
	private static final String DATABASE = "projeto_teste";
	private static final String USER     = "root";
	private static final String PSW      = "aluno";
	
	public ConexaoBanco() {}
	
	public static ConexaoBanco getInstacia() {
		if (instancia == null) { 
			instancia = new ConexaoBanco(); 
		}
		return instancia;	
	}
	
	public static Connection conectar() {
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/"+ DATABASE + "?serverTimezone=UTC", USER, PSW);
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		return conexao;		
	}
	
	public boolean fecharConexao() { 
		try { 
			conexao.close(); 
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
}