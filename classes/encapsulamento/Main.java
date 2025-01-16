package encapsulamento;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Privado privado = new Privado();
        // privado.nome;
        //
        privado.setNome("Leandro");
        System.out.println("Nome: " + privado.getNome());
    }
}
