package repeticao;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
//		For
//		Criar um programa que receba um n�mero e diga se ele � um n�mero primo.
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			if (numero % i == 0){
				cont++;
			}
		}
		if (cont == 2) {
			System.out.printf("O n�mero %d � primo!", numero);
		} else {
			System.out.printf("O n�mero %d n�o � primo!", numero);
		}
		sc.close();
	}

}
