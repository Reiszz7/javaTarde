package Atv22_OrientacaoAObjeto._06_CalculadoraMedia;

import java.util.Scanner;

public class MainCalculadora {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Media m= new Media();

        System.out.println("Digite quantas notas gostaria de digitar:");
        m.n = sc.nextInt();

        for (int i=1; i<=m.n; i++){
            System.out.println("Digite a "+i+"º nota:");
            m.soma += sc.nextDouble();
        }

        System.out.println("Sua média é igual a " + m.media());
        sc.close();
    }
}
