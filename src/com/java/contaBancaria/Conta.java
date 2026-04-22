package com.java.contaBancaria;

public class Conta {
	
	private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void receberValor(double valor) {
        saldo += valor;
    }

    public void transferirValor(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
