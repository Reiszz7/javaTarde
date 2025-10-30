package Atv18_ModularizacaoNaCriacao;

import javax.xml.transform.Source;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char resp;

        do {
            System.out.println("Digite o primeiro número:");
            double n1 = sc.nextDouble();

            System.out.println("Digite a operação (+, -, * ou /):");
            sc.nextLine();
            String operacao = sc.nextLine();


            System.out.println("Digite o segundo número:");
            double n2 = sc.nextDouble();

            System.out.println(Calculadora(operacao, n1, n2));

            System.out.println("Deseja sair do programa (s/n)");
            resp= sc.next().charAt(0);

        } while (resp!='s');
        sc.close();
    }

    public static double Calculadora (String op, double x, double y) {
        double resul=0;

        if (op.equals("+")) {
            resul= x+y;
        } else if (op.equals("-")) {
            resul= x-y;
        } else if (op.equals("*")) {
            resul= x*y;
        } else {
            if (y==0) {
                System.out.println("Não é possível dividir um númeo por 0");
            } else
                resul= x/y;
        }
        return resul;
    }
}
