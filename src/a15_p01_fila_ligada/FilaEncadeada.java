package a15_p01_fila_ligada;

public class FilaEncadeada implements Fila {
	
	private Celula inicio;
	private Celula fim;
	private int tamanho;

	@Override
	public void adiciona(Object elemento) {
		Celula nova = new Celula(elemento);
		if (tamanho == 0) {
			inicio = nova;
			fim = nova;
		} else {
			fim.setProximo(nova);
			nova.setAnterior(fim);
			fim = nova;
		}
		tamanho++;
	}

	@Override
	public Object remove() {
		if (tamanho == 0) {
			return null;
		}
		Object result = inicio.getElemento();
		if (tamanho == 1) {
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.getProximo();
			inicio.setAnterior(null);
		}
		tamanho--;
		return result;
	}

	@Override
	public Object consulta() {
		if (inicio != null) {
			return inicio.getElemento();
		}
		return null;
	}

	@Override
	public int tamanho() {
		return tamanho;
	}

	@Override
	public boolean vazia() {
		return tamanho == 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Celula atual = inicio;
		while (atual != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}
			sb.append(atual.getElemento().toString());
			atual = atual.getProximo();
		}
		sb.append("]");
		return sb.toString();
	}

}
