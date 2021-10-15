package condicionais;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Faça um programa que receba três inteiros e diga qual deles é o maior e
		 * qual o menor. Conseguem criar mais de uma solução?
		 */

		int n1 = 21;
		int n2 = 3;
		int n3 = 16;
		int maior = n1;
		int menor = n2;

		if (n2 > n3 && n2 > n1) {
			maior = n2;
		} else if (n3 > n2 && n3 > n1) {
			maior = n3;
		}

		if (n3 < n2 && n3 < n2) {
			menor = n3;
		} else if (n1 < n2 && n1 < n3) {
			menor = n1;
		}
		System.out.println("O maior é: " + maior);
		System.out.println("O menor é: " + menor);

		/* Outra solução
		 
		if (menor > n2) {
			menor = n2;
		} else if (menor > n3) {
			menor = n3;
		}

		if (maior < n2) {
			maior = n2;
		} else if (maior < n3) {
			maior = n3;
		}

		System.out.println("O maior é: " + maior);
		System.out.println("O menor é: " + menor);
		
		*/
	}

}
