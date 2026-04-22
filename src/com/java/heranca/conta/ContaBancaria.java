package com.java.heranca.conta;

public class ContaBancaria {
	
	protected double saldo;

	public double consultarSaldo() {
		return saldo;
	}
	
	public void sacar(double valor) {
		if (valor >= saldo) {
			saldo -= valor;
		} else {
			System.out.println("Operação inválida! \nVocê não possui valor suficiente para realizar o saque.");
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

}
