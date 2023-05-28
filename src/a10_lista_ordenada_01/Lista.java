package a10_lista_ordenada_01;

public interface Lista {
	public void adiciona(Object obj);
	public void adiciona(Object obj, int pos);
	public Object pega(int pos);
	public int busca(Object elemento);
	public void remove(int pos);
	public int quantidade();
	
	public void limpa();
	public void substitui(int posicao, Object elemento);
	public void inverte();

	public void removeTodos(Object chave);
	public void copia(Object[] arranjo);
	public boolean igual(Lista lista);
	public Lista segmento(int inicio, int fim);
}
