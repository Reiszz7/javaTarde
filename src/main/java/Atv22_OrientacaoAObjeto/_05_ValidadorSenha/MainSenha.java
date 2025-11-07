package Atv22_OrientacaoAObjeto._05_ValidadorSenha;

import java.util.Scanner;

public class MainSenha {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validador val= new Validador();

        do {
            System.out.println("Digite sua senha:");
            val.senha = sc.nextLine();
            System.out.println(val.Validador());
        } while (!val.Validador().equals("Senha válida"));
    }
}
