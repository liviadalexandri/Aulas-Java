package aula04;

import java.util.Scanner;

public class Exercicio3_While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int menores21 = 0, maiores50 = 0;

		System.out.println("Digite uma idade (caso queira encerrar digite uma idade negativa):");

		System.out.print("Idade: ");
		int idade = leia.nextInt();

		while (idade >= 0) {
		if (idade < 21) {
		menores21++;
		} else if (idade > 50) {
		maiores50++;
		}

		System.out.print("Idade: ");
		idade = leia.nextInt();
		}

		System.out.println("\nTotal de pessoas com menos de 21 anos: " + menores21);
		System.out.println("Total de pessoas com mais de 50 anos: " + maiores50);

		leia.close();
		}
	}

