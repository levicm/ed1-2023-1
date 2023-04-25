package a07_p01_comparable;

public class Programa {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Candidato("João", 45, 70));
		lista.adiciona(new Candidato("José", 32, 81));
		lista.adiciona(new Candidato("Pedro", 21, 65));
		lista.adiciona(new Candidato("Maria", 18, 72));
		lista.adiciona(new Candidato("Josefa", 60, 81));
		lista.adiciona(new Candidato("Juliana", 23, 70));
		
		Candidato maior = null;
		for (int i = 0; i < lista.quantidade(); ++i) {
			Candidato candidato = (Candidato) lista.pega(i);
			if (maior == null || 
					candidato.compareTo(maior) > 0) {
				maior = candidato;
			}
		}
		System.out.println("Candidato melhor colocado: " + maior);
	}

}
