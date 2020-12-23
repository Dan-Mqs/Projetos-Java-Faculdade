package Funcionarios;

public class FuncionarioMensalista extends Funcionario {
    protected double salMensal;
    protected int diasFalta;

    public FuncionarioMensalista(String nome, double salMensal, int diasFalta) {
        super(nome);
        this.salMensal = salMensal;
        this.diasFalta = diasFalta;
    }

    public double calculaSalario() {
        return (salMensal - ((salMensal * 0.02) * diasFalta));
    }
}
