package Atv18_ModularizacaoNaCriacao;

import java.util.Scanner;

public class exercicio_10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual opção de conversão  deseja fazer");
        System.out.println("1- Real para Dólar");
        System.out.println("2- Real para Euro");
        int opcao = sc.nextInt();
        System.out.println("-----------------------------------");

        System.out.println("Digite o valor em Reais:");
        double val = sc.nextDouble();

        ConversorMoeda(opcao, val);
    }

    public static void ConversorMoeda (int op, double valor) {
        double valorConvertido;
        String resposta;

        if (op == 1) {
            valorConvertido= valor/5.36;
            System.out.printf("R$ "+valor+" = US$ %.2f%n",valorConvertido);
        } else {
            valorConvertido= valor/6.22;
            System.out.printf("R$ "+valor+" = € %.2f%n",valorConvertido);
        }
    }
}
