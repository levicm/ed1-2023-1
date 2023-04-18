package a04_p04_generalizacao;

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
	
	public void aprovar() {
		System.out.println(this.nome + " aprovado!");
	}
	
	@Override
	public String toString() {
		return this.nome + " (" + this.email + ")";
	}
}
