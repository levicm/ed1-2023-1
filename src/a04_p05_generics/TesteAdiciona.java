package a04_p05_generics;

public class TesteAdiciona {

	public static void main(String[] args) {
		Lista<Aluno> lista = new Lista<Aluno>();
		System.out.println(lista);

		lista.adiciona(new Aluno("Joao", "joao@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista);

		for (int i = 0; i < lista.quantidade(); ++i) {
			lista.pega(i).aprovar();
		}

		Lista<Professor> lista2 = new Lista<Professor>();
		System.out.println(lista2);

		lista2.adiciona(new Professor("Levi", "levi@"));
		lista2.adiciona(new Professor("André", "andre@"));
		System.out.println(lista2);

		for (int i = 0; i < lista2.quantidade(); ++i) {
			lista2.pega(i).ministrarAula();
		}
	}

}
