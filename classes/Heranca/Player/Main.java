package Heranca.Player;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Personagem personagem = new Personagem();

        personagem.setNome("Wolverine");
        personagem.setEmail("wolverine@gmail.com");
        personagem.setNivel(10);

        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Email: " + personagem.getEmail());
        System.out.println("Nivel inicial: " + personagem.getNivel());
        personagem.aumentaUmNivel();
        System.out.println("Nivel Aumentado: " + personagem.getNivel());
    }
}
