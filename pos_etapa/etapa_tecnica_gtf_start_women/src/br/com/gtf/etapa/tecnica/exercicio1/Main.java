package br.com.gtf.etapa.tecnica.exercicio1;

import java.math.BigDecimal;
import java.util.Scanner;
/*1. As GFT Brasil resolveu dar um aumento de salário aos seus colaboradores
e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste
segundo o seguinte critério, baseado no salário atual;

a. Salários até R$ 280,00 (incluindo): aumento de 20%;
b. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
c. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
d. Salários de R$ 1500,00 em diante: aumento de 5%

Após o aumento ser realizado; informe na tela;
a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento. (Vale 3 pontos)*/

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double salario = 0d;
        BigDecimal bd = new BigDecimal(salario);
        Double novosalario = 0d;


        System.out.println("Digite valor do salario atual");
        salario = ler.nextDouble();

        Funcionario c = new Funcionario(salario);
        System.out.println("antes do reajuste");
        System.out.println(salario);
         c.receberSalario(salario);
        System.out.println("O percentual de aumento aplicado");
        System.out.println(c.getPorcentagem());

        System.out.println("O novo salário, após o aumento");
        System.out.println(c.getSalario());


    }
}
