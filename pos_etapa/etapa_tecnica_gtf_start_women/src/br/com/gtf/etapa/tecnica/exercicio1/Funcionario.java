package br.com.gtf.etapa.tecnica.exercicio1;

public class Funcionario {

    private double salario;

    private double porcentagem = 0d;



    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    protected  void receberSalario(Double salario){
        double salatual = this.getSalario();

        double novoSalario = 0d;
        if(salatual <= 280.0){
            porcentagem = salatual  * 0.2;
            System.out.println("20%");
            setPorcentagem(porcentagem);
            novoSalario = salatual +  porcentagem;
           setSalario(novoSalario);

        } else if (salatual > 280.0 || salatual <= 700.0) {
            porcentagem = salatual  * 0.15;
            System.out.println("15%");
            setPorcentagem(porcentagem);

            novoSalario = salatual + porcentagem;
            setSalario(novoSalario);
        } else if (salatual > 700 || salatual < 1500) {
            porcentagem = salatual  * 0.1;
            System.out.println("10%");
            setPorcentagem(porcentagem);
            novoSalario = salatual + porcentagem;
            setSalario(novoSalario);

        }else if( salatual > 1500){
            porcentagem = salatual  * 0.05;
            System.out.println("5%");
            setPorcentagem(porcentagem);
            novoSalario = salatual + porcentagem;
            setSalario(novoSalario);
        }


    }

}
