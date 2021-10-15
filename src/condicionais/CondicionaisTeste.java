package condicionais;

public class CondicionaisTeste {

	public static void main(String[] args) {
		int idade = 15;
		int pessoas = 4;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
		} else if (pessoas >= 3) {
			System.out.println("Você pode entrar, pois está acompanhado.");
		} else {
			System.out.println("Você não tem mais de 18 anos.");
		}
	}

}