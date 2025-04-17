package aula03;

import java.util.Scanner;

public class Exercicio1_If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite um valor para A: ");
        int A = leia.nextInt();

        System.out.print("Digite um valor para B: ");
        int B = leia.nextInt();

        System.out.print("Digite um valor para C: ");
        int C = leia.nextInt();

        int soma = A + B;

        if (soma > C) {
            System.out.println("A soma de A + B é MAIOR que o valor de C.");
        } else if (soma < C) {
            System.out.println("A soma de A + B é MENOR que o valor de C.");
        } else {
            System.out.println("A soma de A + B é IGUAL ao valor de C.");
        }

       leia.close();

	}

}
