package a13_p02_lista_dupla_ligada_interface;

public interface Lista {
	public void adiciona(Object obj);
	public void adiciona(Object obj, int pos);
	public void adicionaNoComeco(Object obj);
	public Object pega(int pos);
	public int busca(Object elemento);
	public void remove(int pos);
	public int tamanho();
}
