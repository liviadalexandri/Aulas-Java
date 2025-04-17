package aula04;

import java.util.Scanner;

public class Exercicio2_For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pares = 0, impares = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = leia.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nTotal de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        leia.close();
		

	}

}
