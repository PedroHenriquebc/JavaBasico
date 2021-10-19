package array;

import java.util.Scanner;

public class CarrinhoDeCompras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd;
		double total = 0;
		String sair = "n";
		
		System.out.println("Tabela de produtos");
		System.out.println();
		System.out.println("  produto 		preço unit  	qtd em estoque");
		System.out.println("[0]arroz  			4,99 			  10");
		System.out.println("[1]feijao  			6,90 			  10");
		System.out.println("[2]oleo  			7,89 			  10");
		System.out.println();
		System.out.println("[4] para sair");
		
		String [] produtos = new String[3];
		double [] precos = new double[3];
		
		System.out.println("Digite o número do produto que deseja");
		int entrada = sc.nextInt();
		
		while(entrada != 4) {
			if (entrada == 0) {
				System.out.println("Digite a quantidade de Arroz que você deseja: ");
				qtd = sc.nextInt();
				total += precos[0] * qtd;
			} else if (entrada == 1){
				System.out.println("Digite a quantidade Feijão que você deseja: ");
				qtd = sc.nextInt();
				total += precos[1] * qtd;
			} else if (entrada == 2){
				System.out.println("Digite a quantidade Óleo que você deseja: ");
				qtd = sc.nextInt();
				total += precos[2] * qtd;
				}
			System.out.println();
			}
		
		sc.close();
	}

}
