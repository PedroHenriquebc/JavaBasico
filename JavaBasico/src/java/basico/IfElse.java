package java.basico;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o pre?o do item: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Est? barato, pode comprar!");
		}else if(valor > 10 && valor < 15) {
			System.out.println("Pedir desconto!");
		}else if(valor >= 15 && valor < 20) {
			System.out.println("Pesquisar mais!");
		}else {
			System.out.println("Muito caro, n?o compre!");
		}
	}

}
