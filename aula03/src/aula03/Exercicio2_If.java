package aula03;

import java.util.Scanner;

public class Exercicio2_If {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leia.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é PAR.");
        } else {
            System.out.println("O número é ÍMPAR.");
        }

        if (numero > 0) {
            System.out.println("O número é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("O número é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO (nem positivo nem negativo).");
        }

        leia.close();
    }
}
