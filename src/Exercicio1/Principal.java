package Exercicio1;

public class Principal{
    public static void main(String[] args) {
        Colaborador gerente = new Gerente("Welker",25,7000.00,5);
        Colaborador supervisor = new Supervisor("Julio",26,5000.00,3);
        Colaborador vendedor = new Vendedor("Carlos",22,3500.00,2);

        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);
    }
}
