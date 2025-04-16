package aula02;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, dif;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo valor:");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro valor:");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto valor:");
		n4 = leia.nextFloat();
		
		dif = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença total é: %.1f", dif);
		
		

	}

}
