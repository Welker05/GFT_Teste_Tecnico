package Exercicio1;

public class Supervisor extends Colaborador{
    public Supervisor(String nome, int idade, double salario,  int grauInstrucao){
        super(nome,idade,salario,grauInstrucao);
    }

    @Override
    public double bonificacao(){
        return this.salario+500.00*grauInstrucao*3;
    }

    @Override
    public String toString(){
        return "Supervisor {Nome: "+nome+", Rendimento total: R$ "+String.format("%.2f", this.bonificacao())+"}";
    }
}
