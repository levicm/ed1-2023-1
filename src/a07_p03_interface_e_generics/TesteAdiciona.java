package a07_p03_interface_e_generics;

public class TesteAdiciona {

	public static void main(String[] args) {
		testeAdicionaAluno(new ListaArranjo<Aluno>());
		
		Lista<Professor> lista = new ListaArranjo<Professor>();
		testeAdicionaProfessor(lista);
		// Essas chamadas abaixo gerariam erro:
//		testeAdicionaAluno(lista);
//		testeAdicionaProfessor(new ListaArranjo<String>());
	}
	
	private static void testeAdicionaAluno(Lista<Aluno> lista) {
		System.out.println(lista);
		lista.adiciona(new Aluno("Joao", "joao@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista);

		for (int i = 0; i < lista.quantidade(); ++i) {
			lista.pega(i).aprovar();
		}
		lista.remove(0);
		System.out.println(lista);
	}

	private static void testeAdicionaProfessor(Lista<Professor> lista) {
		System.out.println(lista);

		lista.adiciona(new Professor("Levi", "levi@"));
		lista.adiciona(new Professor("André", "andre@"));
		System.out.println(lista);

		for (int i = 0; i < lista.quantidade(); ++i) {
			lista.pega(i).ministrarAula();
		}
		lista.remove(0);
		System.out.println(lista);
	}
}
