package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2Dirigir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Você possui carteira de motorista ?");

            System.out.println("[1] - Sim");
            System.out.println("[2] - Não");

            System.out.print("Digite a opção: ");
            Integer opcao = 0;
            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro no formato da opção!");
                sc.next();
            }

            switch (opcao) {
                case 1:
                    System.out.println("Você pode dirigir!");
                    return;
                case 2:
                    System.out.println("Você não pode dirigir!");
                    return;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }
    }
}
