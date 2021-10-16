package execicioSala15_10_21;

public class Exercicio2 {

	public static void main(String[] args) {
//		2- Faça um programa que mostre uma contagem na tela de 233 a 456, só que 
//		contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		
		int i = 233;
		System.out.println(i);
		while(i <= 456) {
			if(i >= 300 && i <= 400) {
				i += 3;
				System.out.println(i);
			} else {
				i += 5;
				System.out.println(i);
			}
		}
	}

}
