package a03_p01;

public class TesteAdicionaNaPosicao {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista);
		lista.adiciona(new Aluno("Levi", "levi@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista);
		System.out.println(lista.pega(1) != null);
		System.out.println(lista.pega(1) != null && lista.pega(1).getNome().equals("Maria"));

		lista.adiciona(new Aluno("Joao", "joao@"), 1);
		System.out.println(lista);
		System.out.println(lista.quantidade() == 3);
		System.out.println(lista.pega(1).getEmail().equals("joao@"));
		System.out.println(lista.pega(2).getEmail().equals("maria@"));

		lista.adiciona(new Aluno("Pedro", "pedro@"), 0);
		System.out.println(lista);
		System.out.println(lista.quantidade() == 4);
		System.out.println(lista.pega(0).getEmail().equals("pedro@"));
		System.out.println(lista.pega(2).getEmail().equals("joao@"));

		lista.adiciona(new Aluno("Joana", "joana@"), 4);
		System.out.println(lista);
		System.out.println(lista.quantidade() == 5);
		System.out.println(lista.pega(0).getEmail().equals("pedro@"));
		System.out.println(lista.pega(2).getEmail().equals("joao@"));
		System.out.println(lista.pega(4).getEmail().equals("joana@"));
	}

}
