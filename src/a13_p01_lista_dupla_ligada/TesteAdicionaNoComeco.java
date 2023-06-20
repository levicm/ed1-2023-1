package a13_p01_lista_dupla_ligada;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
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
