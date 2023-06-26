package a14_p01_pilha;

public class PilhaArranjo implements Pilha {
	
	private Object[] arranjo = new Object[50];
	private int topo = -1;

	@Override
	public void adiciona(Object elemento) {
		topo++;
		arranjo[topo] = elemento;
	}

	@Override
	public Object remove() {
		Object resultado = null;
		if (topo > -1) {
			resultado = arranjo[topo];
			arranjo[topo] = null;
			topo--;
		}
		return resultado;
	}

	@Override
	public Object topo() {
		if (topo > -1) {
			return arranjo[topo];
		}
		return null;
	}

	@Override
	public boolean vazia() {
		return tamanho() == 0;
	}

	@Override
	public int tamanho() {
		return topo + 1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i <= topo; ++i) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(arranjo[i].toString());
		}
		sb.append("]");
		return sb.toString();
	}
}











