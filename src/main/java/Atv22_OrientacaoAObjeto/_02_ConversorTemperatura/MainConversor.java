package Atv22_OrientacaoAObjeto._02_ConversorTemperatura;

import java.util.Scanner;

public class MainConversor {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Conversor conv= new Conversor();
        int escolha;

        do {
            System.out.println("Escolha qual conversão  deseja fazer \n" + "1- Celsius para Fahrenheit \n" + "2- Fahrenheit para Celsius \n" + "3- sair");
            escolha= sc.nextInt();

            if (escolha==1) {
                System.out.println("Digite a temperatura em ºC:");
                conv.c= sc.nextDouble();
                System.out.println(conv.celsiusFarenheit());
            }else if (escolha==2) {
                System.out.println("Digite a temperatura em ºF:");
                conv.f= sc.nextDouble();
                System.out.println(conv.farenheitCelsius());
            } else if (escolha==3) {
                System.out.println("Fechando o programa...");
            } else  {
                System.out.println("Digite uma opção válida");
            }
        } while (escolha!=3);

        sc.close();
    }
}
