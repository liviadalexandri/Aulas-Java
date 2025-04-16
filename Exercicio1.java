package aula02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario, abono, novosalario;
		
		Scanner leia = new Scanner(System.in);		
		
		System.out.println("Digite seu salário atual: ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o valor do abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		System.out.printf("\nNovo salário: %.2f", novosalario);
		}

}
