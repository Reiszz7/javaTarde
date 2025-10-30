package Atv18_ModularizacaoNaCriacao;

import java.util.Scanner;

public class exercicio_08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inv= 0;
        do {
            System.out.println("Digite o valor do investimento:");
            inv = sc.nextDouble();

            if (inv<=0){
                System.out.println("Digite um valor válido");
            }
        } while (inv<1);

        System.out.println("Digite a porcentagem dos juros:");
        double porcent= sc.nextInt();

        System.out.println("Digite o tempo (em anos) da aplicação");
        int t=  sc.nextInt();

        System.out.println(CalculadoraJurosCompostos(inv, porcent, t));
        sc.close();
    }

    public static double CalculadoraJurosCompostos (double capital, double porcent, int tempo) {
        double montante= capital;
         porcent/= 100;

        while (tempo>0){
            double juros= montante*porcent;
            montante+=juros;
            tempo--;
        }
        return montante;
    }
}
