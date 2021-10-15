package repeticao;

import java.util.Scanner;

public class Exercicio1While {

	public static void main(String[] args) {
//		Calcular média de X alunos.
//		Notas válidas: entre 0 e 10
//		Contar quantas notas válidas foram digitadas
//		Usuário deve digitar -1 para sair do programa e ser informado da sua média e quantidade de notas
		
		Scanner sc = new Scanner(System.in);
		
		double media;
		double soma = 0;
		int cont = 0;
		
		System.out.println("Digite uma nota(-1 para finalizar e ver a média): ");
		double nota = sc.nextDouble();
		while(nota == -1) {
			System.out.println("Digite pelomenos uma nota: ");
			nota = sc.nextDouble();
		}
		
		while(nota != -1) {
			if (nota > 10 || nota < 0) {
				System.out.print("Nota inválida! ");
			} else {
				soma += nota;
				cont ++;
			}
			System.out.println("Digite outra nota: ");
			nota = sc.nextDouble();
		}
		media = soma / cont;
		
		System.out.printf("A média é de: %.2f %n", media);
		
		sc.close();
	}

}
