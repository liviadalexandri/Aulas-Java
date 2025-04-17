package aula03;

import java.util.Scanner;

public class Exercicio6_Switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        System.out.print("Nome do Colaborador: ");
        String nome = leia.nextLine();

        System.out.print("Digite o código do cargo de 1 a 6: ");
        int codigo = leia.nextInt();

        System.out.print("Salário atual (R$): ");
        float salario = leia.nextFloat();

        float reajuste = 0;
        String cargo = "";

        switch (codigo) {
            case 1:
                cargo = "Gerente";
                reajuste = 0.10f;
                break;
            case 2:
                cargo = "Vendedor";
                reajuste = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                reajuste = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                reajuste = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                reajuste = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                reajuste = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido!");
                leia.close();
                return;
        }

        float novoSalario = salario + (reajuste * salario);

        System.out.println("\n--- DADOS DO COLABORADOR ---");
        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo atual: " + cargo);
        System.out.printf("Novo Salário: R$ %.2f\n", novoSalario);

        leia.close();
    }
}