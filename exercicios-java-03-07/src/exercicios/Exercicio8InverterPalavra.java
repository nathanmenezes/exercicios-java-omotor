package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8InverterPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra qualquer para inverter ela");

        System.out.print("Palavra: ");
        String palavra = sc.nextLine();

        List<Character> letras = new ArrayList<>();
        
        for (int i = palavra.length() - 1; i >= 0; i--) {
            letras.add(palavra.charAt(i));
        }
        StringBuilder palavraInvertida = new StringBuilder();

        for (Character letra: letras) {
            palavraInvertida.append(letra.toString());
        }

        System.out.println(palavraInvertida);

        sc.close();
    }
}
