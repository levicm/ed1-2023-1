package a13_p01_lista_dupla_ligada;

public class TesteTamanho {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		lista.adiciona(new Aluno("Rafael", 9.5f));
		lista.adiciona(new Aluno("Paulo", 8f));
		lista.adiciona(new Aluno("Joao", 2.5f));
		lista.adiciona(new Aluno("Maria", 10f));
		// Rafael, Paulo, Joao, Maria
		
		System.out.println(lista);
		System.out.println(lista.tamanho());
		int esperado = 4;
		System.out.println(lista.tamanho() == esperado);
	}

}
