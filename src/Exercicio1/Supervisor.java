package Exercicio1;

public class Supervisor extends Colaborador{
    public Supervisor(String nome, int idade, double salario,  int grauInstrucao){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.setGrauInstrucao(grauInstrucao);
    }

    @Override
    public double bonificacao(){
        return this.getSalario()+500.00*getGrauInstrucao()*3;
    }
    @Override
    public String toString(){
        return "Supervisor {Nome: "+this.getNome()+", Rendimento total: R$ "+String.format("%.2f", this.bonificacao())+"}";
    }
}
