package com.java.catalogo.modelo;

import com.java.catalogo.excecao.ErroAoConverterAnoException;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    
    public Titulo (String nome, int anoDeLancamento) {
    	this.nome = nome;
    	this.anoDeLancamento = anoDeLancamento;
    }
    
    public Titulo(TituloOmdb meuTituloOmdb) {
		this.nome = meuTituloOmdb.getTitle();
		
		if(meuTituloOmdb.getYear().length() > 4) {
			throw new ErroAoConverterAnoException ("Não foi possível converter o ano de lançamento");
		}
		this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.getYear());
		this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.getRuntime().substring(0, 3));
	}

	public void exibeFichaTecnica() {
        System.out.println("Nome do filme/série: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

	@Override
	public int compareTo(Titulo outrosTitulos) {

		return this.getNome().compareTo(outrosTitulos.getNome());
	}
	
	@Override
	public String toString () {
		return "(Titulo: "+ nome + " Ano de Lançamento: " + anoDeLancamento + " Tempo: " + duracaoEmMinutos + ") ";
		
	}

}
