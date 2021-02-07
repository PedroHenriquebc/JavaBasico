package aulas.exercicio5.banco;

public class Conta {
	private String numero;
	private double saldo;
	private Cliente cliente;
	
	//METODOS
	public void creditar(double valor) {
		this.saldo += valor;
		System.out.println("Crédito realizado com sucesso.");
	}
	
	public void debitar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Débito realizado com sucesso.");
		}else {
			System.out.println("Não foi possível realizar o débito, Saldo insuficiente.");
		}
	}
	
	public void transferir(Conta contaDestino, double valor) {
		if(valor <= this.saldo ) {
			this.saldo -= valor;
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
			System.out.println("Transferência realizada com sucesso.");
		}else {
			System.out.println("Não foi possível realizar a transferência, Saldo insuficiente.");
		}
	}
	
	//CONSTRUTORES
	public Conta(String numero, Cliente cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
	}

	public Conta(String numero, double saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public Conta() {
		super();
	}

	//GETTERS AND SETTERS
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Conta [N°" + numero + ", SALDO: " +"R$"+ saldo + "]";
	}
}
