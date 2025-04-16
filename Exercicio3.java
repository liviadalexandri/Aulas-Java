package aula02;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salariobruto, adcnoturno, horaextra, descontos, salarioliq;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário bruto:");
		salariobruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno:");
		adcnoturno = leia.nextFloat();
		
		System.out.println("Digite o valor ganho em horas extra:");
		horaextra = leia.nextFloat();
		
		System.out.println("Digite o valor do desconto mensal:");
		descontos = leia.nextFloat();
		
		salarioliq = (salariobruto + adcnoturno + (horaextra * 5) - descontos);
		
		System.out.printf("Seu salário líquido desse mês será: %.2f", salarioliq);
		

	}

}
