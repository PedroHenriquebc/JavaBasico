package com.aulas.java;

public class Conta {
	String numero;  // atributo pode ter modificador
	double saldo;	// de acesso
	
	void creditar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	String getNumero() {
		return numero;
	}
	
	double getSaldo() {
		return saldo;
	}
}
