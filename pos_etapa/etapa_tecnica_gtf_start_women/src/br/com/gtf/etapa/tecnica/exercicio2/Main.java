package br.com.gtf.etapa.tecnica.exercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*2. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:

1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada:
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar
a média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.*/

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int menu;
        double soma = 0d;
        double nota = 0;
        double media = 0d;
        double mediaP = 0d;




        List<Double> notas = new ArrayList<Double>();
        for (int i = 0; i <= 2; i++) {
            System.out.println("Digite o valor da nota " + i + ":");
            nota = ler.nextDouble();
            soma += nota;
            notas.add(nota);
        }
        do {


            System.out.println(" Escolha a opção: \n==================");
            System.out.println("1 - para calcular média aritmética;");
            System.out.println("2 - para calcular média ponderada;");
            System.out.println("s - para sair.");
            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    Iterator<Double> iterator = notas.iterator();

                    while (iterator.hasNext()) {
                        Double next = iterator.next();
                        soma += next;
                    }
                    media = soma / notas.size();
                    System.out.println("Media %d." + media);


                    break;
                case 2:
                    mediaP = (soma * 100) / notas.size();
                    System.out.println("Media Ponderada" + mediaP);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Valor digitado não correspondente");

            }

        } while (menu != 3);

    }
}










