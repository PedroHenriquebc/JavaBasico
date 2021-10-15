package repeticao;

import java.util.Scanner;

public class Exercicio1While {

	public static void main(String[] args) {
//		Calcular m�dia de X alunos.
//		Notas v�lidas: entre 0 e 10
//		Contar quantas notas v�lidas foram digitadas
//		Usu�rio deve digitar -1 para sair do programa e ser informado da sua m�dia e quantidade de notas
		
		Scanner sc = new Scanner(System.in);
		
		double media;
		double soma = 0;
		int cont = 0;
		
		System.out.println("Digite uma nota(-1 para finalizar e ver a m�dia): ");
		double nota = sc.nextDouble();
		while(nota == -1) {
			System.out.println("Digite pelomenos uma nota: ");
			nota = sc.nextDouble();
		}
		
		while(nota != -1) {
			if (nota > 10 || nota < 0) {
				System.out.print("Nota inv�lida! ");
			} else {
				soma += nota;
				cont ++;
			}
			System.out.println("Digite outra nota: ");
			nota = sc.nextDouble();
		}
		media = soma / cont;
		
		System.out.printf("A m�dia � de: %.2f %n", media);
		
		sc.close();
	}

}
