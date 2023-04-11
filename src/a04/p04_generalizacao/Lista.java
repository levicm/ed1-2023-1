package a04.p04_generalizacao;

public class Lista {

	private Object[] arranjo = new Object[100];
	private int quantidade = 0;

	public void adiciona(Object aluno) {
		arranjo[quantidade] = aluno;
		quantidade++;
	}

	public void adiciona(Object aluno, int posicao) {
		// Se a posicao for válida...
		if (posicao <= quantidade) {
			if (posicao < quantidade) {
				// Deslocando os elementos posteriores
				for (int i = quantidade; i > posicao; --i) {
					arranjo[i] = arranjo[i - 1];
				}
			}
			arranjo[posicao] = aluno;
			quantidade++;
		}
	}

	public Object pega(int posicao) {
		if (posicao <= quantidade()) {
			return arranjo[posicao];
		}
		return null;
	}

	public void remove(int posicao) {
		if (posicao < quantidade) {
			for (int i = posicao; i < quantidade; ++i) {
				arranjo[i] = arranjo[i + 1];
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
		for (int i = 0; i < arranjo.length; ++i) {
			if (arranjo[i] != null) {
				if (i > 0) {
					resultado += ", ";
				}
				resultado += arranjo[i];
			} else {
				break;
			}
		}
		resultado += "]";
		return resultado;
	}
}
