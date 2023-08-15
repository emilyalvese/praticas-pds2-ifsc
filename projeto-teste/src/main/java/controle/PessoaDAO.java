package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaDAO {

	public ArrayList<Pessoa> listar() {
		ConexaoBanco c = ConexaoBanco.getInstacia();

		Connection con = c.conectar();
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		String query = "SELECT * FROM pessoa";

		try {
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int idPessoa = rs.getInt("id_pessoa");
				String primeiroNOme = rs.getString("primerio_nome");

				Pessoa p = new Pessoa();
				p.setId(idPessoa);
				p.setPrimeiro_nome(primeiroNOme);

				pessoas.add(p);

			}

			c.fecharConexao();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pessoas;
	}

	public boolean inserir(Pessoa p) {

		ConexaoBanco c = ConexaoBanco.getInstacia();

		Connection con = c.conectar();

		String query = "INSERT INTO pessoa " + "(id_pessoa, primeiro_nome) " + "VALUES (?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, p.getId());
			ps.setString(2, p.getPrimeiro_nome());

			ps.executeUpdate();

			c.fecharConexao();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}