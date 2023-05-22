package a09_prova_unid1;

public class ListaArranjo implements Lista {

	private Object[] arranjo = new Object[50];
	private int quantidade = 0;

	public void adiciona(Object elemento) {
		garanteEspaco();
		arranjo[quantidade] = elemento;
		quantidade++;
	}

	public void adiciona(Object elemento, int posicao) {
		// Se a posicao for válida...
		if (posicao <= quantidade) {
			garanteEspaco();
			if (posicao < quantidade) {
				// Deslocando os elementos posteriores
				for (int i = quantidade; i > posicao; --i) {
					arranjo[i] = arranjo[i - 1];
				}
			}
			arranjo[posicao] = elemento;
			quantidade++;
		}
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

	public Object pega(int posicao) {
		if (posicao <= quantidade()) {
			return arranjo[posicao];
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

	public int busca(Object elemento) {
		for (int i = 0; i < quantidade; ++i) {
			if (elemento.equals(arranjo[i])) {
				return i;
			}
		}
		return -1;
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

	public void removeTodos(Object chave) {
//		while (true) {
//			int posicao = busca(chave);
//			if (posicao == -1) {
//				break;
//			}
//			remove(posicao);
//		}

//		int posicao = 0;
//		while (posicao > -1) {
//			posicao = busca(chave);
//			if (posicao > -1) {
//				remove(posicao);
//			}
//		}

		int posicao = 0;
		while (posicao > -1) {
			posicao = busca(chave);
			remove(posicao);
		}
	}

	@Override
	public void copia(Object[] arranjo) {
		for (int i = 0; i < arranjo.length; i++) {
			adiciona(arranjo[i]);
		}
	}

	@Override
	public boolean igual(Lista lista) {
		if (this.quantidade() != lista.quantidade()) {
			return false;
		}
		for (int i = 0; i < quantidade(); i++) {
			if (!pega(i).equals(lista.pega(i))) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void limpa() {
		// Remover as referências para os objetos
		// que já estavam no arranjo
		for (int i = 0; i < quantidade; i++) {
			arranjo[i] = null;
		}
		// Zera a quantidade
		quantidade = 0;
	}

	@Override
	public void substitui(int posicao, Object elemento) {
		// Se for inválida, lança exceção
		if (posicao >= quantidade) {
			throw new IndexOutOfBoundsException("Índice inexistente: " + posicao);
		}

		if (posicao < quantidade) {
			arranjo[posicao] = elemento;
		}
	}

	/**
	 * Complexidade: 1 + 1 + (n/2)*3 = 2 + n = n. Então a complexidade é O(n)
	 */
	@Override
	public void inverte() {
		int ultimaPos = quantidade - 1; // 1
		int meioDoArranjo = ultimaPos / 2; // 1
		for (int i = 0; i <= meioDoArranjo; i++) { // n/2:
			Object temp = arranjo[i]; // 1
			arranjo[i] = arranjo[ultimaPos - i]; // 1
			arranjo[ultimaPos - i] = temp; // 1
		}
	}

	@Override
	public Lista segmento(int inicio, int fim) {
		// Se for inválida, lança exceção
		if (!(inicio >= 0 && inicio < quantidade && fim >= 0 && fim < quantidade && fim >= inicio)) {
			throw new IndexOutOfBoundsException("Indices inválidos");
		}

		Lista resultado = new ListaArranjo();
		if (inicio >= 0 && inicio < quantidade && fim >= 0 && fim < quantidade && fim >= inicio) {
			for (int i = inicio; i < fim; ++i) {
				resultado.adiciona(pega(i));
			}
		}
		return resultado;
	}
}
