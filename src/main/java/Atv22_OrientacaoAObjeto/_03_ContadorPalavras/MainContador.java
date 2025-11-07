package Atv22_OrientacaoAObjeto._03_ContadorPalavras;

import java.util.Scanner;

public class MainContador {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contador cont= new Contador();

        System.out.println("Digite uma frase para contar quantas palavras ela possui");
        cont.frase = sc.nextLine();

        System.out.println("A frase possui "+cont.contador()+" palavras");
        sc.close();
    }
}
