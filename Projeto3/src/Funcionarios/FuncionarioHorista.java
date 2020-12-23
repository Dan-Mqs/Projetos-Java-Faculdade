package Funcionarios;

public class FuncionarioHorista extends Funcionario {
    protected double salarioPorHora;
    protected double numeroHoras;

    public FuncionarioHorista(String nome, double salarioPorHora, double numeroHoras) {
        super(nome);
        this.salarioPorHora = salarioPorHora;
        this.numeroHoras = numeroHoras;
    }

    public double calculaSalario(){
        return this.salarioPorHora * this.numeroHoras;
    }
}
