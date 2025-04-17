package aula04;

import java.util.Scanner;

public class Exercicio5_DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
       
		int numero, soma = 0;

        System.out.println("Digite números inteiros (caso queira encerrar digite 0:)");

        do {
            System.out.print("Número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);

        System.out.println("\nSoma dos números positivos: " + soma);

        leia.close();
    }
}