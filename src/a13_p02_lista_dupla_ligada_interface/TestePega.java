package a13_p02_lista_dupla_ligada_interface;

public class TestePega {

	public static void main(String[] args) {
		teste(new ListaDuplamenteLigada());
	}
	
	public static void teste(Lista lista) {
		lista.adiciona(new Aluno("Rafael", 9.5f));
		lista.adiciona(new Aluno("Paulo", 8f));
		lista.adiciona(new Aluno("Joao", 2.5f));
		lista.adiciona(new Aluno("Maria", 10f));
		// Rafael, Paulo, Joao, Maria
		
		System.out.println(lista);
		String esperado = "Joao (2.5)";
		System.out.println(lista.pega(2).toString().equals(esperado));
	}

}
