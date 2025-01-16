package Sobrecarga;

/**
 * Telao
 */
public class Telao {
    // public int numero;
    // public String nome;

    public void exibir(int numero) {
        System.out.println("Numero: " + numero);

    }

    public void exibir(int numero, String nome) {
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
    }

}
