package Atv18_ModularizacaoNaCriacao;

import java.util.Scanner;

public class exercicio_09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade para saber sua classificação");
        int idade = sc.nextInt();

        System.out.println("Sua classificação de idade é: "+ClassificadorIdade(idade));
        sc.close();
    }

    public static String ClassificadorIdade (int x) {
        String classificacao = "";

        if (x<=12) {
            classificacao = "Infantil";
        } else if (x<18) {
            classificacao = "Adolescente";
        } else if (x<60) {
            classificacao = "Adulto";
        } else
            classificacao = "Idoso";

        return  classificacao;
    }
}
