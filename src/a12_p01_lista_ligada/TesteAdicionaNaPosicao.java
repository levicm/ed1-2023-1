package a12_p01_lista_ligada;

public class TesteAdicionaNaPosicao {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona(new Aluno("Rafael", 9.5f));
		lista.adiciona(new Aluno("Paulo", 8f));
		lista.adiciona(new Aluno("Joao", 2.5f));
		lista.adiciona(new Aluno("Maria", 10f), 1);
		// Rafael, Maria, Paulo, Joao
		
		System.out.println(lista);
		String esperado = "[Rafael (9.5), Maria (10.0), Paulo (8.0), Joao (2.5)]";
		String str = lista.toString();
		System.out.println(esperado.equals(str));
	}

}
