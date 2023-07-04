package a15_p02_fila_composicao;

public interface Fila {
	
	public void adiciona(Object elemento);
	public Object remove();
	public Object consulta();
	public int tamanho();
	public boolean vazia();

}
