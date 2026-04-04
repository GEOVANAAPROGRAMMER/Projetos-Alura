package com.java.objetos;

public class Teste {
	
	public static void main(String[] args) {
//		
//		// Testando a classe pessoa
//		Pessoa pessoa1 = new Pessoa();
//		pessoa1.setNome("Geovana");
//		pessoa1.setIdade(22);
//		pessoa1.verificaIdade();
//		
//		
//		// Testando a classe calculadora
//		Calculadora calculadora = new Calculadora(8);
//		System.out.println("Dobro: " + calculadora.retornaDobro());
//		
//		// Testando a classe carro
//		Carro carro = new Carro("Palio", 1997, "Azul");
//		carro.exibirFichaTecnica();
//		
//		// Testando a classe Produto
//		Produto produto = new Produto();
//		produto.setNome("Teclado");
//		produto.setPreco(100);
//		System.out.println("De R$ "+ produto.getPreco() + " , com desconto o produto sairá por R$ "+ produto.aplicarDesconto(10.5));
//		
//		// Testando a classe Aluno
//		Aluno aluno = new Aluno();
//		aluno.setNome("Carlos");
//		aluno.setNotas(new double[]{7.5, 8.0, 9.0});
//
//		System.out.println("Aluno: " + aluno.getNome());
//		System.out.println("Média: " + aluno.calcularMedia());
		
		// Testando a classe Livro
		Livro livro = new Livro();
		livro.setAutor("Anne");
		livro.setTitulo("Anne Frank");
		livro.exibirDetalhes();
	}

}
