package condicionais;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*	
		2.Escreva um programa para ler o ano de nascimento de uma pessoa e 
		escrever uma mensagem que diga se ela poderá ou não votar este ano
		*/
		
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Digite o ano do seu nascimento: ");
		int anoNasc = sc.nextInt();
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt(); 
		idade = anoAtual - anoNasc;
		
		if ((anoAtual - anoNasc) >= 16) {
			System.out.println("Você tem " + idade + " anos e poderá votar este ano");
		} else {
			System.out.println("Você tem " + idade + " anos e NÃO poderá votar este ano");
		}
		
		sc.close();
	}
}
