package Atv18_ModularizacaoNaCriacao;

import java.util.Scanner;

public class exercicio_07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é primo");
        int n= sc.nextInt();

        System.out.println("O número " + n + VerificadorPrimo(n));
        sc.close();
    }

    public static String VerificadorPrimo (int x) {
        boolean verificacao= false;
        String msg= "";

        if (x==2) {
            verificacao= true;

        } else {
            for (int i=2; i<x; i++) {
                if (x%i == 0) {
                    verificacao= false;
                    break;
                } else
                    verificacao= true;
            }
        }

        if (verificacao= true) {
            msg= " é primo";
        } else
            msg= " não é  primo";

        return msg;
    }
}
