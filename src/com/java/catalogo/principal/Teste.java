package com.java.catalogo.principal;

import java.util.ArrayList;

import com.java.catalogo.calculadora.CalculadoraDeTempo;
import com.java.catalogo.calculadora.FiltroRecomendacoes;
import com.java.catalogo.modelo.Episodio;
import com.java.catalogo.modelo.Filme;
import com.java.catalogo.modelo.Serie;

public class Teste {
	
    public static void main(String[] args) {
    	CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    	
        Filme HarryPotter = new Filme("Harry Potter e a Pedra Filosofal", 2001);
        HarryPotter.setDuracaoEmMinutos(152);
        HarryPotter.setIncluidoNoPlano(true);

        HarryPotter.exibeFichaTecnica();
        HarryPotter.avalia(8.5);
        HarryPotter.avalia(6);
        HarryPotter.avalia(7.2);
        
        calculadora.incluiNoCalculo(HarryPotter);
        System.out.println("Total de tempo: " + calculadora.getTempoTotal());

        System.out.println("Média de avaliações do filme: " + HarryPotter.pegaMedia());
        
        FiltroRecomendacoes filtro = new FiltroRecomendacoes();
        filtro.filtra(HarryPotter);
        
        System.out.println("\n");
        
        Serie euNunca = new Serie("Eu nunca", 2020);
        euNunca.setIncluidoNoPlano(true);
        euNunca.setTemporadas(4);
        euNunca.setEpisodiosPorTemporada(10);
        euNunca.setAtiva(false);
        euNunca.setMinutosPorEpisodio(30);
        
        
        euNunca.exibeFichaTecnica();
        
        calculadora.incluiNoCalculo(euNunca);
        System.out.println("Total de tempo: " + calculadora.getTempoTotal());
        
        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setNome("Piloto");
        episodio1.setSerie(euNunca);
        episodio1.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio1);
        
        Filme jVorazes = new Filme("Jogos Vorazes", 2010);
        jVorazes.setDuracaoEmMinutos(180);
        jVorazes.setIncluidoNoPlano(true);
        
        Filme crepusculo = new Filme("Crepusculo", 2014);
        crepusculo.setDuracaoEmMinutos(180);
        crepusculo.setIncluidoNoPlano(true);
        
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(HarryPotter);
        listaDeFilmes.add(crepusculo);
        listaDeFilmes.add(jVorazes);
        
        System.out.println("\nTamanho da lista: "+ listaDeFilmes.size());
        System.out.println("Primeiro filme: "+ listaDeFilmes.get(1).getNome());
        System.out.println(listaDeFilmes);
        
        
    }

}