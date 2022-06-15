package br.com.gtf.etapa.tecnica.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 4. Escreva um programa que pergunte o dia, mês e ano do aniversário de uma
pessoa e diga se a data é válida ou não. Caso não seja, diga o motivo.
Suponha que todos os meses têm 31 dias e que estejamos no ano de 2000.
Caso a data esteja correta imprima “Data válida”. (vale 2 pontos)*/
public class Main {
    public static void main(String[] args) {


        int dia, mes, ano;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite sua data de aniversario");
            System.out.println("Digite dia: ");
            dia = ler.nextInt();
            System.out.println("Digite mes: ");
            mes = ler.nextInt();
            System.out.println("Digite ano: ");
            ano = ler.nextInt();

            if (dia >= 1 && dia <= 31){
                if(mes >= 1 && mes<= 12) {
                    if (ano == 2000){
                        System.out.println("“Data válida");
                    }else{
                        System.out.println("Data inválida, ano não correspondente com atualidade”: ");
                    }
                }else{
                    System.out.println("Data inválida, mes não correspondente com calendario”: ");
                }
            }else{
                System.out.println("Data inválida, dia não correspondente com calendario”: ");
            }
            break;
        }while(true);






    }

}
