package br.com.gtf.etapa.tecnica.exercicio3;

public class Pessoa {

    private int idade;
    private int peso;
    private double altura;

    public Pessoa() {

    }

    public Pessoa(int idade, int peso, double altura) {
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
