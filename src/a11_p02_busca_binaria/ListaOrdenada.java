package a11_p02_busca_binaria;

public class ListaOrdenada {

	private Object[] arranjo = new Object[50];
	private int quantidade = 0;

	public void adiciona(Comparable elemento) {
		garanteEspaco();
		// Encontrar a posicao
		boolean adicionou = false;
		int posicao = 0;
		for (int i = 0; i < quantidade; ++i) {
			// Comparar o elemento passado com os elementos do arranjo
			if (elemento.compareTo(arranjo[i]) < 0) {
				// Deslocamento dos posteriores
				for (int j = quantidade; j > i; j--) {
					arranjo[j] = arranjo[j - 1];
				}
				posicao = i;
				// Guardar o novo
				arranjo[posicao] = elemento;
				adicionou = true;
				break;
			}
		}
		if (!adicionou) {
			arranjo[quantidade] = elemento;
		}
		quantidade++;
	}

	private void garanteEspaco() {
		if (quantidade == arranjo.length) {
			int novoTamanho = arranjo.length * 2;
			Object[] novoArranjo = new Object[novoTamanho];
			for (int i = 0; i < quantidade; ++i) {
				novoArranjo[i] = arranjo[i];
			}
			this.arranjo = novoArranjo;
		}
	}

	public Comparable pega(int posicao) {
		if (posicao <= quantidade()) {
			return (Comparable) arranjo[posicao];
		}
		return null;
	}

	public void remove(int posicao) {
		if (posicao >= 0 && posicao < quantidade) {
			for (int i = posicao; i < quantidade; ++i) {
				arranjo[i] = arranjo[i + 1];
			}
			quantidade--;
		}
	}

	public int quantidade() {
		return this.quantidade;
	}

	public int busca(Comparable elemento) {
		int operacoes = 0;
		try {
			int esquerda = 0;
			int direita = quantidade - 1;
			while (esquerda <= direita) {
				operacoes++;
				int meio = (esquerda + direita) / 2;
				int resultado = elemento.compareTo(arranjo[meio]);
				if (resultado == 0) {
					return meio;
				} else if (resultado < 0) { 
					direita = meio - 1;
				} else {
					esquerda = meio + 1;
				}
			}
			return -1;
		} finally {
			System.out.println("Operacoes: " + operacoes);
		}
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("[");
		for (int i = 0; i < quantidade; ++i) {
			if (i > 0) {
				resultado.append(", ");
			}
			resultado.append(arranjo[i]);
		}
		resultado.append("]");
		return resultado.toString();
	}

}
