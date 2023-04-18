package a03_p01;

public class TesteAdiciona {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Levi", "levi@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista);		
	}

}
