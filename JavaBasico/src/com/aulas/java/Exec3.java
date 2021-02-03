package com.aulas.java;

import java.util.Scanner;

public class Exec3 {

// Exercicio 3 Questao 3 do curso de Java Basico
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o ano do seu nascimento: ");
		int anoNasc = scan.nextInt();
		
		int idade = 2021 - anoNasc;
		
		boolean maiorIdade = idade >= 18 ? true:false;
		
		if(maiorIdade) {
			System.out.println("Seu nome é: "+nome+", sua idade é: "+idade+" e você é maior de idade!");
		}else {
			System.out.println("Seu nome é: "+nome+", sua idade é: "+idade+" e você é menor de idade!");
		}
	}

}
