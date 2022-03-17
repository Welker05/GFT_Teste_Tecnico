package Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double imc;

        System.out.println("Informe o seu nome");
        String nome = sc.next();

        System.out.println("Informe sua altura");
        double altura = sc.nextDouble();

        System.out.println("Informe seu peso");
        double peso = sc.nextDouble();

        imc = peso /(altura * altura);

        if (imc < 18.5){
            System.out.println(nome + "," + peso + "Kg ," + altura + " de altura ," + " imc de " +String.format("%.1f", imc)+ " , Abaixo do peso");
        }else if (imc <= 24.9){
            System.out.println(nome + "," + peso + "Kg ," + altura + " de altura ," + " imc de " +String.format("%.1f", imc)+ " , Peso normal");
        }else if(imc <= 29.9){
            System.out.println(nome + "," + peso + "Kg ," + altura + " de altura ," + " imc de " +String.format("%.1f", imc)+ " , Sobrepeso");
        }else if (imc <= 34.9){
            System.out.println(nome + "," + peso + "Kg ," + altura + " de altura ," + " imc de " +String.format("%.1f", imc)+ " , Obesidade grau 1");
        }else if (imc <= 39.9){
            System.out.println(nome + "," + peso + "Kg ," + altura + " de altura ," + " imc de " +String.format("%.1f", imc)+ " , Obesidade grau 2");
        }else{
            System.out.println(nome + "," + peso + "Kg ," + altura + " de altura ," + " imc de " +String.format("%.1f", imc)+ " , Obesidade grau 3");
        }
    }
}
