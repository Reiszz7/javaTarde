package Atv22_OrientacaoAObjeto._09_ClassificadorIdade;

import java.util.Scanner;

public class MainIdade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Classificador idade = new Classificador();

        do {
            System.out.println("Digite sua idade para verificar sua classificação:");
            idade.i = sc.nextInt();

            if (idade.i < 0) {
                System.out.println("Digite uma idade válida");
            }
        } while (idade.i < 0);

        System.out.println("Sua classificação de idade é: "+idade.classificador());
        sc.close();
    }
}
