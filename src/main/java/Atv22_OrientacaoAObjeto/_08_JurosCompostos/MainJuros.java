package Atv22_OrientacaoAObjeto._08_JurosCompostos;

import java.util.Scanner;

public class MainJuros {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JurosCompostos jur= new JurosCompostos();

        do {
            System.out.println("Digite o capital inicial investido em R$:");
            jur.c = sc.nextDouble();
            if (jur.c <= 0) {
                System.out.println("Digite um valor válido");
            }
        }while (jur.c<=0);

        do {
            System.out.println("Digite o tempo da aplicação:");
            jur.t = sc.nextInt();
            if (jur.t <= 0) {
                System.out.println("Digite um tempo válido");
            }
        } while (jur.t<=0);

        do {
            System.out.println("Digite a taxa de juros:");
            jur.i= sc.nextDouble();
            if(jur.i<=0){
                System.out.println("Digite uma taxa válida");
            }
        } while (jur.i<=0);

        System.out.printf("O valor do montante é de R$ %.2f%n", jur.juros());
        sc.close();
    }
}
