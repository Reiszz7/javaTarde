package Exemplos;
import java.util.Scanner;
public class contador1milhao {
    public static void main(String[] args) {

        Scanner scaralhadas = new Scanner(System.in);
        int contador = 1;

        System.out.println("Qual número você gostaria de começar a contagem até um MILHASSO? ");

        String resp = scaralhadas.nextLine();

        int n = Integer.parseInt(resp);

        while (n<=1000000){

            System.out.println(n);
            n=+1;
        }
    }
}
