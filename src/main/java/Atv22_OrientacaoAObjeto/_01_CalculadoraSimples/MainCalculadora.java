package Atv22_OrientacaoAObjeto._01_CalculadoraSimples;

import java.util.Scanner;

public class MainCalculadora {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculos n= new Calculos();
        String operacao;

        System.out.println("Digite o primeiro número");
        n.x = sc.nextDouble();
        sc.nextLine();

        do {
            System.out.println("Digite a operação (+, -, * ou /)");
            operacao = sc.nextLine();
        } while (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/"));

        System.out.println("Digite o segundo número");
        n.y = sc.nextDouble();

        if (operacao.equals("+")) {
            System.out.println(n.soma());
        } else if (operacao.equals("-")) {
            System.out.println(n.subtracao());
        } else if (operacao.equals("*")) {
            System.out.println(n.multiplicacao());
        } else
            System.out.println(n.divisao());

        sc.close();
    }
}