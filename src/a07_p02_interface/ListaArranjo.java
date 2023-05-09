package a07_p02_interface;

public class ListaArranjo implements Lista {

	private Object[] arranjo = new Object[20];
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
