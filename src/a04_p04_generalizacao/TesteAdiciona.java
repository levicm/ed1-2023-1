package a04_p04_generalizacao;

public class TesteAdiciona {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista);

		lista.adiciona(new Professor("Levi", "levi@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista);

		for (int i = 0; i < lista.quantidade(); ++i) {
			if (lista.pega(i) instanceof Aluno) {
				Aluno aluno = (Aluno) lista.pega(i);
				aluno.aprovar();
			} else if (lista.pega(i) instanceof Professor) {
				Professor professor = (Professor) lista.pega(i);
				professor.ministrarAula();
			}
		}
	}

}
