package a04_p02_atributo_qtd;

public class TesteAdiciona {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Levi", "levi@"));
		lista.adiciona(new Aluno("Maria", "maria@"));
		System.out.println(lista);	
		
		for (int i = 0; i < 120; ++i) {
			Aluno aluno = new Aluno("aluno" + i, "aluno"+i+"@gmail.com");
			lista.adiciona(aluno);
		}
		System.out.println(lista);
	}

}
