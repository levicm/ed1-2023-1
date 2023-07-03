package a15_p01_fila_ligada;

public interface Fila {
	
	public void adiciona(Object elemento);
	public Object remove();
	public Object consulta();
	public int tamanho();
	public boolean vazia();

}
