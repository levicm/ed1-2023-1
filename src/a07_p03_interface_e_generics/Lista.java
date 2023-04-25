package a07_p03_interface_e_generics;

public interface Lista<T> {
	public void adiciona(T obj);
	public void adiciona(T obj, int pos);
	public T pega(int pos);
	public void remove(int pos);
	public int quantidade();
}
