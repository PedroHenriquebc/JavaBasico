package array;

public class Aluno {
	private String nome;
	private double[] notas;

	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double maiorNota() {
		double maior = 0;
		for (double nota : this.notas) {
			if (nota > maior) {
				maior = nota;
			}
		}
		return maior;
	}

	public double media() {
		double somaNotas = 0;
		for (double nota : this.notas) {
			somaNotas += nota;
		}
		return somaNotas / this.notas.length;
	}

	public boolean aprovado() {
		if (this.media() >= 7.0) {
			return true;
		} else {
			return false;
		}
	}
}
