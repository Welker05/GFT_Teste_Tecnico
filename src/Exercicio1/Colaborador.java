package Exercicio1;

public abstract class Colaborador {
    protected String nome;
    protected int idade;
    protected double salario;
    protected int grauInstrucao;

    public Colaborador (String nome,int idade,double salario,int grauInstrucao){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        setGrauInstrucao(grauInstrucao);
    }

    public void setGrauInstrucao(int grauInstrucao) {
        if (grauInstrucao >= 1 && grauInstrucao <= 5)
            this.grauInstrucao = grauInstrucao;
    }

    public abstract double bonificacao();
}
