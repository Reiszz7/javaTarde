package Atv17_ModularizacaoClassesEstaticas;

import java.util.Random;
import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        do {


            int x = rd.nextInt(31);

            velocidade(x);
        } while (true);
    }
    public static void velocidade (int est) {

        if (est<10) {
            System.out.println("Esteira na velocidade lenta");
        }
        else if (est<=20) {
            System.out.println("velocidade média");
        }
        else
            System.out.println("Velocidade rápida");
    }
}
