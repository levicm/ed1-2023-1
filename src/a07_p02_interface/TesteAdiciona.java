package a07_p02_interface;

public class TesteAdiciona {

	public static void main(String[] args) {
		testeAdicionaAluno(new ListaArranjo());
		
		Lista lista = new ListaArranjo();
		testeAdicionaProfessor(lista);
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

	private static void testeAdicionaProfessor(Lista lista) {
		System.out.println(lista);

		lista.adiciona(new Professor("Levi", "levi@"));
		lista.adiciona(new Professor("André", "andre@"));
		System.out.println(lista);

		for (int i = 0; i < lista.quantidade(); ++i) {
			((Professor) lista.pega(i)).ministrarAula();
		}
		lista.remove(0);
		System.out.println(lista);
	}
}
