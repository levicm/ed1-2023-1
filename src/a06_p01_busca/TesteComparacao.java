package a06_p01_busca;

public class TesteComparacao {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Levi", "levi@gmail.com");
		Aluno aluno2 = new Aluno("Levi", "levis@gmail.com");
		
		System.out.println(aluno == aluno2);
		System.out.println(aluno.equals(aluno2));

		
		String nome = new String("Levi");
		String nome2 = new String("Levi");
		System.out.println(nome == nome2);
		System.out.println(nome.equals(nome2));
	}

}
