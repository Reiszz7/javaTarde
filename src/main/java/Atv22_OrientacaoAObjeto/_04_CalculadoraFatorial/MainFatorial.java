package Atv22_OrientacaoAObjeto._04_CalculadoraFatorial;

import java.util.Scanner;

public class MainFatorial {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculo c= new Calculo();

        do {
            System.out.println("Digite um número inteiro para calcular seu fatorial");
            c.n = sc.nextInt();

            if (c.n < 0) {
                System.out.println("Digite um número positivo.");
            }
        } while (c.n < 0);

        System.out.println(c.n+"!= "+c.fatorial());
        sc.close();
    }
}
