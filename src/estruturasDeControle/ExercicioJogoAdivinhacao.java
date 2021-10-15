package estruturasDeControle;

import java.util.Random;
import java.util.Scanner;

public class ExercicioJogoAdivinhacao {

	public static void main(String[] args) {
//		1. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
//		Armazene um número aleatório em uma variável. O jogador tem 10
//		tentativas para adivinhar o número gerado. Ao final de cada tentativa,
//		imprima a quantidade de tentativas restantes, e imprima se o número
//		inserido é maior ou menor do que o número armazenado.
//		- Caso deseje, utilize o método Random() da coleção java util para sortear o
//		número:
//		import java.util.Random;
//		Random numeroAleatorio = new Random();
//		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = random.nextInt(101);
		int tentativas = 10;
		
		System.out.println("~ JOGO DA ADIVINHACAO ~");
		System.out.println("");
		System.out.printf("Você tem %d tentativas para adivinhar o número secreto entre 0 e 100!! %n", tentativas);
		System.out.println("Tente adivinhar o número secreto:  ");
		int numero = sc.nextInt();
		tentativas -= 1;
		
		while(tentativas > 0 && numero != numeroAleatorio) {
			if (numero > numeroAleatorio) {
				System.out.println("");
				System.out.println("Resposta Errada!!");
				System.out.printf("Dica: O número secreto é menor que %d! %n", numero );
			} else {
				
				System.out.println("");
				System.out.println("Resposta Errada!!");
				System.out.printf("Dica: O número secreto é maior que %d! %n", numero );
				
			}
			System.out.println("");
			System.out.printf("Você tem %d tentativas para adivinhar o número secreto! %n", tentativas);
			System.out.println("Tente adivinhar o número secreto:  ");
			numero = sc.nextInt();
			tentativas --;
			
			
		}
		
		if(tentativas > 0) {
			System.out.printf("Resposta correta!! O número secreto é %d %n", numeroAleatorio);
			System.out.printf("Você utilizou %d tentativa(s), parabéns!! %n", 10 - tentativas);
			System.out.println("~ FIM DO JOGO DA ADIVINHACAO ~");
		} else {
			System.out.println("Suas tentativas acabaram :(");
			System.out.printf("O número secreto era %d, Tente outra vez! %n", numeroAleatorio);
			System.out.println("############### FIM DO JOGO DA ADIVINHACAO ##############");
		}
		sc.close();
	}

}
