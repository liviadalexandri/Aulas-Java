package aula05;

import java.util.Scanner;

public class Exercicio1_Matrizes {

	public static void main(String[] args) {

		float[][] notas = new float[10][4];
    
        float[] medias = new float[10];
        
        Scanner leia = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as 4 notas do aluno " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = leia.nextFloat();  
            }
        }
        
        for (int i = 0; i < 10; i++) {
            float soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];  
            }
            medias[i] = soma / 4;  
        
        System.out.println("\nMédias dos alunos:");
        for (int m = 0; m < 10; m++) {
            System.out.printf("Aluno %d: %.1f\n", m + 1, medias[m]);
        }
        
        leia.close();
        }
	}
}
