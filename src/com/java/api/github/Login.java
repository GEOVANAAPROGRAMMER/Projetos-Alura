package com.java.api.github;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do usuário do GitHub: ");
        String usuario = sc.nextLine();

        try {

            String endereco = "https://api.github.com/users/" + usuario;

            URL url = new URL(endereco);

            HttpURLConnection conexao =
                    (HttpURLConnection) url.openConnection();

            conexao.setRequestMethod("GET");


            if (conexao.getResponseCode() == 404) {
                throw new ErroConsultaGitHubException(
                        "Usuário não encontrado no GitHub.");
            }

            BufferedReader leitura = new BufferedReader(
                    new InputStreamReader(conexao.getInputStream()));

            String linha;
            StringBuilder resposta = new StringBuilder();

            while ((linha = leitura.readLine()) != null) {
                resposta.append(linha);
            }

            leitura.close();

            System.out.println("\nConsulta realizada com sucesso!");
            System.out.println(resposta.toString());

        } catch (ErroConsultaGitHubException e) {

            System.out.println("⚠ " + e.getMessage());

        } catch (IOException e) {

            System.out.println(
                    "Ocorreu um erro ao consultar a API do GitHub."
            );
        }

        sc.close();
    }
}