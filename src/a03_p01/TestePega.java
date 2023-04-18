package a03_p01;

public class TestePega {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Aluno("Levi", "levi@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista.pega(1) != null);
		System.out.println(lista.pega(1) != null && lista.pega(1).getNome().equals("Maria"));

		lista.adiciona(new Aluno("Joao", "joao@"));
		System.out.println(lista.pega(2).getEmail().equals("joao@"));
	}

}
