package a07_p03_interface_e_generics;

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
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Aluno) {
			Aluno outroAluno = (Aluno) obj;
			return this.nome.equals(outroAluno.nome);
//					&& this.email.equals(outroAluno.email);
		}
		return false;
	}
}
