package condicionais;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular a 
		 média do aluno e dar o seguinte resultado:
  		 A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
  		 A mensagem "Reprovado", se a média for menor do que sete;
  		 A mensagem "Aprovado com Distinção", se a média for igual a dez. 
		 */
		
		Scanner sc = new Scanner(System.in);
		double media;
		System.out.println("Digite a nota 1: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		double n2 = sc.nextDouble();
		
		media = (n1 + n2) / 2;
		
		if (media >= 7.0) {
			System.out.println("Aprovado, sua média foi: " + media);
		} else if (media == 10.0) {
			System.out.println("Aprovado com distinção, sua média foi: " + media);
		} else {
			System.out.println("Reprovado, sua média foi: " + media);
		}
		
		sc.close();
	}

}
