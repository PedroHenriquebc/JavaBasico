package tryCatch;

import java.util.Scanner;

public class ExercicioSala30_10_21 {

	public static void main(String[] args) {
//		Desenvolva um algoritmo que pergunte ao usuário qual tabuada desejada e devolva 
//		a construção da tabuada escolhida.
//		-Quando solicitado qual a tabuada desejada, caso o usuário informe um tipo de 
//		resposta diferente de um tipo inteiro, ele deve receber uma mensagem de erro 
//		(tratar com try/catch)

		Scanner sc = new Scanner(System.in);

		boolean continuar = true;

		while (continuar) {
			try {
				System.out.println("Qual a tabuada vc deseja?");
				int n = sc.nextInt();
				for (int i = 0; i <= 10; i++) {
					System.out.println(n + " x " + i + " = " + n * i);
				}
				
			} catch (Exception e) {
				System.out.println("Entrada inválida!");
				sc.next();
			}
			System.out.println("Deseja continuar? (s/n)");
			String entrada = sc.next();
			if(entrada.equals("n")) {
				continuar = false;
				}
		}

		sc.close();
	}
}
