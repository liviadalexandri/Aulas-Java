package aula03;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a nota do aluno:");
		float nota = leia.nextFloat();
		
		if (nota >= 7 ) {
			System.out.println("\n Aluno Aprovado!");
			
		}else if((nota <=7) && (nota >= 5)){
			
			System.out.println("\n Aluno de Exame!");
			
		}else{
			System.out.println("\n Aluno Reprovado!");
		}
		
		leia.close();
	}
}