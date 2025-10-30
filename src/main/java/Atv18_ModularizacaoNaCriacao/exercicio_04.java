package Atv18_ModularizacaoNaCriacao;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite um número que deseje saber o fatorial");
        int n1=sc.nextInt();

        CalculadoraFatorial(n1);

        sc.close();
    }

    public static void CalculadoraFatorial (int x) {

        int n2=x-1;
        int n3=x*n2;


        while (n2!=1) {
            n2-=1;
            n3*=n2;
        }
        System.out.println(n3);
    }
}
