package a15_p01_fila_ligada;

public class TesteFila {

	public static void main(String[] args) {
		Fila fila = new FilaEncadeada();
		System.out.println(fila);
		
		System.out.println(fila.tamanho() == 0);
		System.out.println(fila.vazia() == true);
		
		fila.adiciona("João");
		fila.adiciona("Maria");
		fila.adiciona("Pedro");
		System.out.println(fila);

		System.out.println(fila.tamanho() == 3);
		System.out.println(fila.vazia() == false);
		
		System.out.println(fila.consulta().equals("João"));
		System.out.println(fila.remove().equals("João"));
		System.out.println(fila.consulta().equals("Maria"));
		System.out.println(fila.remove().equals("Maria"));
		System.out.println(fila.remove().equals("Pedro"));

		System.out.println(fila.tamanho() == 0);
		System.out.println(fila.vazia() == true);
	}

}
