package exercicioSala16_10_21;

public class TesteAnimal {

	public static void main(String[] args) {
		Aves a1 = new Aves();
		a1.setNome("Galinha");
		a1.setSexo("fêmea");
		a1.setVoar(false);
		System.out.println(a1);
		a1.comunicar();
		a1.movimentar();
		
		System.out.println();
		
		Aves a2 = new Aves();
		a2.setNome("Bem-te-vi");
		a2.setSexo("Macho");
		a2.setVoar(true);
		System.out.println(a2);
		a2.comunicar();
		a2.movimentar();
		
		System.out.println();
		
		Peixes p1 = new Peixes();
		p1.setNome("Tubarão");
		p1.setSexo("Macho");
		p1.setTipoEsqueleto("Cartilaginoso");
		System.out.println(p1);
		p1.comunicar();
		p1.movimentar();
		
	}

}
