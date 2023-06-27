package a14_p02_pilha_ligada;

public interface Pilha {
	public void adiciona(Object elemento);
	public Object remove();
	public Object topo();
	public int tamanho();
	public boolean vazia();
}
