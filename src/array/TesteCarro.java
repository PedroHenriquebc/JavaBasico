package array;

public class TesteCarro {

	public static void main(String[] args) {
		String joao = "Joao";
		String maria = "Maria";
		String jose = "Jose";
		String pedro = "Pedro";
		
		String [] carro = new String[4];
		
		carro[0] = joao;
		carro[1] = maria;
		carro[2] = jose;
		carro[3] = pedro;
		
		System.out.println("Carro comporta: " + carro.length);
		
		for(int i = 0; i < carro.length; i++) {
			System.out.println(carro[i]);
		}
	}

}
