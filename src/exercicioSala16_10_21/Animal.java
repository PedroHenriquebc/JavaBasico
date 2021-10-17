package exercicioSala16_10_21;

public abstract class Animal {
	private String nome;
	private String sexo;

	public abstract void comunicar();
	public abstract void movimentar();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
