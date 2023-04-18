package a02_p02;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		final int MAX_QUARTOS = 10;
		Aluguel[] quartos = new Aluguel[MAX_QUARTOS];

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos serao alugados?");
		int n = sc.nextInt();

		for (int i = 0; i < n; ++i) {
			System.out.println("Aluguel #" + i);

			System.out.print("Nome:");
			String nome = sc.next();

			System.out.print("Email:");
			String email = sc.next();

			System.out.print("Quarto:");
			int quarto = sc.nextInt();

			Aluguel aluguel = new Aluguel(nome, email);
			quartos[quarto] = aluguel;
		}

		System.out.println("Quartos ocupados:");
		for (int i = MAX_QUARTOS - 1; i >= 0; --i) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i].getNome() + ", " + quartos[i].getEmail());
			}
		}
		sc.close();
	}

}
