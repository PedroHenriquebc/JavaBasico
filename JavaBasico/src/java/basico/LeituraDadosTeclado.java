package java.basico;

import java.util.*;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo, seu primeiro nome, sua altura, sua idade, tem bicho de estima??o?");
		
		String nomeCompleto = scan.nextLine();
		String primeiroNome = scan.next();
		double altura = scan.nextDouble();
		int idade = scan.nextInt();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Seu nome completo: " + nomeCompleto);
		System.out.println("Seu primeiro nome: " + primeiroNome);
		System.out.println("Sua altura: " + altura);
		System.out.println("Sua idade: " + idade);
		System.out.println("Tem bicho de estima??o? " + temPet);
	}

}
