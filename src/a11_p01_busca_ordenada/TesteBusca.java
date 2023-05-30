package a11_p01_busca_ordenada;

import a11_p02_busca_binaria.Aluno;

public class TesteBusca {

	public static void main(String[] args) {
		ListaOrdenada lista = new ListaOrdenada();
		System.out.println(lista);
		for (int i = 0; i < 100; ++i) {
			float nota = i/10f;
			Aluno aluno = new Aluno("Aluno " + i, nota);
			lista.adiciona(aluno);
		}
		System.out.println(lista);
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 50, 5.0f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 72, 7.2f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 41, 4.1f)));
		System.out.println("Posicao " + lista.busca(new Aluno("Aluno " + 315, 3.15f)));
	}

}
