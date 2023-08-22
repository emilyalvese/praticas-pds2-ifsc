package modelo;

public class Pessoa {
	private int id_pessoa;
	private String primeiro_nome;
	private int idade;
	public int getId() {
		return id_pessoa;
	}
	public void setId(int id) {
		this.id_pessoa = id;
	}
	public String getPrimeiro_nome() {
		return primeiro_nome;
	}
	public void setPrimeiro_nome(String primeiro_nome) {
		this.primeiro_nome = primeiro_nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}