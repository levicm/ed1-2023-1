package a04_p02_atributo_qtd;

public class Lista {

	private Aluno[] alunos = new Aluno[100];
	private int quantidade = 0;

	/**
	 * Adiciona um aluno no final da lista.
	 * 
	 * @param aluno
	 */
	public void adiciona(Aluno aluno) {
		garanteEspaco();
		alunos[quantidade] = aluno;
		quantidade++;
	}

	/**
	 * Adiciona um aluno em determinada posicao
	 * 
	 * @param aluno
	 * @param posicao
	 */
	public void adiciona(Aluno aluno, int posicao) {
		// Se a posicao for válida...
		if (posicao <= quantidade) {
			garanteEspaco();
			if (posicao < quantidade) {
				// Deslocando os elementos posteriores
				for (int i = quantidade; i > posicao; --i) {
					alunos[i] = alunos[i - 1];
				}
			}
			alunos[posicao] = aluno;
			quantidade++;
		}
	}
	
	private void garanteEspaco() {
		// Se já está no limite
		if (quantidade == alunos.length) {
			System.out.println("Arranjo lotado! Dobrando seu tamanho...");
			// Novo tamanho é o dobro do tamanho anterior
			int novoTamanho = alunos.length * 2;
			// Cria o novo arranjo
			Aluno[] novoArranjo = new Aluno[novoTamanho];
			// Copia os elementos do arranjo anterior para o novo
			for (int i = 0; i < alunos.length; ++i) {
				novoArranjo[i] = alunos[i];
			}
			alunos = novoArranjo;
		}
	}

	public Aluno pega(int posicao) {
		if (posicao <= quantidade()) {
			return alunos[posicao];
		}
		return null;
	}

	public void remove(int posicao) {
		if (posicao < quantidade) {
			for (int i = posicao; i < quantidade; ++i) {
				alunos[i] = alunos[i + 1];
			}
			quantidade--;
		}
	}

	public int quantidade() {
		return this.quantidade;
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
