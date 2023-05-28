package a10_lista_ordenada_01;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaOrdenada lista = new ListaOrdenada();
		System.out.println(lista);
		lista.adiciona(new Aluno("Joao", 10));
		lista.adiciona(new Aluno("Maria", 8.5f));
		lista.adiciona(new Aluno("Pedro", 6.5f));
		lista.adiciona(new Aluno("Carlos", 3.5f));
		lista.adiciona(new Aluno("Jessica", 7f));
		System.out.println(lista);

	}
}
