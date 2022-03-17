package Exercicio3;

public class Principal{
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(4249,"Gabriel",500.00);
        ContaPoupanca cp = new ContaPoupanca(7275,"Wesley",500.00);

        System.out.println(cc);
        System.out.println(cp);
    }
}