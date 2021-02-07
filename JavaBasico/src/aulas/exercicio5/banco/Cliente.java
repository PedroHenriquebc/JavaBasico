package aulas.exercicio5.banco;

public class Cliente {
	private String nome;
	private String cpf;
	
	// CONSTRUTORES
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;	
	}

	public Cliente() {
		super();
	}
	
	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Cliente [NOME: " +nome+", CPF: "+cpf+"]";
	}
}
