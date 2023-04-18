package a04_p03_aloc_din;

public class Lista {

	private Aluno[] alunos = new Aluno[20];
	private int quantidade = 0;

	public void adiciona(Aluno aluno) {
		garanteEspaco();
		alunos[quantidade] = aluno;
		quantidade++;
	}

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
		if (quantidade == alunos.length) {
			int novoTamanho = alunos.length * 2;
			Aluno[] novoArranjo = new Aluno[novoTamanho];
			for (int i = 0; i < quantidade; ++i) {
				novoArranjo[i] = alunos[i];
			}
			this.alunos = novoArranjo;
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
