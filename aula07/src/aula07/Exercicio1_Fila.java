package aula07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1_Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> filaClientes = new LinkedList<String>();
		
		int opcao;

        do {
            System.out.println("\n✷✷✷✷ MENU BANCO ✷✷✷✷");
            System.out.println("1: Adicionar um novo cliente na fila");
            System.out.println("2: Listar todos os clientes na fila");
            System.out.println("3: Chamar uma pessoa da fila");
            System.out.println("0: Sair do programa");
            System.out.print("\nEscolha a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String nome = leia.nextLine();
                    filaClientes.add(nome);
                    System.out.println(nome + " foi adicionado(a) na fila.");
                    break;
                case 2:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String cliente : filaClientes) {
                            System.out.println("- " + cliente);
                        }
                    }
                    break;
                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia. Não há clientes para chamar.");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println(clienteChamado + " foi chamado(a) e retirado(a) da fila.");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        leia.close();
    }
}
