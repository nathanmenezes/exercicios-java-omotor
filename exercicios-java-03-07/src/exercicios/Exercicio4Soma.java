package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Digite dois números para ser exibido sua soma");

            Double n1 = 0d;
            Double n2 = 0d;

            try {
                System.out.print("Número 1: ");
                n1 = sc.nextDouble();
                System.out.print("Número 2: ");
                n2 = sc.nextDouble();
                System.out.println("A soma desses dois números é de: " + (n1 + n2));
                sc.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Formato dos números está errado!");
                sc.next();
            }
        }
    }
}
