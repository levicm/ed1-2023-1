package a15_p02_fila_composicao;

public class FilaLista implements Fila {
	
	private ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

	public void adiciona(Object elemento) {
		lista.adiciona(elemento);
	}

	public Object remove() {
		Object result = lista.pega(0);
		lista.remove(0);
		return result;
	}

	public Object consulta() {
		return lista.pega(0);
	}

	public int tamanho() {
		return lista.tamanho();
	}

	public boolean vazia() {
		return lista.tamanho() == 0;
	}

	public String toString() {
		return lista.toString();
	}
}
