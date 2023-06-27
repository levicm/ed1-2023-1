package a14_p02_pilha_ligada;

public class TestePilha {

	public static void main(String[] args) {
		Pilha pilha = new PilhaLigada();

		System.out.println(pilha);
		System.out.println(pilha.vazia() == true);

		pilha.adiciona("Grade frontal");
		pilha.adiciona("Porca principal");
		pilha.adiciona("Helice");
		System.out.println(pilha);
		System.out.println(pilha.tamanho() == 3);
		System.out.println(pilha.vazia() == false);

		pilha.adiciona("Grade do fundo");
		pilha.adiciona("Carcaça do motor");
		System.out.println(pilha);
		System.out.println(pilha.tamanho() == 5);
		System.out.println(pilha.vazia() == false);
		System.out.println(pilha.topo().equals("Carcaça do motor"));
		System.out.println(pilha.remove().equals("Carcaça do motor"));
		pilha.remove();
		pilha.remove();
		pilha.remove();
		pilha.remove();
		System.out.println(pilha.vazia() == true);
		System.out.println(pilha.tamanho() == 0);
		System.out.println(pilha.remove() == null);
	}

}







