package Exemplos;

import java.util.ArrayList;

public class listas {
    public static void main(String[] args) {

    // Array tem tamanho FIXO
        int[] numeros = new int[5]; // 5 posições
        String[] nomes = {"Ana", "João", "Maria"};

    // Lista tem tamanho VARIÁVEL
        ArrayList<String> nomess = new ArrayList<>();

        ArrayList<String> lista = new ArrayList<>();

    // ADICIONAR elementos
        lista.add("Maria");     // ["Maria"]
        lista.add("João");      // ["Maria", "João"]
        lista.add(1, "Ana");    // ["Maria", "Ana", "João"] - na posição 1

    // ACESSAR elementos
        String nome = lista.get(0); // "Maria"

    // REMOVER elementos
        lista.remove(0);        // Remove "Maria"
        lista.remove("João");   // Remove pelo conteúdo

    // TAMANHO da lista
        int tamanho = lista.size(); // 2

    // PERCORRER a lista (com FOR )
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
