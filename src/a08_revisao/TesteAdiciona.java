package a08_revisao;

public class TesteAdiciona {

	public static void main(String[] args) {
		testeAdicionaAluno(new ListaArranjo());
	}
	
	private static void testeAdicionaAluno(Lista lista) {
		System.out.println(lista);
		lista.adiciona(new Aluno("Joao", "joao@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista);

		for (int i = 0; i < lista.quantidade(); ++i) {
			((Aluno) lista.pega(i)).aprovar();
		}
		lista.remove(0);
		System.out.println(lista);
	}
}
