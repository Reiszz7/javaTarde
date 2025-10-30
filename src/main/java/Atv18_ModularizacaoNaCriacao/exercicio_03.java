package Atv18_ModularizacaoNaCriacao;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String msg;
        System.out.println("Digite a frase para contar as palavras");
        String frase= sc.nextLine();

        ContadorPalavras(frase);
        sc.close();
    }

    public static void ContadorPalavras (String frase) {
        String [] palavras= frase.split(" ");

        System.out.println("O total de palavras é: " +palavras.length);
    }
}