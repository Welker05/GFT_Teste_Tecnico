package Exercicio3;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento(){
        return (getSaldo() *0.07);
    }

    @Override
    public String toString() {
        return  "Numero da conta: " + getNumero() + " ,"
                + "Titular: " + getTitular() + " ,"
                +"Saldo: " + getSaldo()
                + " Conta Poupanca ,"
                + "Rendimento: " + String.format("%.2f", rendimento());
    }
}