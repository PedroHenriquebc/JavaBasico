package estruturasDeControle;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
//		4. Crie um programa que recebe 10 valores e ao final imprima o maior
//		número.
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um numero: ");
			int numero = sc.nextInt();
			if(numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O maior número é: " + maior);
		sc.close();
		
	}

}
