package Heranca.Arma;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Arma arma = new Arma();
        Espada espada = new Espada();

        System.out.println("Digite o tamanho da espada: ");
        espada.setTamanho(leitor.nextLine());
        System.out.println("DIgite o material da lâmina: ");
        espada.setLamina(leitor.nextLine());
        leitor.close();

        System.out.println("Tamanho: " + espada.getTamanho());
        System.out.println("Material: " + espada.getLamina());

    }
}
