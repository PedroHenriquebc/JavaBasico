package aulas.java;

import java.util.Scanner;

public class Exec3 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o ano do seu nascimento: ");
		int anoNasc = scan.nextInt();
		
		int idade = 2021 - anoNasc;
		
		System.out.println("Seu nome é: "+nome+", sua idade é: "+idade+
		(idade>=18?" e você é maior de idade!" : " e você é menor de idade!"));
	}

}
