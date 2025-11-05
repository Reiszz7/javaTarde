package Atv20_ForEach;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite a palavra e sua categoria (exemplo arroz:alimento,...)");
        String respUsuario= sc.nextLine();

        String[] vetorGeral= respUsuario.split("[,:]");
        String[] vetorNome= new String[vetorGeral.length/2];
        String[] vetorCategoria= new String[vetorGeral.length/2];

        int indice1=0, indice2=0;
        for (int i=0; i< vetorGeral.length; i++) {
            if (i%2==0) {
                vetorNome[indice1]=vetorGeral[i];
                indice1++;
            } else {
                vetorCategoria[indice2]=vetorGeral[i];
                indice2++;
            }
        }

        String resp="";
        do {
            System.out.println("Digite qual lista deseja exibir (nome/categoria)");
            resp= sc.nextLine();
        } while (!resp.equalsIgnoreCase("nome") && !resp.equalsIgnoreCase("categoria"));

        if (resp.equalsIgnoreCase("nome")) {
            for (String indice : vetorNome) {
                System.out.println(indice);
            }
        } else {
            for (String indice : vetorCategoria) {
                System.out.println(indice);
            }
        }
        sc.close();
    }
}
