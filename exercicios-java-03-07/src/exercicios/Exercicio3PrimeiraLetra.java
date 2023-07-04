package exercicios;

import java.util.Scanner;

public class Exercicio3PrimeiraLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome para verificar se a primeira letra dele é uma vogal");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        for (char vogal: vogais) {
            if(nome.toLowerCase().charAt(0) == vogal){
                System.out.println("A primeira letra do seu nome é uma vogal!");
                System.out.println("Vogal: " + vogal);
                return;
            }
        }

        System.out.println("A primeira letra do seu nome não é uma vogal!");

        sc.close();
    }
}
