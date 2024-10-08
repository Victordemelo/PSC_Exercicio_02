//@author victo

import java.util.Scanner;

public class PSC_Exercicio_02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salario, prestacao, emprestimo;

        System.out.println("Digite o valor do Salário: ");
        salario = leitor.nextDouble();
        System.out.println("Digite o valor da Prestação: ");
        prestacao = leitor.nextDouble();

        emprestimo = salario * 0.3;

        if (prestacao < emprestimo) {
            System.out.println("Empréstimo Concedido");
        } else {
            System.out.println("Empréstimo NEGADO");
        }

    }
}
