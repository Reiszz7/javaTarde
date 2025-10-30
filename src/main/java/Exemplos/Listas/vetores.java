package Exemplos.Listas;

import java.util.Locale;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        // quantidade de números presentes no vetor
        int n= sc.nextInt();
        double[] vect= new double[n];

        // for para adicionar um valor double no index i do vetor
        for (int i=0; i<n; i++) {
            vect[i]= sc.nextDouble();
        }

        // soma todos os valores do vetor
        double sum= 0.0;
        for (int i=0; i<n; i++) {
            sum+= vect[i];
        }

        // faz a média dos valores do vetor
        double avg= sum/n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        sc.close();
    }
}
