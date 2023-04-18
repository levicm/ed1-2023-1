package a03_p01;

public class TesteQuantidade {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista.quantidade() == 0);

		lista.adiciona(new Aluno("Levi", "levi@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista.quantidade() == 2);

		lista.adiciona(new Aluno("Joao", "joao@"));
		System.out.println(lista.quantidade() == 3);
	}

}
