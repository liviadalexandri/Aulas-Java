package aula05;

import java.util.Scanner;

public class Exercicio1_Vetor {

	public static void main(String[] args) {
		
		int[] valores = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o número a ser pesquisado: ");
        int numero = leia.nextInt();
        
        int posicao = -1;
        
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == numero) {
                posicao = i;
                break;
            }
        }
        
        if (posicao != -1) {
            System.out.println("O número " + numero + " está na posição " + posicao + ".");
        } else {
            System.out.println("Não foi encontrado!");
        }
        
        leia.close();
    }
}
		