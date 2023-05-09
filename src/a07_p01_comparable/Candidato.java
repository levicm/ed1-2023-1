package a07_p01_comparable;

public class Candidato implements Comparable {
	String nome;
	int idade;
	double nota;

	public Candidato(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Candidato(String nome, int idade, double nota) {
		this(nome, idade);
		this.nota = nota;
	}

	@Override
	public String toString() {
		return nome + "(" + idade + ") [" + nota + "]";
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Candidato) {
			Candidato obj = (Candidato) o;
			if (this.nota > obj.nota) {
				return 1;
			} else if (this.nota < obj.nota) {
				return -1;
			} else {
				// Se as notas forem iguais, usa a idade como critério de desempate
				if (this.idade > obj.idade) {
					return 1;
				} else if (this.idade < obj.idade) {
					return -1;
				} else {
					return 0;
				}
			}
		} else {
			throw new RuntimeException("Objeto " + o + " não é um Candidato");
		}
	}
}
