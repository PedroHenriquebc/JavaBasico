package aulas.exe6;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("Joao");
		String s2 = new String("Maria");
		String s3 = "Pedro";
		String s4 = "Henrique";
		
		int tamanhoString = s1.length() + s2.length();
		System.out.println("A soma dos tamanhos das strings é: "+tamanhoString);
		
		if(s1.equals(s2)) {
			System.out.println("As strings possuem o mesmo conteúdo.");
		}else {
			System.out.println("As strings não possuem o mesmo conteúdo.");
		}
		
		if(s1 == s2) {
			System.out.println("São o mesmo objeto!");
		}else {
			System.out.println("Não são o mesmo objeto");
		}
		
		System.out.println(" ");
		
		if(s3.equals(s4)) {
			System.out.println("As strings possuem o mesmo conteúdo.");
		}else {
			System.out.println("As strings não possuem o mesmo conteúdo.");
		}
		
		if(s3 == s4) {
			System.out.println("São o mesmo objeto!");
		}else {
			System.out.println("Não são o mesmo objeto");
		}
		
	}

}
