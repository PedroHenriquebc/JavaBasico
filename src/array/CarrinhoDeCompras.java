package array;

import java.util.Scanner;

public class CarrinhoDeCompras {

	//  EM DESENVOLVIMENTO
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdArroz;
		int qtdFeijao;
		int qtdOleo;
		double total = 0;
		String[] produtos = {"Arroz", "Feijão", "Óleo"};
		double[] precos = { 4.99, 6.90, 7.99 };
		int[] estoque = { 10, 10, 10 };

		String entrada2 = "s";

		while (entrada2.equals("s")) {
			System.out.println("Tabela de produtos");
			System.out.println();
			System.out.println("  Produto 		Preço unit.(R$)  	Qtd em Estoque");
			System.out.println("[0]Arroz  		   " + precos[0] + "                      " + estoque[0]);
			System.out.println("[1]Feijão  		   " + precos[1] + "                       " + estoque[1]);
			System.out.println("[2]Óleo  		   " + precos[2] + "                      " + estoque[2]);
			System.out.println();
			System.out.println("Digite o número do produto que deseja: ");
			System.out.println();

			int entrada = sc.nextInt();
			if (entrada == 0) {
				if (estoque[0] > 0) {
					System.out.println("Digite a quantidade de Arroz que você deseja: ");
					qtdArroz = sc.nextInt();
					while (qtdArroz > estoque[0]) {
						System.out.println("Desculpe, estoque de Arroz insuficiente(" + estoque[0]
								+ "), digite uma quantidade até " + estoque[0] + ": ");
						qtdArroz = sc.nextInt();
					}
					total += precos[0] * qtdArroz;
					estoque[0] -= qtdArroz;
				}
			} else if (entrada == 1) {
				if (estoque[1] > 0) {
					System.out.println("Digite a quantidade Feijão que você deseja: ");
					qtdFeijao = sc.nextInt();
					while (qtdFeijao > estoque[1]) {
						System.out.println("Desculpe, estoque de Feijão insuficiente(" + estoque[1]
								+ "), digite uma quantidade até " + estoque[1] + ": ");
						qtdFeijao = sc.nextInt();
					}
					total += precos[1] * qtdFeijao;
					estoque[1] -= qtdFeijao;
				}
			} else if (entrada == 2) {
				if(estoque[2] > 0) {
					System.out.println("Digite a quantidade Óleo que você deseja: ");
					qtdOleo = sc.nextInt();
					while (qtdOleo > estoque[2]) {
						System.out.println("Desculpe, estoque de Arroz insuficiente(" + estoque[2]
								+ "), digite uma quantidade até " + estoque[2] + ": ");
						qtdOleo = sc.nextInt();
				}
				total += precos[2] * qtdOleo;
				estoque[2] -= qtdOleo;
			}
		}
			System.out.printf("Total do Carrinho = R$%.2f %n", total);
			System.out.println("Deseja fazer continuar comprando? (s/n)");
			entrada2 = sc.next();

	}
		
		System.out.println("~ Seu carrinho ~");
		System.out.println();
		System.out.println("Produto 	Preço unit.  	Qtd      Preço Total");
		for(int i = 0; i < produtos.length; i++ ) {
			if (precos[i] > 0) {
				System.out.println(produtos[i] + "         	" 
							+ precos[i] + "  	        " 
							+ (10 - estoque[i]) + "           " 
							+ ((10 - estoque[i]) * precos[i] ));
				System.out.println();
		}	
		}
		System.out.printf("Total do Carrinho = R$%.2f %n", total);
		sc.close();
	}
}
