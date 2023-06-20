package a13_p02_lista_dupla_ligada_interface;

public class ListaLigada implements Lista {

	private Celula inicio;
	private int tamanho;

	public void adiciona(Object elemento) {
		if (inicio == null) {
			adicionaNoComeco(elemento);
		} else {
			Celula ultima = getUltima();
			Celula nova = new Celula(elemento);
			ultima.setProximo(nova);
			tamanho++;
		}
	}

	private Celula getUltima() {
		Celula celula = inicio;
		while (celula.getProximo() != null) {
			celula = celula.getProximo();
		}
		return celula;
	}

	public void adiciona(Object elemento, int posicao) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == tamanho) {
			adiciona(elemento);
		} else {
			Celula anterior = pegaCelula(posicao - 1);
			Celula nova = new Celula(elemento, anterior.getProximo());
			anterior.setProximo(nova);
			tamanho++;
		}
	}

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, inicio);
		inicio = nova;
		tamanho++;
	}

	public Object pega(int posicao) {
		if (posicaoOcupada(posicao)) {
			return pegaCelula(posicao).getElemento();
		}
		return null;
	}

	private Celula pegaCelula(int posicao) {
		Celula atual = inicio;
		int i = 0;
		while (atual != null && i < posicao) {
			atual = atual.getProximo();
			i++;
		}
		return atual;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.tamanho;
	}

	public void remove(int posicao) {
		if (posicaoOcupada(posicao)) {
			if (posicao == 0) {
				inicio = inicio.getProximo();
			} else {
				Celula anterior = pegaCelula(posicao - 1);
				Celula remover = anterior.getProximo();
				anterior.setProximo(remover.getProximo());
			}
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	public int busca(Object elemento) {
		Celula celula = inicio;

//		for (int i = 0; i < tamanho && celula != null; ++i) {
//			if (elemento.equals(celula.getElemento())) {
//				return i;
//			}
//			celula = celula.getProximo();
//		}
		
		int j = 0;
		while (celula != null) {
			if (elemento.equals(celula.getElemento())) {
				return j;
			}
			celula = celula.getProximo();
			j++;
		}
		return -1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Celula celula = inicio;
		while (celula != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}
			sb.append(celula.getElemento().toString());
			celula = celula.getProximo();
		}
		sb.append("]");
		return sb.toString();
	}
}
