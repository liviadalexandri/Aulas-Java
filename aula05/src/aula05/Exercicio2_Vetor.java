package aula05;

import java.util.Scanner;

public class Exercicio2_Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int[] valores = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = leia.nextInt();
        }
        
        int soma = 0;
        double media;
        
        System.out.print("\nElementos ímpares: ");
        for (int i = 1; i < valores.length; i += 2) {
            System.out.print(valores[i] + " ");
        }

        System.out.print("\nElementos pares: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                System.out.print(valores[i] + " ");
            }
            soma += valores[i];
        }

        media = (double) soma / valores.length; 
        
        System.out.println("\nSoma: " + soma);

        System.out.println("Média: " + media);
        
        leia.close();
    }
}

