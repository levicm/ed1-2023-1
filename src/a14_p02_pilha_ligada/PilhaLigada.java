package a14_p02_pilha_ligada;

public class PilhaLigada implements Pilha {
	
	private Celula topo;
	private int tamanho;
	
	@Override
	public void adiciona(Object elemento) {
		Celula nova = new Celula(elemento);
		nova.setProximo(topo);
		topo = nova;
		tamanho++;
	}

	@Override
	public Object remove() {
		tamanho--;
		return null;
	}

	@Override
	public Object topo() {
		if (topo != null) {
			return topo.getElemento();
		}
		return null;
	}

	@Override
	public int tamanho() {
		return tamanho;
	}

	@Override
	public boolean vazia() {
		return topo == null;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
