package exercicioSala16_10_21;

public class Peixes extends Animal{
	
	private String tipoEsqueleto; //ósseo ou cartilaginoso
	
	
	public String getTipoEsqueleto() {
		return tipoEsqueleto;
	}

	public void setTipoEsqueleto(String tipoEsqueleto) {
		this.tipoEsqueleto = tipoEsqueleto;
	}

	@Override
	public void comunicar() {
		System.out.println("Glub glub");
		
	}

	@Override
	public String toString() {
		return "Peixes [Nome = " + getNome() +", Tipo do Esqueleto = " + getTipoEsqueleto() + ", Sexo = " + getSexo() + "]";
	}

	
}
