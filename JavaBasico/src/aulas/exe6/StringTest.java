package aulas.exe6;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("Joao");
		String s2 = new String("Joao");
		String s3 = "Joao";
		String s4 = "Joao";
		
		int tamanhoString = s1.length() + s2.length();
		System.out.println("A soma dos tamanhos das strings é: "+tamanhoString);
		
		if(s1.equals(s2)) {
			System.out.println("As strings s1 e s2 possuem o mesmo conteúdo.");
		}else {
			System.out.println("As strings s1 e s2 não possuem o mesmo conteúdo.");
		}
		
		if(s1 == s2) {
			System.out.println("s1 e s2 são o mesmo objeto!");
		}else {
			System.out.println("s1 e s2 não são o mesmo objeto");
		}
		
		System.out.println(" ");
		
		if(s3.equals(s4)) {
			System.out.println("As strings s3 e s4 possuem o mesmo conteúdo.");
		}else {
			System.out.println("As strings s3 e s4 não possuem o mesmo conteúdo.");
		}
		
		if(s3 == s4) {
			System.out.println("s3 e s4 são o mesmo objeto!");
		}else {
			System.out.println("s3 e s4 não são o mesmo objeto");
		}
		
		System.out.println(" ");
		System.out.println("Mudando s3 para Maria");
		s3 = "Maria";
		
		if(s3.equals(s4)) {
			System.out.println("As strings s3 e s4 possuem o mesmo conteúdo.");
		}else {
			System.out.println("As strings s3 e s4 não possuem o mesmo conteúdo.");
		}
		
		if(s3 == s4) {
			System.out.println("s3 e s4 são o mesmo objeto!");
		}else {
			System.out.println("s3 e s4 não são o mesmo objeto");
		}
		
	}

}
