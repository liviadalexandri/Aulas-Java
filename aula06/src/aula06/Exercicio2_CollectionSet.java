package aula06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2_CollectionSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número inteiro que deseja encontrar:");
		int numero = leia.nextInt();
		
		if(numeros.contains(numero)) {
			System.out.println("Número " + numero + " encontrado!");
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        leia.close();		
        }

}
