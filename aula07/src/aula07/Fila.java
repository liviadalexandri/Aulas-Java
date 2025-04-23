package aula07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		// Estrutura Queue - Cria a estrutura de Dados Fila
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Lívia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabricio");
		fila.add("Victor");
		
		// Exibimos a fila na tela
		System.out.println(fila);
		
		// Retiramos o elemento da fila - sempre o 1º
		fila.remove();
		
		// Adicionado para verificar se o 1º foi retirado da fila
		System.out.println(fila);
		
		// Adicionado ao final da fila
		fila.add("Thiago");
		
		System.out.println(fila);
		
		// Exibe o primeiro da fila no console
		System.out.println(fila.peek());
		
		// Poll mostra e remove o 1º elemento da fila
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		// Verifica se os elementos estão na fila
		System.out.println("A Maria está na fila?" + fila.contains("Maria"));
		System.out.println("O Carlos está na fila?" + fila.contains("Carlos"));
		
		// Verifica o tamanho da fila
		System.out.println("Qual é o tamanho da fila?" + fila.size());
		
		int contador = 0;
		
		// Realiza a busca pelo laço for
		for(var pessoa : fila) {
			contador ++;
			if (pessoa.equalsIgnoreCase("maria")) {
				System.out.printf("\nA Maria está em %dº lugar na fila:" , contador);
			}
				
		}
				
	}

}
