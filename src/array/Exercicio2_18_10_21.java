package array;

public class Exercicio2_18_10_21 {

	public static void main(String[] args) {
//		2. Dado o seguinte array: int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11,
//				27, 34, 89, 101, 125}; 
//		A. Retorne somente com n�meros pares
//		B. Retorne somente com os n�meros �mpares * 2.
		
		int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};
		
		System.out.println("N�meros pares:");
		for(int numero : array2) {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		}
		System.out.println("Numeros �mpares * 2:");
		for(int numero2 : array2) {
			if(numero2% 2 != 0) {
				System.out.println(numero2 + " * 2 = " + numero2 * 2);
			}
		}
		
	}
}