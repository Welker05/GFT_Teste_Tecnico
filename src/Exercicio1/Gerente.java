package Exercicio1;

public class Gerente extends Colaborador{

    public Gerente(String nome, int idade, double salario, int grauInstrucao){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.setGrauInstrucao(grauInstrucao);
    }

    @Override
    public double bonificacao(){
        return this.getSalario()+1000.00 * getGrauInstrucao()* 2;
    }

    @Override
    public String toString(){
        return "Gerente {Nome: "+this.getNome()+", Rendimento total: R$ "+String.format("%.2f", this.bonificacao())+"}";
    }

}
