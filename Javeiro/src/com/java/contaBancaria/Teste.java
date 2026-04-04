package com.java.contaBancaria;

public class Teste {

	public static void main(String[] args) {

        Conta conta = new Conta(1000);
        SistemaBanco sistema = new SistemaBanco(conta);
        sistema.iniciar();
    }
}