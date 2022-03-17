package Exercicio1;

public class Gerente extends Colaborador{

    public Gerente(String nome, int idade, double salario, int grauInstrucao){
        super(nome,idade,salario,grauInstrucao);
    }

    @Override
    public double bonificacao(){
        return salario+1000.00 * grauInstrucao* 2;
    }

    @Override
    public String toString(){
        return "Gerente {Nome: "+nome+", Rendimento total: R$ "+String.format("%.2f", this.bonificacao())+"}";
    }

}
