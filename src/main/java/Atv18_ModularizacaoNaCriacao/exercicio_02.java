package Atv18_ModularizacaoNaCriacao;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String conv;

        do {
            System.out.println("Digite qual medida de temperatura você deseja converter (Fahrenheit ou Celsius):");
             conv= sc.nextLine();
        } while (!conv.equalsIgnoreCase("Fahrenheit") && !conv.equalsIgnoreCase("Celsius"));

        System.out.println("Digite a temperatura em "+conv+":");
        double temp= sc.nextDouble();

        if (conv.equalsIgnoreCase("Fahrenheit")) {
            System.out.println(ConversorTemperatura(conv, temp)+" °C");
        } else
            System.out.println(ConversorTemperatura(conv, temp)+" °F");

    }

    public static double ConversorTemperatura(String medida, double x) {
        double conversao=0;

        if (medida.equalsIgnoreCase("Fahrenheit")) {
            conversao= (double) 5/9*(x-32);
        } else
            conversao= (x*1.8)+32;

        return conversao;
    }
}
