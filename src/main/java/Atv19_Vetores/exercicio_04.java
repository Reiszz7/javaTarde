package Atv19_Vetores;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numeros= new int[6];
        int maior=0, menor=0;

        for (int i=0; i<6; i++) {
            System.out.println("Digite um número:");
            numeros[i]= sc.nextInt();
            if (i==0) {
                maior= numeros[i];
                menor= numeros[i];

            } else {
                if (numeros[i]>maior) {
                    maior= numeros[i];
                } else if (numeros[i]<menor) {
                    menor= numeros[i];
                }
            }
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
    }
}
