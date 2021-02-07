package aulas.java;

import java.util.Scanner;

public class Exec2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro nome do usuario: ");
		String primeiroNome = scan.nextLine();
		
		System.out.println("Digite o segundo nome do usuario: ");
		String segundoNome = scan.nextLine();
		
		System.out.println("Ola "+primeiroNome+" "+ segundoNome+", Bem vindo ao curso de Java. \nQualiti Innovate Learning.");
	}

}
