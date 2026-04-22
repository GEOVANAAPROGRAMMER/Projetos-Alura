package com.java.array.contaBancaria;

public class ContaBancaria {
	
	private int numDaConta;
	private double saldo;
	
	public ContaBancaria(int numDaConta, double saldo) {
		this.numDaConta = numDaConta;
		this.saldo = saldo;
	}
	
	public int getNumDaConta() {
		return numDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

}
