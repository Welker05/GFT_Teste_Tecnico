package Exercicio2;

import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero = sc.next();
        int quantidadeImpar = 0;

        if(Integer.parseInt(numero) <= 350 || Integer.parseInt(numero) >= 8750){
            System.out.println("Entrada deve conter entre 3 e 4 digitos");
            return;
        }

        for(int i = 0;i < numero.length();i++){
            if(Integer.parseInt(numero.substring(i,i+1)) %2 != 0) {
                quantidadeImpar++;
            }
        }
        System.out.println(quantidadeImpar);
    }
}






















