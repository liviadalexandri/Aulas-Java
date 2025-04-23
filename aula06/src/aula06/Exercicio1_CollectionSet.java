package aula06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1_CollectionSet {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			Set<Integer> numeros = new HashSet<>(10);
			int numero, i;
			for(i = 0; i < 10; i++) {
				System.out.println("Digite um número sem repeti-lo:");
				numero = leia.nextInt();
				if (numeros.contains(numero)) {
					System.out.println("Número repetido!");
				}else {
					numeros.add(numero);
				}
			}
			System.out.println("Listar dados do Set:");
			
			Iterator<Integer> iterator = numeros.iterator();
			
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}

			leia.close();
		}
	 
	}	
			