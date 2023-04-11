package a04.p05_generics;

public class Lista<T> {

	private Object[] arranjo = new Object[100];
	private int quantidade = 0;

	public void adiciona(T aluno) {
		arranjo[quantidade] = aluno;
		quantidade++;
	}

	public void adiciona(T aluno, int posicao) {
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

	@SuppressWarnings("unchecked")
	public T pega(int posicao) {
		if (posicao <= quantidade()) {
			return (T) arranjo[posicao];
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

	public boolean contem(T aluno) {
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
