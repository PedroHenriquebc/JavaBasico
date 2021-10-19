package array;

public class Exercicio1_18_10_21 {

	public static void main(String[] args) {
//		1. Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
//		A. Retorno o valor total da soma de todos os elementos com foreach
//		B. Retorne a m�dia de todos os elementos
//		C. Retorne o maior valor e o menor elemento
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int soma = 0;
		int maior = 0;
		int menor = 999;
		
		double media;
		for(int numero : array) {
			if(numero > maior) {
				maior = numero;
			} else if(numero < menor) {
				menor = numero; 
			}
			soma += numero;
		}
		media = soma / 10.0;
		
		System.out.println("A soma dos n�meros � de: " + soma);
		System.out.println("A m�dia � de: " + media);
		System.out.println("O maior n�mero do array � de: " + maior);
		System.out.println("O menor n�mero do array � de: " + menor);
	}

}
