package exercicios;

import java.util.Scanner;

public class Exercicio7TamanhoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string qualquer para saber seu tamanho");

        System.out.print("String: ");
        String string = sc.nextLine();

        System.out.println("O tamanho dessa String é de: " + string.length());

        sc.close();
    }
}
