package a08_revisao;

public interface Lista {
	public void adiciona(Object obj);
	public void adiciona(Object obj, int pos);
	public Object pega(int pos);
	public int busca(Object elemento);
	public void remove(int pos);
	public int quantidade();

	public void removeTodos(Object chave);
	public void copia(Object[] arranjo);
	public boolean igual(Lista lista);
}
