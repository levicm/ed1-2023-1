package a13_p01_lista_dupla_ligada;

public class TesteRemove {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		lista.adiciona(new Aluno("Rafael", 9.5f));
		lista.adiciona(new Aluno("Paulo", 8f));
		lista.adiciona(new Aluno("Joao", 2.5f));
		lista.adiciona(new Aluno("Maria", 10f));
		// Rafael, Paulo, Joao, Maria
		
		System.out.println(lista);

		lista.remove(2);
		System.out.println(lista);
		String esperado = "[Rafael (9.5), Paulo (8.0), Maria (10.0)]";
		String str = lista.toString();
		System.out.println(esperado.equals(str));

		lista.remove(2);
		System.out.println(lista);
		esperado = "[Rafael (9.5), Paulo (8.0)]";
		str = lista.toString();
		System.out.println(esperado.equals(str));
	}

}
