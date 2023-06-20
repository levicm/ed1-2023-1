package a13_p02_lista_dupla_ligada_interface;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {
		teste(new ListaDuplamenteLigada());
	}
	
	public static void teste(Lista lista) {
		lista.adicionaNoComeco(new Aluno("Rafael", 9.5f));
		lista.adicionaNoComeco(new Aluno("Paulo", 8f));
		lista.adicionaNoComeco(new Aluno("Joao", 2.5f));
		lista.adicionaNoComeco(new Aluno("Maria", 10f));
		// Maria, Joao, Paulo, Rafael
		
		System.out.println(lista);
		String esperado = "[Maria (10.0), Joao (2.5), Paulo (8.0), Rafael (9.5)]";
		String str = lista.toString();
		System.out.println(esperado.equals(str));
	}

}
