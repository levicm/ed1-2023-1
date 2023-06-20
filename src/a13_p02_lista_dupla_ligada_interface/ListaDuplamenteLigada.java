package a13_p02_lista_dupla_ligada_interface;

public class ListaDuplamenteLigada implements Lista {
	private Celula inicio;
	private Celula fim;
	
	private int tamanho;

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento);
		if (tamanho == 0) {
			inicio = nova;
			fim = nova;
		} else {
			nova.setProximo(inicio);
			inicio.setAnterior(nova);
			inicio = nova;
		}
		tamanho++;
	}
	
	public void adiciona(Object elemento) {
		if (tamanho == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			nova.setAnterior(fim);
			fim.setProximo(nova);
			fim = nova;
			tamanho++;
		}
	}
	
	public void adiciona(Object elemento, int posicao) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == tamanho) {
			adiciona(elemento);
		} else {
			Celula nova = new Celula(elemento);
			
			Celula daPosicao = pegaCelula(posicao);
			Celula antriorAPosicao = daPosicao.getAnterior();
			
			nova.setAnterior(antriorAPosicao);
			antriorAPosicao.setProximo(nova);
			
			daPosicao.setAnterior(nova);
			nova.setProximo(daPosicao);
			tamanho++;
		}
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

	public Object pega(int posicao) {
		if (posicaoOcupada(posicao)) {
			return pegaCelula(posicao).getElemento();
		}
		return null;
	}
	
	public void remove(int posicao) {
		if (posicaoOcupada(posicao)) { 
			if (tamanho == 1) {
				inicio = null;
				fim = null;
			} else if (posicao == 0) {
				inicio = inicio.getProximo();
				inicio.setAnterior(null);
			} else if (posicao == tamanho - 1) {
				fim = fim.getAnterior();
				fim.setProximo(null);
			} else {
				Celula daPosicao = pegaCelula(posicao);
				Celula depois = daPosicao.getProximo();
				Celula antes = daPosicao.getAnterior();
				
				depois.setAnterior(antes);
				antes.setProximo(depois);
			}
			tamanho--;
		}
	}

	public int tamanho() {
		return tamanho;
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




