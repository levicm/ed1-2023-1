package a03_p01;

public class Programa {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Levi", "levi@gmail.com");
		Aluno aluno2 = new Aluno("Maria", "maria@gmail.com");

		
		System.out.println("Nome do aluno1: " + aluno1.getNome());
		System.out.println(aluno1);

		System.out.println("Nome do aluno2: " + aluno2.getNome());
		System.out.println(aluno2);
	}

}
