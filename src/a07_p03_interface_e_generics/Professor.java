package a07_p03_interface_e_generics;

public class Professor {

	private String nome;
	private String email;
	
	public Professor(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void ministrarAula() {
		System.out.println(this.nome + " ministrou aula!");
	}
	
	@Override
	public String toString() {
		return this.nome + " (" + this.email + ")";
	}
}
