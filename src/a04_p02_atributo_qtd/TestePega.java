package a04_p02_atributo_qtd;

public class TestePega {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Aluno("Levi", "levi@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista.pega(1) != null);
		System.out.println(lista.pega(1) != null && lista.pega(1).getNome().equals("Maria"));

		lista.adiciona(new Aluno("Joao", "joao@"));
		System.out.println(lista.pega(2).getEmail().equals("joao@"));
		System.out.println(lista.pega(3) == null);
	}

}
