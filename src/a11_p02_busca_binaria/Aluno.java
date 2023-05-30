package a11_p02_busca_binaria;

public class Aluno implements Comparable {

	private String nome;
	private String email;
	private float nota;
	
	public Aluno(String nome, float nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void aprovar() {
		System.out.println(this.nome + " aprovado!");
	}
	
	@Override
	public String toString() {
		return this.nome + " (" + this.nota + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Aluno) {
			Aluno outroAluno = (Aluno) obj;
			return this.nota == outroAluno.nota;
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Aluno) {
			Aluno obj = (Aluno) o;
			if (this.nota > obj.nota) {
				return 1;
 			} else if (this.nota < obj.nota) {
 				return -1;
 			} else {
 				return 0;
 			}
		}
		return 0;
	}
}
