package Exercicio1;

public class Vendedor extends Colaborador{
    public Vendedor(String nome, int idade, double salario,  int grauInstrucao){
        super(nome,idade,salario,grauInstrucao);
    }

    @Override
    public double bonificacao(){
        return salario+300.00*grauInstrucao*4;
    }

    @Override
    public String toString(){
        return "Vendedor {Nome: "+nome+", Rendimento total: R$ "+String.format("%.2f", this.bonificacao())+"}";
    }
}
