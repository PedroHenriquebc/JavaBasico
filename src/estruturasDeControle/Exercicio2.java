package estruturasDeControle;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
//		2. Criar um programa que, enquanto estiver recebendo n�meros positivos,
//		imprime no console a soma dos n�meros inseridos, caso receba um
//		n�mero negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		double numero = sc.nextDouble();
		double soma = 0;
		while(numero >= 0) {
			soma += numero;
			System.out.println("A soma vale: " + soma);
			System.out.println("Digite outro numero: ");
			numero = sc.nextDouble();
		}
		sc.close();

	}

}
