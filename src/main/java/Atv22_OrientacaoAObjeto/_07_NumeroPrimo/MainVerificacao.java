package Atv22_OrientacaoAObjeto._07_NumeroPrimo;

import java.util.Scanner;

public class MainVerificacao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VerificadorPrimo verif=new VerificadorPrimo();

        System.out.println("Digite o número para verificar se é primo");
        verif.n= sc.nextInt();
        System.out.println(verif.n+verif.verificador());
        sc.close();
    }
}
