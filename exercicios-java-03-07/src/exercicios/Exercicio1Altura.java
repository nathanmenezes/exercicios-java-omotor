package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1Altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura para saber se você é alto");
        while (true) {
            System.out.print("Altura em metros: ");

            Double altura = 0d;
            try {
                altura = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Erro no formato da altura digitada!");
                sc.next();
            }

            if (altura >= 1.80) {
                System.out.println("Você é alto(a)!");
                break;
            } else if (altura < 1.80 & altura != 0) {
                System.out.println("Você não é tão alto(a).");
                break;
            }
        }
        sc.close();
    }
}
