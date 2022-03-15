package Exercicio1;

public class Vendedor extends Colaborador{
    public Vendedor(String nome, int idade, double salario,  int grauInstrucao){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.setGrauInstrucao(grauInstrucao);
    }

    @Override
    public double bonificacao(){
        return this.getSalario()+300.00*getGrauInstrucao()*4;
    }

    @Override
    public String toString(){
        return "Vendedor {Nome: "+this.getNome()+", Rendimento total: R$ "+String.format("%.2f", this.bonificacao())+"}";
    }
}
