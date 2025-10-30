package Atv18_ModularizacaoNaCriacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<Double>();
        double nota;
        char resp;

        do {
            System.out.println("Digite sua nota para calcular a média:");
            nota = sc.nextDouble();

            if (nota<0) {
                System.out.println("Digite uma nota válida!");
            } else
                notas.add(nota);


            System.out.println("Deseja adicionar mais notas?");
            resp = sc.next().charAt(0);

        } while (resp != 'n');

        System.out.println("Sua média é: "+CalculadoraMedia(notas));

    }

    public static double CalculadoraMedia(ArrayList<Double> listaNotas) {
        int size = listaNotas.size();
        double soma = 0;

        for (int i=0; i<size; i++) {
            soma += listaNotas.get(i);
        }

        double media= soma / size;
        return media;
    }
}
