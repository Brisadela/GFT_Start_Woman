package br.com.gtf.etapa.tecnica.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int menu;
        double nota = 0;
        double media = 0;

        System.out.println("\n Menu \n======");
        System.out.println(" Escolha a opção: \n==================");
        System.out.println("1 - para calcular média aritmética;");
        System.out.println("2 - para calcular média ponderada;");
        System.out.println("s - para sair.");
        menu = ler.nextInt();

        List<Double> notas = new ArrayList<Double>();
        for (int i = 0; i <= 2; i++) {
            System.out.println("Digite o valor da nota " + i + ":");
            nota = ler.nextDouble();
            notas.add(nota);
        }

        int soma = 0;
        switch (menu){
            case 1:
                System.out.println("Media" + soma / notas.size());



                break;
            case 2:

                break;
            }

        }







}


