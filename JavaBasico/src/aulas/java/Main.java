package aulas.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero para ver seu fatorial: ");
		int cont = scan.nextInt();
		int fat = cont;
		int n = cont;
		
		while(cont > 1) {
			fat = fat * (cont - 1);
			cont--;
		}
		
		System.out.println("O fatorial de "+n+" é : "+fat);
	}

}
