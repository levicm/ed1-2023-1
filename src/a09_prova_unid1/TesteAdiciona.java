package a09_prova_unid1;

public class TesteAdiciona {

	public static void main(String[] args) {
		testeAdicionaAluno(new ListaArranjo());
	}

	private static void testeAdicionaAluno(Lista lista) {
		System.out.println(lista);
		lista.adiciona(new Aluno("Joao", "joao@"));
		lista.adiciona(null);
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista);

		// Testando o susbtitui
		lista.substitui(1, new Aluno("Pedro", "pedro@"));
		System.out.println(lista);
		lista.substitui(0, new Aluno("Carla", "carla@"));
		System.out.println(lista);
		lista.adiciona(new Aluno("Silvia", "silvia@"), 1);
		System.out.println(lista);
		lista.inverte();
		System.out.println(lista);
		lista.inverte();
		System.out.println(lista);
		lista.adiciona(new Aluno("Marco", "marco@"));
		System.out.println(lista);
		lista.inverte();
		System.out.println(lista);
		lista.inverte();
		System.out.println(lista);

		try {
			// Testando o segmento
			Lista segmento = lista.segmento(1, 4);
			System.out.println(segmento);
			segmento = lista.segmento(-1, 4);
			System.out.println(segmento);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Erro de índice nas estruturas internas ao cadastrar o cliente: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro genérico ao cadastrar o cliente: " + e.getMessage());
		}

		// Testando o limpa
		lista.limpa();
		System.out.println(lista);

	}
}
