package Treino;

import java.util.ArrayList;
import java.util.Scanner;

public class tarefasLista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String simNao;

        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("Arrumar casa");
        tarefas.add("Lavar vasilhas");
        tarefas.add("Lavar roupas");
        tarefas.add("Secar roupas");
        tarefas.add("Lavar banheiro");

        System.out.println("Sua mae deixou algumas tarefas para voce fazer, e que devem ser feitas na ordem pedida!");

        System.out.println("Deseja ver as tarefas?");
        simNao = sc.nextLine();

        if (simNao.equals("sim")) {

            System.out.println(tarefas);
            System.out.println("Total de tarefas restando para fazer: " + tarefas.size());

            // ENQUANTO ainda tiver tarefas
            while (tarefas.size() > 0) {
                String tarefaAtual = tarefas.get(0); // Sempre pega a primeira tarefa

                System.out.println("Voce ja realizou a tarefa: " + tarefaAtual + " ?");
                simNao = sc.nextLine();

                if (simNao.equals("sim")) {
                    tarefas.remove(0); // Sempre remove a PRIMEIRA

                    if (tarefas.size() > 0) {
                        
                        System.out.println("Otimo! Restam as tarefas: " + tarefas);
                        System.out.println("Ainda restam " + tarefas.size() + " tarefas!");
                    } else {
                        System.out.println("Parabens, voce concluiu todas as tarefas!!");
                    }
                } else {
                    System.out.println("Entao a realize, preguicoso.");
                    // Não fecha o scanner aqui, deixa continuar
                }
            }
        } else {
            System.out.println("Se eu fosse voce iria olhar, se nao alguem vai apanhar...");
        }

        sc.close();
    }
}