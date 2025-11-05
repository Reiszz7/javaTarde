package Atv20_ForEach;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        String resp;
        Scanner sc = new Scanner(System.in);
        String[] nomesCadastro = new String[20];
        do {
            System.out.println("Qual opção você deseja ? \n1 - Cadastrar nomes\n2 - Listar nomes\n3 - Listar os nomes baseado na letra escolhida\n0 - Sair");
            String respostaUsuario = sc.nextLine();
            if (respostaUsuario.equalsIgnoreCase("1")) {
                for (int i = 0; i < nomesCadastro.length; i++) {
                    System.out.println("Digite o "+i + " nome: ");
                    nomesCadastro[i] = sc.nextLine();
                }
                System.out.println("Nomes cadastrados com sucesso !!!");
            }else if (respostaUsuario.equalsIgnoreCase("2")){
                for (String indice : nomesCadastro){
                    System.out.println(indice);
                }

            } else if (respostaUsuario.equalsIgnoreCase("3")) {
                System.out.println("Qual letra você deseja procurar:");
                String letraProcura = sc.nextLine();

                for (String palavra : nomesCadastro) {
                    String[] letras= palavra.split("");
                    if (letras[0].equalsIgnoreCase(letraProcura)) {
                        System.out.println(palavra);
                    }
                }

            } else if (respostaUsuario.equalsIgnoreCase("0")) {
                break;
            }else {
                System.out.println("Digite um comando correto");
            }
            System.out.println("Deseja fazer algo a mais ? (sim/não)");
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("Sistema encerrando...");
    }
}
