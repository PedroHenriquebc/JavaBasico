package estruturasDeControle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
//		3. Criar um programa que receba uma palavra e em seguida imprime no
//		console letra por letra.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = sc.next();
		
		for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
		sc.close();
	}

}
