package aula03;

import java.util.Scanner;

public class Exercicio5_Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número correspondente ao produto (1 a 6): ");
        int codigo = leia.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = leia.nextInt();

        String produto = "";
        double valor = 0.0;

        switch (codigo) {
            
        case 1:
                produto = "Cachorro Quente";
                valor = 10.00;
                break;
            
        case 2:
                produto = "X-Salada";
                valor = 15.00;
                break;
            
        case 3:
                produto = "X-Bacon";
                valor = 18.00;
                break;
            
        case 4:
                produto = "Bauru";
                valor = 12.00;
                break;
            
        case 5:
                produto = "Refrigerante";
                valor = 8.00;
                break;
            
        case 6:
                produto = "Suco de laranja";
                valor = 13.00;
                break;
            
        default:
                System.out.println("Código inválido!");
                leia.close();
                return;
        }

        double total = valor * quantidade;
        System.out.printf("Produto: %s\nTotal a pagar: R$ %.2f\n", produto, total);

        leia.close();
    }
}