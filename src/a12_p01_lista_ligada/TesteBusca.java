package a12_p01_lista_ligada;

public class TesteBusca {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona(new Aluno("Rafael", 9.5f));
		lista.adiciona(new Aluno("Paulo", 8f));
		lista.adiciona(new Aluno("Joao", 2.5f));
		lista.adiciona(new Aluno("Maria", 10f));
		// Rafael, Paulo, Joao, Maria
		
		System.out.println(lista);
		
		Aluno chave = new Aluno("João", 2.5f);
		int esperado = 2;
		int indice = lista.busca(chave);
		System.out.println(indice == esperado);
		
		
		System.out.println(lista.busca(new Aluno("", 8f)) == 1);
	}

}











