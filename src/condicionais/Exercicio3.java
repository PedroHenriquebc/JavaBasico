package condicionais;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		  Escreva um programa que verifique a validade de uma senha fornecida 
		  pelo usuário. A senha válida é o número 1234.	Devem ser	impressas as 
		  seguintes	mensagens: ACESSO	PERMITIDO	caso	a	senha	seja	válida. 
		  ACESSO	NEGADO	caso	a	senha	seja	inválida.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma senha:");
		String senha = sc.next();
		
		if (senha.equals("1234")) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		
		sc.close();
	}

}
