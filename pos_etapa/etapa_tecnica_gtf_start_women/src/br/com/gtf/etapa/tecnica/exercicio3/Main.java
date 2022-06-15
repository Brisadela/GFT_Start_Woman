package br.com.gtf.etapa.tecnica.exercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*3. Faça um programa que receba cinco idades, pesos e Alturas e que calcule
e mostre:
• A média das idades das dez pessoas;
• A quantidade de pessoas com peso superior a 90 quilos e altura inferior
a 1,50;
• A porcentagem de pessoas com idade entre 10 e 30 anos entre as
pessoas que medem mais de 1,90; (vale 2 pontos)*/
public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        List<Pessoa> pessoas = new ArrayList<Pessoa>();


        Scanner ler = new Scanner(System.in);
        int LIMITE = 2;
        for (int i = 0; i <= LIMITE; i++) {
            System.out.println("Idade: ");
            pessoa.setIdade(ler.nextInt());
            System.out.println("Peso: ");
            pessoa.setPeso(ler.nextInt());
            System.out.println("altura: ");
            pessoa.setAltura(ler.nextDouble());
            pessoas.add(pessoa);
        }

        //soma dos valores
        int soma = 0;
        for (Pessoa p : pessoas) {
            soma += p.getIdade();

        }
        System.out.println("Media" + (soma / pessoas.size()));

        int quantidePessoas = 0;
        int soma2 = 0;
        int qtd = 0;

        do {
            for (Pessoa p : pessoas) {


                if (p.getPeso() > 90 && p.getAltura() <= 1.50) {
                    quantidePessoas++;
                }
                if ((p.getIdade() >= 10 && p.getIdade() <= 30) && p.getAltura() >= 1.90) {
                    soma2 += p.getIdade();
                    qtd++;
                }



                System.out.println("quantidade" + quantidePessoas);

            }
            System.out.println("ponderada" + (soma2 * 100)/ qtd);

        } while (pessoas.size() <= 5) ;

    }
}





