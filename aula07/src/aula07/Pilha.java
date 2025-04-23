package aula07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// Cria a Estrutura de dados Pilha
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunicação não violenta");
		pilha.add("IT: A coisa");
		pilha.add("A coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diário de um banana");
		pilha.add("Senhor dos Anéis");
		pilha.add("Código da Vinci");
		
		//Solicita ao usuário para adicionar a pilha
		System.out.println("Digite o título de um livro:");
		pilha.add(leia.nextLine());
		
		
		System.out.println(pilha);
		
		// Retira um elemento da pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		// Adiciona um elemento na pilha
		pilha.push("Roube como um Artista");
		
		// Exibe o elemento que está no topo
		System.out.println(pilha.peek());
		
		// Verifica se o elemento existe na pilha
		System.out.println("O Livro Diário de um Banana existe na pilha?" + pilha.contains("Diário de um Banana"));
		
		leia.close();
		
	}

}
