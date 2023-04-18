package a04_p02_atributo_qtd;

public class Aluno {

	private String nome;
	private String email;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return this.nome + " (" + this.email + ")";
	}
}
