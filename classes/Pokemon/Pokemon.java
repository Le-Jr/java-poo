package Pokemon;

import java.util.Random;

/**
 * Pokemon
 */
public class Pokemon {

    public String nome;
    public String tipo;
    public int nivel;

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = geraAleatorio(1, 10);
    }

    public int geraAleatorio(int min, int max) {
        Random aleatorio = new Random();
        return min + aleatorio.nextInt(max - min + 1);
    }

    public void imprimePoke() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Nível: " + this.nivel);
    }

}
