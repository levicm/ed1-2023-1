package a04_p01_remocao;

public class TesteRemove {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Aluno("Levi", "levi@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista.pega(1) != null);
		System.out.println(lista.pega(1) != null && lista.pega(1).getNome().equals("Maria"));

		lista.adiciona(new Aluno("Joao", "joao@"));
		System.out.println(lista);
		System.out.println(lista.pega(2).getEmail().equals("joao@"));
		
		lista.remove(1);
		System.out.println(lista);
		System.out.println(lista.quantidade() == 2);
		System.out.println(lista.pega(0).getNome().equals("Levi"));
		System.out.println(lista.pega(1).getEmail().equals("joao@"));

		lista.remove(0);
		System.out.println(lista);
		System.out.println(lista.quantidade() == 1);
		System.out.println(lista.pega(0).getNome().equals("Joao"));

		lista.remove(0);
		System.out.println(lista);
		System.out.println(lista.quantidade() == 0);
	}

}
