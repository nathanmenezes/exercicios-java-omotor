package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Digite 3 números para ser exibido sua média");

            Float n1 = 0f;
            Float n2 = 0f;
            Float n3 = 0f;

            try {
                System.out.print("Número 1: ");
                n1 = sc.nextFloat();
                System.out.print("Número 2: ");
                n2 = sc.nextFloat();
                System.out.print("Número 3: ");
                n3 = sc.nextFloat();
                Float media = (n1+n2+n3)/3;
                System.out.printf("A média entre esses 3 números é de: %.2f", media);
                break;
            }catch (InputMismatchException e){
                System.out.println("Formato dos números está errado!");
                sc.next();
            }
        }
    }
}
