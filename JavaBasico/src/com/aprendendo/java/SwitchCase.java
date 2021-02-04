package com.aprendendo.java;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero para um mes: ");
		int mesInteiro = scan.nextInt();
		switch (mesInteiro) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Fev");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Abr");
			break;
		case 5:
			System.out.println("Mai");
			break;
		default:
			System.out.println("Valor inválido");
		}
	}

}
