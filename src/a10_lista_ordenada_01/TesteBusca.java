package a10_lista_ordenada_01;

public class TesteBusca {

	public static void main(String[] args) {
		ListaOrdenada lista = new ListaOrdenada();
		System.out.println(lista);
		for (int i = 0; i < 100; ++i) {
			float nota = i/10f;
			Aluno aluno = new Aluno("Aluno " + i, nota);
			lista.adiciona(aluno);
		}
		System.out.println(lista);
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 50, 5.0f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 315, 3.15f)));
	}

}
