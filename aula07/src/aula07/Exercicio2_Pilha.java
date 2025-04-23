package aula07;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2_Pilha {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n 📚📚📚📚📚 PILHA DE LIVROS 📚📚📚📚📚");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Sair do programa");
            System.out.print("\nEscolha uma opcao: ");
            opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String livro = leia.nextLine();
                    pilhaLivros.push(livro);
                    System.out.println(livro + " foi adicionado(a) à pilha.");
                    break;
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Livros na pilha:");
                        for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
                            System.out.println("- " + pilhaLivros.get(i));
                        }
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha de livros está vazia.");
                    } else {
                        String livroRemovido = pilhaLivros.pop();
                        System.out.println(livroRemovido + " foi retirado(a) da pilha.");
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
