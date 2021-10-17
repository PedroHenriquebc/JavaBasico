package poo;

public class Carro implements CarroController{
	
	private String cor;
	private boolean ligado;
	private String marca;
	private int ano;
	private int velocidade;
	
	public Carro() {
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}


	@Override
	public void acelerar() {
		this.velocidade += 5;
		
	}

	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", ligado=" + ligado + ", marca=" + marca + ", ano=" + ano + ", velocidade="
				+ velocidade + "]";
	}
	
	
}
