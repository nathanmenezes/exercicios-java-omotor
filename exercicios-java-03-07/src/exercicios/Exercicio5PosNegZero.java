package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número para verificar se ele é positivo, negativo ou igual a zero ");

            Double n1 = null;

            try {
                System.out.print("Número 1: ");
                n1 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Formato do número está errado!");
                sc.next();
            }

            try {
                if (n1 == 0) {
                    System.out.println("Número igual a zero!");
                    break;
                } else if (n1 > 0) {
                    System.out.println("Número positivo!");
                    break;
                } else if (n1 < 0) {
                    System.out.println("Número negativo!");
                    break;
                }
            } catch (NullPointerException ignored) {
            }
        }
    }
}
