package calculadora;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int x = leitor.nextInt();
        int y = leitor.nextInt();
        leitor.close();
        System.out.println(calculadora.soma(x, y));
    }
}
