package a02_p01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a quantidade de produtos desejados: ");
		int qtd = sc.nextInt();
		
		Produto[] produtos = new Produto[qtd];
		for (int i = 0; i < qtd; ++i) {
			Produto produto = new Produto();
			
			System.out.println("Entre com o nome do produto " + i);
			produto.nome = sc.next();
			System.out.println("Entre com o preco do produto " + i);
			produto.preco = sc.nextDouble();
			
			produtos[i] = produto;
		}
		
		double soma = 0;
		for (int i = 0; i < qtd; ++i) {
			System.out.print("Produto " + i);
			System.out.print(": " + produtos[i].nome);
			System.out.println(" | " + produtos[i].preco);
			soma = soma + produtos[i].preco;
		}
		double media = soma / qtd;

		System.out.println("Média de preço: " + media);
		
		sc.close();
	}

}
