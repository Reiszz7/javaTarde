package Exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listas_05_ordenar {
    static void main() {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(24);
        numeros.add(58);
        numeros.add(30);
        numeros.add(45);

        // Para ordenar a lista usamos o método .sort(), da classe Collections
        Collections.sort(numeros);

        // O método organiza a lista em ordem crescente como mostrado no print
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
