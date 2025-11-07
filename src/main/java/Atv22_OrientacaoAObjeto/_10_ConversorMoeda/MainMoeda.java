package Atv22_OrientacaoAObjeto._10_ConversorMoeda;

import java.util.Scanner;

public class MainMoeda {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversor c = new Conversor();
        int op;

        do {
            System.out.println("Escolha uma opção de conversão \n" + "1- Real para Dólar \n" + "2- Real para Euro \n" + "3- sair");
            op= sc.nextInt();

            if (op==1) {
                System.out.println("Digite o valor em R$:");
                c.real = sc.nextDouble();
                System.out.printf("R$ "+c.real+" = U$ %.2f%n",c.dolar());

            } else if (op==2) {
                System.out.println("Digite o valor em R$:");
                c.real = sc.nextDouble();
                System.out.printf("R$ "+c.real+" = € %.2f%n",c.euro());

            } else if (op==3) {
                System.out.println("Fechando o programa...");

            } else
                System.out.println("Digite uma opção válida");

        } while(op!=3);

        sc.close();
    }
}
