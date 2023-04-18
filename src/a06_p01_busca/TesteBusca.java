package a06_p01_busca;

public class TesteBusca {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista);

		lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
		lista.adiciona(new Aluno("João", "joao@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		lista.adiciona(new Aluno("Guilherme", "guilherme@gmail.com"));
		lista.adiciona(new Aluno("Marcos", "marcos@gmail.com"));
		System.out.println(lista);

		Aluno chave1 = new Aluno("Carlos", null);
		int posicao = lista.busca(chave1);
		System.out.println(posicao);
		
		Aluno chave2 = new Aluno("Paulo", null);
		posicao = lista.busca(chave2);
		System.out.println(posicao);

		Aluno chave3 = new Aluno("Marcos", null);
		posicao = lista.busca(chave3);
		System.out.println(posicao);
		
	}

}
