package exercicioSala16_10_21;

public class Aves extends Animal {

	private boolean Voar;
	
	public boolean isVoar() {
		return Voar;
	}

	public void setVoar(boolean voar) {
		Voar = voar;
	}
	 
	@Override
	public void comunicar() {
		System.out.println("Pia");
	}
	
	@Override
	public void movimentar() {
		if (this.Voar == true) {
			System.out.println("Bate asas e voa");
		} else {
			System.out.println("Caminha");
		}
	}

	@Override
	public String toString() {
		return "Aves [Nome = " + getNome() + ", Voa? = " + Voar + ", Sexo = " + getSexo() + "]";
	}

	

	
	
}
