package fight;

/**
 * lutador
 */
public class Lutador {

    public String nome;

    public Lutador(String nome) {
        this.nome = nome;

    }

    public void soco() {
        System.out.println(this.nome + " deu um soco!!");
    }
}
