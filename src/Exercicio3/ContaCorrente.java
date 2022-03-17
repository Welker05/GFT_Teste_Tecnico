package Exercicio3;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento(){
        return ((getSaldo() -0.75) *0.05);
    }

    @Override
    public String toString() {
        return  "Numero da conta: " + getNumero() + " ,"
                + "Titular: " + getTitular() + " ,"
                +"Saldo: " + getSaldo()
                + " Conta Corrente ,"
                + "Rendimento: " + String.format("%.2f", rendimento());
    }
}