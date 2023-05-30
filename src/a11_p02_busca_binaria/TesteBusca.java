package a11_p02_busca_binaria;

public class TesteBusca {

	public static void main(String[] args) {
		ListaOrdenada lista = new ListaOrdenada();
//		System.out.println(lista);
		System.out.print("Criando a lista...");
		for (int i = 0; i < 100000; ++i) {
			float nota = i/10f;
			Aluno aluno = new Aluno("Aluno " + i, nota);
			lista.adiciona(aluno);
			if (i % 1000 == 0) {
				System.out.print(".");
			}
		}
		System.out.println();
		
		System.out.println("Iniciando as buscas...");
//		System.out.println(lista);
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 50, 5.0f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 72, 7.2f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 41, 4.1f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 315, 3.15f)));

		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 0, 0.0f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 5, 0.5f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 95, 9.5f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 99, 9.9f)));

		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 95100, 9510.0f)));
	
	}

}
