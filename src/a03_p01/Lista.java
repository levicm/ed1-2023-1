package a03_p01;

public class Lista {
	
	private Aluno[] alunos = new Aluno[100];

	/**
	 * Adiciona um aluno no final da lista.
	 * @param aluno
	 */
	public void adiciona(Aluno aluno) {
		for (int i = 0; i < alunos.length; ++i) {
			if (alunos[i] == null) {
				alunos[i] = aluno;
				break;
			}
		}
	}
	
	/**
	 * Adiciona um aluno em determinada posicao
	 * @param aluno
	 * @param posicao
	 */
	public void adiciona(Aluno aluno, int posicao) {
		int qtd = quantidade();
		// Se a posicao for válida...
		if (posicao <= qtd) {
			if (posicao < qtd) {
				// Deslocando os elementos posteriores
				for (int i = qtd; i > posicao; --i) {
					alunos[i] = alunos[i - 1];
				}
			}
			alunos[posicao] = aluno;
		}
	}
	
	public Aluno pega(int posicao) {
		if (posicao <= quantidade()) {
			return alunos[posicao];
		}
		return null;
	}
	
	public void remove(int posicao) {
		// Implementar
	}
	
	public int quantidade() {
		for (int i = 0; i < alunos.length; ++i) {
			if (alunos[i] == null) {
				return i;
			}
		}
		return 0;
	}
	
	public boolean contem(Aluno aluno) {
		// Implementar
		return false;
	}
	
	@Override
	public String toString() {
		String resultado = "[";
		for (int i = 0; i < alunos.length; ++i) {
			if (alunos[i] != null) {
				if (i > 0) {
					resultado += ", ";
				}
				resultado += alunos[i];
			} else {
				break;
			}
		}
		resultado += "]";
		return resultado;
	}
}
